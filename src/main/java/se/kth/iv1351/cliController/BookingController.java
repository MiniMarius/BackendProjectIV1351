package se.kth.iv1351.cliController;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.dao.BookingMapper;
import se.kth.iv1351.dao.UserMapper;

public class BookingController implements Controller {
    private SqlSessionFactory sqlSessionFactory;

    public BookingController(SqlSessionFactory sqlSessionFactory) {
    }

    public void insert(String id) {

    }

    public void delete(String id) {

    }

    public Object get(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        BookingMapper mapper = sess.getMapper(BookingMapper.class);
        return mapper.selectBooking(Integer.parseInt(id));
    }
}