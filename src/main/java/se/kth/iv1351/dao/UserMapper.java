package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.UserData;
import se.kth.iv1351.openapi.model.User;

@Mapper
public interface UserMapper {
    UserData selectUser(Integer userid);
    void insertUser(User user);
    void deleteUser(Integer userid);
    void updateUser(User user);
}
