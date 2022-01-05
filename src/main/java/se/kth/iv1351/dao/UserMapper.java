package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.UserData;
import se.kth.iv1351.openapi.model.User;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserData> selectAllUsers();
    UserData selectUser(Integer userid);
    void insertUser(User user);
    void deleteUser(Integer userid);
    void updateUser(User user);
}
