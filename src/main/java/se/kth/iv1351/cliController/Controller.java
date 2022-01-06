package se.kth.iv1351.cliController;

import se.kth.iv1351.model.DataModel;

import java.util.List;

public interface Controller {
    public void insert(DataModel datamodel);
    public void delete(String id);
    public void update(DataModel datamodel);
    public Object get(String id);
}
