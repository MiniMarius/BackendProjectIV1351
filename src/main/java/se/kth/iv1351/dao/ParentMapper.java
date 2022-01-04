package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.ParentData;
import se.kth.iv1351.openapi.model.Parent;

@Mapper
public interface ParentMapper {
    ParentData selectParent(Integer parentid);
    void insertParent(Parent parent);
    void deleteParent(Integer parentid);
    void updateParent(Parent parent);
}
