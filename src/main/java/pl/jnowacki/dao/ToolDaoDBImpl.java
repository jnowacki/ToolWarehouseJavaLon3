package pl.jnowacki.dao;

import pl.jnowacki.model.Tool;
import pl.jnowacki.model.ToolType;
import pl.jnowacki.util.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ToolDaoDBImpl implements ToolDao {

    private static ToolDaoDBImpl instance;

    public static ToolDaoDBImpl getInstance(){
        if (instance == null) {
            instance = new ToolDaoDBImpl();
        }

        return instance;
    }

    @Override
    public List<Tool> getAll() {
        List<Tool> tools = new ArrayList<>();

        String selectSQL = "SELECT * FROM tools";

        try (Connection dbConnection = DbConnection.getDBConnection();
             PreparedStatement preparedStatement = dbConnection.prepareStatement(selectSQL)) {

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                Long toolId = rs.getLong("id");
                String toolName = rs.getString("name");
                ToolType toolType = ToolType.valueOf(rs.getString("type"));
                boolean toolAvailability = rs.getBoolean("available");

                tools.add(new Tool(toolId, toolName, toolType, toolAvailability));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return tools;
    }

    @Override
    public void setAvailability(Long id, boolean isAvailable) {

    }
}
