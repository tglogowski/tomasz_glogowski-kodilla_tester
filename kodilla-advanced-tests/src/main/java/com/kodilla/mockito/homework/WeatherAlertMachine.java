package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherAlertMachine {

    Map<Localization, Set<Subscriber>> subscriptions = new HashMap<>();

    public void addSubscriber(Subscriber subscriber, Localization localization) {
        getFromMap(localization).add(subscriber);
    }

    public void sendAlert(WeatherAlert weatherAlert, Localization localization) {
        getFromMap(localization)
                .forEach(subscriber -> subscriber.receiveAlert(weatherAlert));
    }

    public void removeSubscriberFromLocalization(Subscriber subscriber, Localization localization) {
        getFromMap(localization).remove(subscriber);
    }

    public void removeSubscriberFromAllLocalizations(Subscriber subscriber) {
        subscriptions.forEach((key, value) -> value.remove(subscriber));
    }

    public void sendNotificationToAll(OtherNotifications notification) {
        subscriptions.values().stream()
                .flatMap(Collection::stream)
                .distinct()
                .forEach(x -> x.receiveNotification(notification));
    }

    public void removeLocalization(Localization localization) {
        subscriptions.remove(localization);
    }

    private Set<Subscriber> getFromMap(Localization localization) {
        subscriptions.computeIfAbsent(localization, k -> new HashSet<>());
        return subscriptions.get(localization);
    }
}