package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.InstrumentTypeData;
import se.kth.iv1351.openapi.model.InstrumentType;

@Mapper
public interface InstrumentTypeMapper {
    InstrumentTypeData selectInstrumentType(Integer instrumentid);
    void insertInstrumentType(InstrumentType instrumentType);
    void deleteInstrumentType(Integer instrumentid);
}
