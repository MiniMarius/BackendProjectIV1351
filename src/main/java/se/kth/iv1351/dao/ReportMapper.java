package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.ReportData;

import java.util.List;

@Mapper
public interface ReportMapper {
    List<ReportData> getEnsembleReport(String startTime);
}
