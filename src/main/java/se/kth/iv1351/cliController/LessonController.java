package se.kth.iv1351.cliController;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.dao.LessonMapper;

public class LessonController implements Controller {
    private SqlSessionFactory sqlSessionFactory;

    public LessonController(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public void insert(String id) {

    }

    public void delete(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        LessonMapper mapper = sess.getMapper(LessonMapper.class);
        mapper.deleteLesson(Integer.parseInt(id));

    }

    public Object get(String id) {
        SqlSession sess = this.sqlSessionFactory.openSession();
        LessonMapper mapper = sess.getMapper(LessonMapper.class);
        return mapper.selectLesson(Integer.parseInt(id));
    }
}