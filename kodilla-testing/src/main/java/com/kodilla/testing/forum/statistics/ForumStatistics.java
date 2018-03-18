package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double averagePostsNumber;
    private double averageCommentsUserNumber;
    private double averageCommentsForPost;

    public void calculateAdvStatistics(Statistics statistics) {
        setUsersNumber(statistics.userName().size());
        setPostsNumber(statistics.postsCount());
        setCommentsNumber(statistics.commentsCount());
        if (postsNumber == 0) {
            setAveragePostsNumber(0);
            setAverageCommentsForPost(0);
        } else {
            double resultPosts = getUsersNumber() / getPostsNumber();
            double resultComments = (double)getCommentsNumber() / getPostsNumber();
            setAveragePostsNumber(resultPosts);
            setAverageCommentsForPost(resultComments);
        }
        if (commentsNumber == 0) {
            setAverageCommentsUserNumber(0);
        } else {
            double resultUsers = (double)getUsersNumber() / getCommentsNumber();
            setAverageCommentsUserNumber(resultUsers);
        }
    }

    public String showStatistic() {
        return "Liczba urzytkownikow: " + getUsersNumber() + "\nLiczba postow: " + getPostsNumber() +
                "\n Liczba komentarzy: " + getCommentsNumber() + "\n Srednia liczba postow: " + getAveragePostsNumber() +
                "\nSrednia liczba komentarzy na uzytkownika: " + getAverageCommentsUserNumber() +
                "\nSrednia liczba komentarzy na post: " + getAverageCommentsForPost();
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAveragePostsNumber() {
        return averagePostsNumber;
    }

    public double getAverageCommentsUserNumber() {
        return averageCommentsUserNumber;
    }

    public double getAverageCommentsForPost() {
        return averageCommentsForPost;
    }

    public void setUsersNumber(int usersNumber) {
        this.usersNumber = usersNumber;
    }

    public void setPostsNumber(int postsNumber) {
        this.postsNumber = postsNumber;
    }

    public void setCommentsNumber(int commentsNumber) {
        this.commentsNumber = commentsNumber;
    }

    public void setAveragePostsNumber(double averagePostsNumber) {
        this.averagePostsNumber = averagePostsNumber;
    }

    public void setAverageCommentsUserNumber(double averageCommentsUserNumber) {
        this.averageCommentsUserNumber = averageCommentsUserNumber;
    }

    public void setAverageCommentsForPost(double averageCommentsForPost) {
        this.averageCommentsForPost = averageCommentsForPost;
    }
}
