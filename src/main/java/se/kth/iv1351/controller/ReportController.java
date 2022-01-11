package se.kth.iv1351.controller;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.dao.ReportMapper;
import se.kth.iv1351.model.Report;

import java.util.List;

/**
 * A controller which delegates functions regarding analytical reports
 */
public class ReportController {

    private SqlSessionFactory sqlSessionFactory;

    public ReportController(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    /**
     * Returns a report of ensembles 1 week after input date
     *
     * @param startTime input date ISO-8601 format
     * @return the generated report
     */
    public List<Report> getReport(String startTime) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        ReportMapper mapper = sess.getMapper(ReportMapper.class);
        return mapper.getEnsembleReport(startTime);
    }
}
