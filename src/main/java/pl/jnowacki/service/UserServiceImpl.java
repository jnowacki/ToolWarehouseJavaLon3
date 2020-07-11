package pl.jnowacki.service;

import pl.jnowacki.dao.UserDao;
import pl.jnowacki.dao.UserDaoDBImpl;
import pl.jnowacki.model.User;

public class UserServiceImpl implements UserService {

    private UserDao userDao = UserDaoDBImpl.getInstance();

    private static UserServiceImpl instance;

    public static UserServiceImpl getInstance() {
        if (instance == null) {
            instance = new UserServiceImpl();
        }

        return instance;
    }

    private UserServiceImpl() {
    }

    @Override
    public boolean isUserValid(String login, String password) {

        User user = userDao.getUser(login);

        return user != null && user.getPassword().equals(password) && user.getLogin().equals(login);
    }
}
