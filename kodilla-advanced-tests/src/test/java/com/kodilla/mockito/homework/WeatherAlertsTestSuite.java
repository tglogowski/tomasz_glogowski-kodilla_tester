package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlertsTestSuite {

    WeatherAlertMachine weatherAlertMachine = new WeatherAlertMachine();
    Subscriber subscriber1 = Mockito.mock(Subscriber.class);
    Subscriber subscriber2 = Mockito.mock(Subscriber.class);
    Subscriber subscriber3 = Mockito.mock(Subscriber.class);
    Subscriber subscriber4 = Mockito.mock(Subscriber.class);

    Localization localization1 = Mockito.mock(Localization.class);
    Localization localization2 = Mockito.mock(Localization.class);

    WeatherAlert weatherAlert = Mockito.mock(WeatherAlert.class);

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {

        weatherAlertMachine.sendAlert(weatherAlert,localization1);
        Mockito.verify(subscriber1,Mockito.never()).receiveAlert(weatherAlert);
    }

    @Test
    public void notAssignedToLocalizationClientShouldNotReceiveNotification() {

        weatherAlertMachine.addSubscriber(subscriber1,null);
        weatherAlertMachine.sendAlert(weatherAlert,localization1);

        Mockito.verify(subscriber1,Mockito.never()).receiveAlert(weatherAlert);

    }
    @Test
    public void subscriberCanBeAssignedToLocalizationAndReceiveAlerts() {

        addSubscribers();
        weatherAlertMachine.sendAlert(weatherAlert,localization1);

        Mockito.verify(subscriber1).receiveAlert(weatherAlert);
        Mockito.verify(subscriber2).receiveAlert(weatherAlert);
    }

    @Test
    public void subscriberCanBeRemovedFromLocalization() {

        addSubscribers();
        weatherAlertMachine.removeSubscriberFromLocalization(subscriber1,localization1);
        weatherAlertMachine.sendAlert(weatherAlert,localization1);
        weatherAlertMachine.sendAlert(weatherAlert,localization2);

        Mockito.verify(subscriber1, Mockito.times(1)).receiveAlert(weatherAlert);
    }

    @Test
    public void subscriptionCanBeRemovedFromAllLocalizations() {

        addSubscribers();
        weatherAlertMachine.removeSubscriberFromAllLocalizations(subscriber1);

        weatherAlertMachine.sendAlert(weatherAlert,localization1);
        weatherAlertMachine.sendAlert(weatherAlert,localization2);

        Mockito.verify(subscriber1, Mockito.never()).receiveAlert(weatherAlert);

    }

    @Test
    public void  alertForTheLocalizationShouldReachOnlySubscribersAssignedToThatLocalization() {

        addSubscribers();
        weatherAlertMachine.sendAlert(weatherAlert,localization2);

        Mockito.verify(subscriber1).receiveAlert(weatherAlert);
        Mockito.verify(subscriber3).receiveAlert(weatherAlert);
    }

    @Test
    public  void shouldSendAlertsToAllSubscribers(){

        OtherNotifications notification = Mockito.mock(OtherNotifications.class);
        addSubscribers();
        weatherAlertMachine.sendNotificationToAll(notification);

        Mockito.verify(subscriber1).receiveNotification(notification);
        Mockito.verify(subscriber2).receiveNotification(notification);
        Mockito.verify(subscriber3).receiveNotification(notification);
        Mockito.verify(subscriber4).receiveNotification(notification);
    }

    @Test
    public  void shouldRemoveGivenLocalization(){

        addSubscribers();
        weatherAlertMachine.removeLocalization(localization1);
        weatherAlertMachine.sendAlert(weatherAlert,localization1);

        Mockito.verify(subscriber1, Mockito.never()).receiveAlert(weatherAlert);
        Mockito.verify(subscriber2, Mockito.never()).receiveAlert(weatherAlert);
        Mockito.verify(subscriber3, Mockito.never()).receiveAlert(weatherAlert);
        Mockito.verify(subscriber4, Mockito.never()).receiveAlert(weatherAlert);

    }

    private void addSubscribers() {
            weatherAlertMachine.addSubscriber(subscriber1,localization1);
            weatherAlertMachine.addSubscriber(subscriber1,localization2);
            weatherAlertMachine.addSubscriber(subscriber2,localization1);
            weatherAlertMachine.addSubscriber(subscriber3,localization2);
            weatherAlertMachine.addSubscriber(subscriber4,localization1);
    }
}
