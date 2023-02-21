package com.kodilla.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class NotificationServiceTestSuite {

    NotificationService notificationService = new NotificationService();
    Client client = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {

        notificationService.addSubscriber(client);
        notificationService.sendNotification(notification);
        Mockito.verify(client).receive(notification);

    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {

        addSubscribers(client, secondClient, thirdClient);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {

        addSubscribers(client, client, client);

        notificationService.sendNotification(notification);

        Mockito.verify(client).receive(notification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {

        notificationService.addSubscriber(client);
        notificationService.removeSubscriber(client);

        notificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    private void addSubscribers(Client... clients) {
        for (Client currentClient : clients) {
            notificationService.addSubscriber(currentClient);
        }
    }
}