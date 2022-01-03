package se.kth.iv1351;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import se.kth.iv1351.dao.RentalInstrumentMapper;
import se.kth.iv1351.model.RentalInstrumentData;
import se.kth.iv1351.openapi.RentalinstrumentApiDelegate;
import se.kth.iv1351.openapi.model.RentalInstrument;
import se.kth.iv1351.util.IdGenerator;

@AllArgsConstructor
@Service
public class RentalInstrumentDelegator implements RentalinstrumentApiDelegate {
    RentalInstrumentMapper rentalInstrumentMapper;

    @Override
    public ResponseEntity<RentalInstrument> rentalinstrumentRentalidGet(Integer rentalid) {
        RentalInstrumentData rentalInstrumentData = rentalInstrumentMapper.selectRentalInstrument(rentalid);
        RentalInstrument rentalInstrument = new RentalInstrument();
        rentalInstrument.setId(rentalInstrumentData.getId());
        rentalInstrument.setInstrumentTypeId(rentalInstrument.getInstrumentTypeId());
        rentalInstrument.setDescription(rentalInstrumentData.getDescription());
        rentalInstrument.setSerialNumber(rentalInstrumentData.getSerialNumber());
        return new ResponseEntity<RentalInstrument>(rentalInstrument, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RentalInstrument> rentalinstrumentPost(RentalInstrument rentalInstrument) {
        Integer id = IdGenerator.generate();
        rentalInstrument.setId(id);
        rentalInstrumentMapper.insertRentalInstrument(rentalInstrument);
        return rentalinstrumentRentalidGet(id);
    }
}
