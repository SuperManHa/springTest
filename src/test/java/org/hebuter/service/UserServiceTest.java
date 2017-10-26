package org.hebuter.service;

import org.hebuter.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

    @Test
    public void test_Save() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/conf/beans.xml");
        UserService service  = (UserService) ctx.getBean("userService");
        User u = new User("zhangsan", 24);
        service.save(u);
    }
}
