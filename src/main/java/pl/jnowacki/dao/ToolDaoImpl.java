package pl.jnowacki.dao;

import pl.jnowacki.model.Tool;

import java.util.List;

public class ToolDaoImpl implements ToolDao {

    private static ToolDaoImpl instance;

    private static List<Tool> tools;

    public static ToolDaoImpl getInstance(){
        if (instance == null) {
            instance = new ToolDaoImpl();
        }

        return instance;
    }

    private ToolDaoImpl() {
    }

    @Override
    public List<Tool> getAll() {
        return tools;
    }
}
