package se.kth.iv1351.cliController;

import org.apache.ibatis.session.SqlSessionFactory;

public class BookingController implements Controller {
    private SqlSessionFactory sqlSessionFactory;

    public BookingController(SqlSessionFactory sqlSessionFactory) {
    }

    public void insert(String id) {

    }

    public void delete(String id) {

    }

    public Object get(String id) {
        return null;
    }
}