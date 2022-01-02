package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.LeaseData;
import se.kth.iv1351.openapi.model.Lease;

@Mapper
public interface LeaseMapper {
    LeaseData selectLease(Integer leaseid);
    void insertLease(Lease lease);
}
