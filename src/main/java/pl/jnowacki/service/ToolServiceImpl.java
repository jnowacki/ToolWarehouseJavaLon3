package pl.jnowacki.service;

import pl.jnowacki.dao.ToolDao;
import pl.jnowacki.dao.ToolDaoImpl;
import pl.jnowacki.model.Tool;

import java.util.List;

public class ToolServiceImpl implements ToolService {

    private ToolDao toolDao = ToolDaoImpl.getInstance();

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
        return toolDao.getAll();
    }
}
