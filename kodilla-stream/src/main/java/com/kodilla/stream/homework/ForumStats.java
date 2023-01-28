package com.kodilla.stream.homework;

import com.kodilla.stream.*;

import java.util.List;
import java.util.Optional;

public class ForumStats {
    public static void main(String[] args) {

        List<User> users;
        users = UsersRepository.getUsersList();

        System.out.println(getAvgNumbsOfPostsFromYoung(users));
        System.out.println(getAvgNumbsOfPostsFromOlder(users));
    }

    public static double getAvgNumbsOfPostsFromYoung(List<User> users) {

        Optional<List<User>> optUser = Optional.ofNullable(users);

        if (optUser.isPresent()) {
            return users
                    .stream()
                    .filter(age -> age.getAge() < 40)
                    .mapToInt(User::getNumberOfPost)
                    .average()
                    .getAsDouble();
        } else return 0;
    }

    public static double getAvgNumbsOfPostsFromOlder(List<User> users) {

        Optional<List<User>> optUser = Optional.ofNullable(users);

        if (optUser.isPresent()) {
            return users
                    .stream()
                    .filter(age -> age.getAge() >= 40)
                    .mapToInt(User::getNumberOfPost)
                    .average()
                    .getAsDouble();
        } else return 0;
    }
}
