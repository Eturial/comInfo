package com.effort.server;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@WebAppConfiguration
@RunWith(SpringRunner.class)

public class AccountTest {

    @Autowired
    WebApplicationContext context;

    MockMvc mvc;

    @Before
    public void initMvc() {
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testLogin() throws Exception {
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post("/login").content("{\n" +
                "\t\"password\": \"\",\n" +
                "\t\"username\": \"\"\n" +
                "}")).andReturn();
        MockHttpServletResponse response = mvcResult.getResponse();

        System.out.println(response.getContentAsString());

    }
}
