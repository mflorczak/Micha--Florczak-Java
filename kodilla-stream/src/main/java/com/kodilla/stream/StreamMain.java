package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

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

        LocalDate date1 = LocalDate.now().minusDays(10);
        long date2 = LocalDate.now().toEpochDay() - date1.toEpochDay();
        System.out.println(date2);
    }
}
