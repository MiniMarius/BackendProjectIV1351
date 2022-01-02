package se.kth.iv1351;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import se.kth.iv1351.dao.InstrumentTypeMapper;
import se.kth.iv1351.model.BookingData;
import se.kth.iv1351.model.InstrumentTypeData;
import se.kth.iv1351.openapi.InstrumenttypeApiDelegate;
import se.kth.iv1351.openapi.model.Booking;
import se.kth.iv1351.openapi.model.InstrumentType;

@AllArgsConstructor
@Service
public class InstrumentTypeDelegator implements InstrumenttypeApiDelegate {
    InstrumentTypeMapper instrumentTypeMapper;

    @Override
    public ResponseEntity<InstrumentType> instrumenttypeInstrumentidGet(Integer instrumentid) {
        InstrumentTypeData instrumentTypeData = instrumentTypeMapper.selectInstrumentType(instrumentid);
        InstrumentType instrumentType = new InstrumentType();
        instrumentType.setId(instrumentTypeData.getId());
        instrumentType.setType(instrumentTypeData.getType());
        return new ResponseEntity<InstrumentType>(instrumentType, HttpStatus.OK);
    }
}
