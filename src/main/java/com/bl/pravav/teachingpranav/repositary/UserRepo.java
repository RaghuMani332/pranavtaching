package com.bl.pravav.teachingpranav.repositary;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {

    private static List<String> li = new ArrayList<>(List.of("Raghu", "pranav" , "sagar"));

    public String greetings()
    {
        return "hii daa edaaa! ";
    }

    public List<String> getAll() {
        return li;
    }

    public String getByIndex(int num) {
        return li.get(num);
    }
}
