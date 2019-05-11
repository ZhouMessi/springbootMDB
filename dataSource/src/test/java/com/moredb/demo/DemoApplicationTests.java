package com.moredb.demo;

import com.moredb.demo.domain.User;
import com.moredb.demo.services.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        User user = userService.Sel1(1);
        System.out.println(user.toString());
        User user1 = userService.Sel2(1);
        System.out.println(user1.toString());

    }

}
