package com.kodilla.stream.homework;

import com.kodilla.stream.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ForumStats {


    public static void main(String[] args) {

        List<User> users;
        users = UsersRepository.getUsersList();

        System.out.println(getAvgNumbsOfPostsFromYoung(users,40));
        System.out.println(getAvgNumbsOfPostsFromOlder(users,40));
    }

    public static double getAvgNumbsOfPostsFromYoung(List<User> users, int age) {

        if (users == null)
            return 0;
        return users
                .stream()
                .filter(a -> a.getAge() < age)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0);
    }

    public static double getAvgNumbsOfPostsFromOlder(List<User> users, int age) {

        if (users == null)
            return 0;
        return users
                .stream()
                .filter(a -> a.getAge() >= age)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0);
    }
}
