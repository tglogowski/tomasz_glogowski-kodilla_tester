package kom.kodilla.stream.homework;

import com.kodilla.stream.*;
import com.kodilla.stream.homework.ForumStats;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {

    public List<User> users = new ArrayList<>();

    @BeforeEach
    public void setup() {

        users.add(new User("Walter White", 50, 500, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 100, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 900, "Manager"));
        users.add(new User("Gus Firing", 49, 1500, "Board"));
        users.add(new User("Gale Boetticher", 44, 1000, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 2000, "Security"));
    }

    @Test
    public void testGetAvgNumbsOfPostsFromYoung() {
        //given
        //when
        double result = ForumStats.getAvgNumbsOfPostsFromYoung(users);
        //then
        assertEquals(500, result);
    }

    @Test
    public void testGetAvgNumbsOfPostsFromOlder() {
        //given
        //when
        double result = ForumStats.getAvgNumbsOfPostsFromOlder(users);
        //then
        assertEquals(1250, result);
    }

    @Test
    public void testGetAvgNumbsOfPostsFromYoung_IfArgIsNull() {
        //given
        //when
        double result = ForumStats.getAvgNumbsOfPostsFromYoung(null);
        //then
        assertEquals(0, result);
    }

    @Test
    public void testGetAvgNumbsOfPostsFromOlder_IfArgIsNull() {
        //given
        //when
        double result = ForumStats.getAvgNumbsOfPostsFromOlder(null);
        //then
        assertEquals(0, result);
    }
}
