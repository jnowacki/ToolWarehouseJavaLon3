package pl.jnowacki.service;

import pl.jnowacki.model.Tool;

import java.util.List;

public class ToolServiceImpl implements ToolService {

    private static ToolServiceImpl instance;

    public static ToolServiceImpl getInstance(){
        if (instance == null) {
            instance = new ToolServiceImpl();
        }

        return instance;
    }

    private ToolServiceImpl() {
    }

    @Override
    public List<Tool> getAll() {
        return null;
    }
}
