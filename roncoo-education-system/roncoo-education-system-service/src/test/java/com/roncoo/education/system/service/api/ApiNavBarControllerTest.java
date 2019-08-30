package com.roncoo.education.system.service.api;

import com.alibaba.druid.filter.config.ConfigTools;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ApiNavBarControllerTest {

    @Before
    public void setUp() throws Exception {

        System.out.println("1");
    }

   @Test
    public void list() {
       String password = null;
       try {
           String enPassword = ConfigTools.encrypt("www.zk.com");
           System.out.println(enPassword);
           password = ConfigTools.decrypt(enPassword);
           System.out.println(password);
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("3");
    }
}
