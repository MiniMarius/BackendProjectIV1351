package se.kth.iv1351.cliController;

import java.util.List;

public interface Controller {
    public void insert(String id);
    public void delete(String id);
    public void update(String id);
    public Object get(String id);
}
