package com.bl.pravav.teachingpranav.controller;


import com.bl.pravav.teachingpranav.serviceImpl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    private final UserServiceImpl service =new UserServiceImpl();

    @RequestMapping(method = RequestMethod.GET, value = "/greetings")
    @ResponseBody
    public String greetings() {
        return service.greetings();
    }

    @RequestMapping(method = RequestMethod.GET, value ="/getAll")
    @ResponseBody
    public List<String> getAll()
    {
        return service.getAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getByIndex/{num}")
    @ResponseBody
    public String getByIndex(@PathVariable int num) {
        return service.getByIndex(num);
    }

}



