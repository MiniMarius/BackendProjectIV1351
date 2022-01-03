package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.UserApplicationData;
import se.kth.iv1351.openapi.model.UserApplication;

@Mapper
public interface UserApplicationMapper {
    UserApplicationData selectUserApplication(Integer applicationid);
    void insertUserApplication(UserApplication userApplication);
    void deleteUserApplication(Integer applicationid);
}
