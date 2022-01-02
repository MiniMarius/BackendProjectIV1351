package se.kth.iv1351;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import se.kth.iv1351.dao.LeaseMapper;
import se.kth.iv1351.model.LeaseData;
import se.kth.iv1351.openapi.LeaseApiDelegate;
import se.kth.iv1351.openapi.model.Lease;

@AllArgsConstructor
@Service
public class LeaseDelegator implements LeaseApiDelegate {
    LeaseMapper leaseMapper;

    @Override
    public ResponseEntity<Lease> leaseLeaseidGet(Integer leaseid) {
        LeaseData leaseData = leaseMapper.selectLease(leaseid);
        Lease lease = new Lease();
        lease.setId(leaseData.getId());
        lease.setStartTime(lease.getStartTime());
        lease.setEndTime(lease.getEndTime());
        lease.setStudentId(lease.getStudentId());
        lease.setRentalInstrumentId(lease.getRentalInstrumentId());
        return new ResponseEntity<Lease>(lease, HttpStatus.OK);
    }
}
