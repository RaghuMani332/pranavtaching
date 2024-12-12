package com.bl.pravav.teachingpranav.serviceImpl;

import com.bl.pravav.teachingpranav.repositary.UserRepo;

import java.util.List;

public class UserServiceImpl {


    private final UserRepo repo = new UserRepo();

    public String greetings()
    {
        return repo.greetings();
    }

    public List<String> getAll() {
        return  repo.getAll();
    }

    public String getByIndex(int num) {
        num -= 1;
        return repo.getByIndex(num);
    }
}
