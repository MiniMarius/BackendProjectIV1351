package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.InstrumentTypeData;

@Mapper
public interface InstrumentTypeMapper {
    InstrumentTypeData selectInstrumentType();
}
