package se.kth.iv1351.controller;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.dao.ReportMapper;
import se.kth.iv1351.model.Report;

import java.util.List;

public class ReportController {

    private SqlSessionFactory sqlSessionFactory;

    public ReportController(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public List<Report> getReport(String startTime) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        ReportMapper mapper = sess.getMapper(ReportMapper.class);
        return mapper.getEnsembleReport(startTime);
    }
}
