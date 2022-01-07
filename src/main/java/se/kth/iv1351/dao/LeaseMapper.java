package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.Lease;

@Mapper
public interface LeaseMapper {
    Lease selectLease(Integer leaseid);
    void insertLease(Lease lease);
    void updateLease(Lease lease);
    Lease selectActiveLeaseStudent(Integer studentId);
}
