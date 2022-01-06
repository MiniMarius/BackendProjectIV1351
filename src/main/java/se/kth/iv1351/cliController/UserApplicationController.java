package se.kth.iv1351.cliController;

import org.apache.ibatis.session.SqlSessionFactory;

public class UserApplicationController implements Controller {
    private SqlSessionFactory sqlSessionFactory;

    public UserApplicationController(SqlSessionFactory sqlSessionFactory) {
    }

    public void insert(String id) {

    }

    public void delete(String id) {

    }

    public Object get(String id) {
        return null;
    }
}