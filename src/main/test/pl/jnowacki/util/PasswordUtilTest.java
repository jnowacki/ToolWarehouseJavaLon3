package pl.jnowacki.util;

import org.junit.Test;

public class PasswordUtilTest {

    @Test
    public void hashPassword() {
        long time = System.currentTimeMillis();
        System.out.println(PasswordUtil.hashPassword("pwd2"));
        System.out.println(System.currentTimeMillis() - time);
    }
}
