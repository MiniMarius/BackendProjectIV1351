package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.LessonData;

@Mapper
public interface LessonMapper {
    LessonData selectLesson(Integer lessonid);
    void insertLesson(LessonData lesson);
    void deleteLesson(Integer lessonid);
    void updateLesson(LessonData lesson);
}
