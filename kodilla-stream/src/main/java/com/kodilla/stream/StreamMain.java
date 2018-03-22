package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer,ForumUser> forumUserMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthOfDate().getYear() >= 1998)
                .filter(forumUser -> forumUser.getQuantityPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        forumUserMap.entrySet().stream()
                .map(forumUser -> forumUser.getKey() +":"+ forumUser.getValue())
                .forEach(System.out::println);

    }
}
