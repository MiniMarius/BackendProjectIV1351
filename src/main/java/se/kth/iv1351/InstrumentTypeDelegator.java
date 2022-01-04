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
import se.kth.iv1351.util.IdGenerator;

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

    @Override
    public ResponseEntity<InstrumentType> instrumenttypePost(InstrumentType instrumentType) {
        Integer id = IdGenerator.generate();
        instrumentType.setId(id);
        instrumentTypeMapper.insertInstrumentType(instrumentType);
        return instrumenttypeInstrumentidGet(id);
    }

    @Override
    public ResponseEntity<Void> instrumenttypeInstrumentidDelete(Integer instrumentid) {
        instrumentTypeMapper.deleteInstrumentType(instrumentid);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<InstrumentType> instrumenttypeInstrumentidPut(Integer instrumentid, InstrumentType instrumentType) {
        instrumentType.setId(instrumentid);
        instrumentTypeMapper.updateInstrumentType(instrumentType);
        return instrumenttypeInstrumentidGet(instrumentid);
    }
}
