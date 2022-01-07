package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.Report;

import java.util.List;

@Mapper
public interface ReportMapper {
    List<Report> getEnsembleReport(String startTime);
}
