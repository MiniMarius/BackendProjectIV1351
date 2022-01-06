package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.RentalInstrumentData;

import java.util.List;

@Mapper
public interface RentalInstrumentMapper {
    RentalInstrumentData selectRentalInstrument(Integer rentalid);
    void insertRentalInstrument(RentalInstrumentData rentalInstrument);
    void deleteRentalInstrument(Integer rentalid);
    void updateRentalInstrument(RentalInstrumentData rentalInstrument);
    List<RentalInstrumentData> selectAllRentalInstruments();
}
