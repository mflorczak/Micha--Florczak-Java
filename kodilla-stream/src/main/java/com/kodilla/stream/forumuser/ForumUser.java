package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    final String username;
    final int id;
    final char sex;
    final int quantityPosts;
    final LocalDate birthOfDate;

    public ForumUser(String username, int id, char sex,int quantityPosts , int year, int month, int day) {
        this.username = username;
        this.id = id;
        this.sex = sex;
        this.birthOfDate = LocalDate.of(year, month, day);
        this.quantityPosts = quantityPosts;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public char getSex() {
        return sex;
    }

    public int getQuantityPosts() {
        return quantityPosts;
    }

    public LocalDate getBirthOfDate() {
        return birthOfDate;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", sex=" + sex +
                ", quantityPosts=" + quantityPosts +
                ", birthOfDate=" + birthOfDate +
                '}';
    }
}
