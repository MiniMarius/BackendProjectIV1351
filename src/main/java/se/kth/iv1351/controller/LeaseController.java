package se.kth.iv1351.controller;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.dao.LeaseMapper;
import se.kth.iv1351.dao.RentalInstrumentMapper;
import se.kth.iv1351.model.Lease;
import se.kth.iv1351.model.RentalInstrument;
import se.kth.iv1351.util.IdGenerator;
import se.kth.iv1351.util.TimestampGenerator;

import java.util.List;

/**
 * A controller which delegates functions regarding student leases to responsible layers
 */
public class LeaseController {

    private SqlSessionFactory sqlSessionFactory;

    public LeaseController(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public List<RentalInstrument> listRentalInstruments() {
        SqlSession sess = this.sqlSessionFactory.openSession();
        RentalInstrumentMapper mapper = sess.getMapper(RentalInstrumentMapper.class);
        return mapper.selectAllRentalInstruments();
    }

    /**
     * Creates a new lease of rental instrument for student.
     *
     * @param studentId the id corresponding to student
     * @param rentalInstrumentId the instrument which the student wants to rent
     * @param startTime start time of lease
     * @param endTime end time of lease
     * @return the newly created lease from database
     * @throws Exception thrown if already active instrument rental
     */
    public Lease create(String studentId, String rentalInstrumentId, String startTime, String endTime) throws Exception {
        Integer newId = IdGenerator.generate();
        Lease lease = new Lease(newId, startTime, endTime, Integer.parseInt(rentalInstrumentId), Integer.parseInt(studentId));
        SqlSession sess = sqlSessionFactory.openSession();
        LeaseMapper mapper = sess.getMapper(LeaseMapper.class);
        try {
            Lease activeLease = mapper.selectActiveLeaseStudent(Integer.parseInt(studentId));
            if (activeLease != null) {
                throw new Exception(String.format("Student already has an active instrument rental %s", activeLease.getId()));
            }
            mapper.insertLease(lease);
        } catch (Exception e) {
            sess.rollback();
            throw e;
        }
        sess.commit();
        return get(newId);
    }

    /**
     * Terminates a student rental
     *
     * @param id the id for the lease
     * @return the rental from database with an updated end time
     * @throws Exception general exception
     */
    public Lease terminateLease(String id) throws Exception {
        SqlSession sess = this.sqlSessionFactory.openSession();
        LeaseMapper mapper = sess.getMapper(LeaseMapper.class);
        Lease lease = mapper.selectLease(Integer.parseInt(id));
        String newEndTime = TimestampGenerator.generate();
        return update(lease.getId().toString(), lease.getStudentId().toString(), lease.getRentalInstrumentId().toString(), lease.getStartTime().toString(), newEndTime);
    }

    /**
     * Updates a rental with new attribute values
     *
     * @param id id for the lease
     * @param studentId id corresponding to student
     * @param rentalInstrumentId the rental instrument to be rented
     * @param startTime start time of lease
     * @param endTime end time of lease
     * @return the newly updated lease
     * @throws Exception
     */
    public Lease update(String id, String studentId, String rentalInstrumentId, String startTime, String endTime) throws Exception {
        SqlSession sess = sqlSessionFactory.openSession();
        LeaseMapper mapper = sess.getMapper(LeaseMapper.class);
        try {
            Lease lease = mapper.selectLease(Integer.parseInt(id));
            lease.setStartTime(startTime);
            lease.setEndTime(endTime);
            lease.setStudentId(Integer.parseInt(studentId));
            lease.setRentalInstrumentId(Integer.parseInt(rentalInstrumentId));
            mapper.updateLease(lease);
        } catch (Exception e) {
            sess.rollback();
            throw e;
        }
        sess.commit();
        return get(Integer.parseInt(id));
    }

    /**
     * Returns information about a lease
     *
     * @param id id for the lease
     * @return the selected lease
     */
    public Lease get(Integer id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        LeaseMapper mapper = sess.getMapper(LeaseMapper.class);
        return mapper.selectLease(id);
    }
}
