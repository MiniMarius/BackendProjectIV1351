package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.UserApplicationData;

@Mapper
public interface UserApplicationMapper {
    UserApplicationData selectUserApplication();
}
