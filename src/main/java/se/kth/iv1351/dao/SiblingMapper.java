package se.kth.iv1351.dao;

import org.apache.ibatis.annotations.Mapper;
import se.kth.iv1351.model.SiblingData;

@Mapper
public interface SiblingMapper {
    SiblingData selectSibling(Integer siblingid);
    void insertSibling(SiblingData sibling);
    void deleteSibling(Integer siblingid);
    void updateSibling(SiblingData sibling);
}
