package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.UserInstrumentData;
import se.kth.iv1351.openapi.model.UserInstrument;

@Mapper
public interface UserInstrumentMapper {
    UserInstrumentData selectUserInstrument(Integer instrumentid);
    void insertUserInstrument(UserInstrument userInstrument);
    void deleteUserInstrument(Integer instrumentid);
}
