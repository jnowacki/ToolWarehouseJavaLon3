package pl.jnowacki.service;

import pl.jnowacki.model.Tool;

import java.util.List;

public interface ToolService {
    List<Tool> getAll();
    void setAvailability(Long id, boolean isAvailable);
}
