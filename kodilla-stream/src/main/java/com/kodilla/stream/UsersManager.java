package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUserNames = filterChemistsGroupUsernames();
        System.out.println(chemistGroupUserNames);
    }

    private static List<String> filterChemistsGroupUsernames() {
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
}
