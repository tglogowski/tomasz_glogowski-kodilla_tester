import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerTestSuite {

    @Test
    public void testFilterChemistGroupUsernames() {
        //given
        //when
        List<String> result = UsersManager.filterChemistsGroupUsernames();
        //then
        List<String> expectedUsers = new ArrayList<>();
        expectedUsers.add("Walter White");
        expectedUsers.add("Gale Boetticher");
        assertEquals(expectedUsers, result);
    }

    @Test
    public void testfilterAgeUsers() {
        //given
        //when
        List<User> result = UsersManager.filterAgeUsers(40);
        //then
        List<User> expectedUsers = new ArrayList<>();
        expectedUsers.add(new User("Walter White", 50, 7, "Chemists"));
        expectedUsers.add(new User("Gus Firing", 49, 0, "Board"));
        expectedUsers.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expectedUsers.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

        assertEquals(expectedUsers, result);
    }

    @Test
    public void testfilterActivity() {
        //given

        //when
        List<String> result = UsersManager.filterActivity(100);

        //then
        List<String> expectedUsers = new ArrayList<>();
        expectedUsers.add("Sales");
        expectedUsers.add("Manager");

        assertEquals(expectedUsers, result);
    }
}
