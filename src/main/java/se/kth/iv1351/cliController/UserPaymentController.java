package se.kth.iv1351.cliController;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.dao.UserPaymentMapper;

public class UserPaymentController implements Controller {
    private SqlSessionFactory sqlSessionFactory;

    public UserPaymentController(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public void insert(String id) {

    }

    public void delete(String id) {

    }

    public Object get(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        UserPaymentMapper mapper = sess.getMapper(UserPaymentMapper.class);
        return mapper.selectUserPayment(Integer.parseInt(id));
    }
}