package pl.jnowacki.dao;

import pl.jnowacki.model.Tool;

import java.util.List;

public interface ToolDao {
    List<Tool> getAll();
    void setAvailability(Long id, boolean isAvailable);
}
