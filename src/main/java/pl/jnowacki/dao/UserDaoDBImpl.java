package pl.jnowacki.dao;

import pl.jnowacki.model.User;

public class UserDaoDBImpl implements UserDao {

    private static UserDaoDBImpl instance;

    public static UserDaoDBImpl getInstance(){
        if (instance == null) {
            instance = new UserDaoDBImpl();
        }

        return instance;
    }

    private UserDaoDBImpl() {
    }

    @Override
    public User getUser(String login) {
        return null;
    }
}
