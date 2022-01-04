package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.LessonData;
import se.kth.iv1351.openapi.model.Lesson;

import java.util.ArrayList;

@Mapper
public interface ReportMapper {
    ArrayList<Lesson> getEnsembleReport();
}
