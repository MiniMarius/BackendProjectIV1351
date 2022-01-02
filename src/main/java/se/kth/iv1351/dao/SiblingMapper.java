package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.SiblingData;
import se.kth.iv1351.openapi.model.Sibling;

@Mapper
public interface SiblingMapper {
    SiblingData selectSibling(Integer siblingid);
    void insertSibling(Sibling sibling);
}
