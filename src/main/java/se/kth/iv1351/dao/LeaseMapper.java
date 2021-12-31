package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.LeaseData;

@Mapper
public interface LeaseMapper {
    LeaseData selectLease();
}
