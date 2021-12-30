package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.UserData;
@Mapper
public interface UserMapper {
    UserData selectUser(Integer userid);
    UserData insertUser();
}
