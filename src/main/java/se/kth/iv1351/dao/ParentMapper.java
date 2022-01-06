package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.ParentData;

@Mapper
public interface ParentMapper {
    ParentData selectParent(Integer parentid);
    void insertParent(ParentData parent);
    void deleteParent(Integer parentid);
    void updateParent(ParentData parent);
}
