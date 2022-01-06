package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.InstrumentTypeData;

@Mapper
public interface InstrumentTypeMapper {
    InstrumentTypeData selectInstrumentType(Integer instrumentid);
    void insertInstrumentType(InstrumentTypeData instrumentType);
    void deleteInstrumentType(Integer instrumentid);
    void updateInstrumentType(InstrumentTypeData instrumentType);
}
