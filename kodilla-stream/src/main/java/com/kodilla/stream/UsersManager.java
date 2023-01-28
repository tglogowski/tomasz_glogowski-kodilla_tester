package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUserNames = filterChemistsGroupUsernames();
        System.out.println(chemistGroupUserNames);
    }

    public static List<String> filterChemistsGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<User> filterAgeUsers(int age) {
        List<User> users = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
        return users;
    }

    public static List<String> filterActivity(int numberOfPosts) {

        List<String> userGroups = UsersRepository.getUsersList()
                .stream()

                .filter(user -> user.getNumberOfPost() > numberOfPosts)
                .map(User::getGroup)
                .collect(Collectors.toList());
        return userGroups;
    }
}
