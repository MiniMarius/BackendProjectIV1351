package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.RentalInstrumentData;

@Mapper
public interface RentalInstrumentMapper {
    RentalInstrumentData selectRentalInstrument(Integer rentalid);
}
