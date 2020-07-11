package pl.jnowacki.dao;

import pl.jnowacki.model.Tool;
import pl.jnowacki.model.ToolType;

import java.util.ArrayList;
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
        tools = new ArrayList<>();

        tools.add(new Tool(1L, "Old saw", ToolType.SAW, true));
        tools.add(new Tool(2L, "Sonic screwdriver", ToolType.SCREWDRIVER, true));
        tools.add(new Tool(3L, "Red hammer", ToolType.HAMMER, false));
        tools.add(new Tool(4L, "Drill", ToolType.OTHER, true));
    }

    @Override
    public List<Tool> getAll() {
        return tools;
    }

    @Override
    public void setAvailability(Long id, boolean isAvailable) {
        tools.stream()
                .filter(tool -> tool.getId().equals(id))
                .findAny()
                .ifPresent(tool -> tool.setAvailable(isAvailable));
    }
}
