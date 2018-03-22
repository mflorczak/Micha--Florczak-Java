package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser("Marcin", 1,'M',1,2000,3,11));
        userList.add(new ForumUser("Kamil", 2,'M',3,1990,6,12));
        userList.add(new ForumUser("Kamila", 3,'F',0,1996,5,6));
        userList.add(new ForumUser("Alicja", 4,'F',4,2001,9,29));
        userList.add(new ForumUser("Maciek", 5,'M',2,1998,12,30));
        userList.add(new ForumUser("Marta", 6,'F',5,1993,11,16));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
