package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.RentalInstrumentData;
import se.kth.iv1351.openapi.model.RentalInstrument;

@Mapper
public interface RentalInstrumentMapper {
    RentalInstrumentData selectRentalInstrument(Integer rentalid);
    void insertRentalInstrument(RentalInstrument rentalInstrument);
    void deleteRentalInstrument(Integer rentalid);
}
