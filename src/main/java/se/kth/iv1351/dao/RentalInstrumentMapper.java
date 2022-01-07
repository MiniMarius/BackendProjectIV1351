package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.RentalInstrument;

import java.util.List;

@Mapper
public interface RentalInstrumentMapper {
    List<RentalInstrument> selectAllRentalInstruments();
}
