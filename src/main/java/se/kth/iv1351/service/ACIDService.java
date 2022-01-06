package se.kth.iv1351.service;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.cliController.Controller;

public class ACIDService {

    SqlSessionFactory sqlSessionFactory;

    public ACIDService (SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public runInTransaction() {
        SqlSession sess = sqlSessionFactory.openSession();
        try {
            ...
        } catch (Exception e) {
            sess.rollback();
            throw e;
        }
        sess.commit();
    }
}
