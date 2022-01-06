package se.kth.iv1351.cliController;

import org.apache.ibatis.session.SqlSessionFactory;

public class LeaseController implements Controller {

    private SqlSessionFactory sqlSessionFactory;
    public LeaseController(SqlSessionFactory sqlSessionFactory) {
    }

    public void insert(String id) {

    }

    public void delete(String id) {

    }

    public Object get(String id) {
        return null;
    }
}
