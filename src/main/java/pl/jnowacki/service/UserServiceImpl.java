package pl.jnowacki.service;

import pl.jnowacki.dao.UserDao;
import pl.jnowacki.dao.UserDaoDBImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao = UserDaoDBImpl.getInstance();

    private static UserServiceImpl instance;

    public static UserServiceImpl getInstance(){
        if (instance == null) {
            instance = new UserServiceImpl();
        }

        return instance;
    }

    private UserServiceImpl() {
    }

    @Override
    public boolean isUserValid(String login, String password) {
        return false;
    }
}
