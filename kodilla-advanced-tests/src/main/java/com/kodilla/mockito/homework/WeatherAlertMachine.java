package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherAlertMachine {

    Map<Localization, Set<Subscriber>> subscriptions = new HashMap<>();

    public void addSubscriber(Subscriber subscriber, Localization localization) {

        Set<Subscriber> subscribers = subscriptions.getOrDefault(localization, new HashSet<>());
        subscribers.add(subscriber);
        subscriptions.put(localization, subscribers);
    }

    public void sendAlert(WeatherAlert weatherAlert, Localization localization) {

        Set<Subscriber> subscribers = subscriptions.getOrDefault(localization, new HashSet<>());
        this.subscriptions.entrySet().forEach(s -> {
            if (s.getKey() == localization) {
                for (Subscriber subscriber : subscribers)
                    subscriber.receiveAlert(weatherAlert);
            }
        });
    }

    public void removeSubscriberFromLocalization(Subscriber subscriber, Localization localization){

        Set<Subscriber> subscribers = subscriptions.getOrDefault(localization, new HashSet<>());

        if(subscribers.contains(subscriber)) {
            subscribers.remove(subscriber);
            subscriptions.put(localization, subscribers);
        }
    }

    public void removeSubscriberFromAllLocalizations(Subscriber subscriber) {

        for (Map.Entry<Localization, Set<Subscriber>> subs : subscriptions.entrySet()) {
            Set<Subscriber> subscribers = subscriptions.getOrDefault(subs.getKey(), new HashSet<>());
            if (subscribers.contains(subscriber)) {
                    subscribers.remove(subscriber);
                    subscriptions.put(subs.getKey(), subscribers);
            }
        }
    }

    public void sendNotificationToAll(OtherNotifications notification) {

        Set<Subscriber> allSubscribers = new HashSet<>();

        for (Map.Entry<Localization, Set<Subscriber>> subs : subscriptions.entrySet()) {
            Set<Subscriber> subscribers = subscriptions.getOrDefault(subs.getKey(), new HashSet<>());
            for (Subscriber s : subscribers)
                allSubscribers.add(s);
            }

        for(Subscriber s : allSubscribers)
            s.receiveNotification(notification);
    }

    public void removeLocalization(Localization localization) {

        subscriptions.remove(localization);
    }
}
