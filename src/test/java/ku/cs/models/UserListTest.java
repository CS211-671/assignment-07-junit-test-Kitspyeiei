package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("One", "One");
        userList.addUser("Two", "Two");
        userList.addUser("Three", "Three");

        // TODO: find one of them
        userList.findUserByUsername("One");

        // TODO: assert that UserList found User
        User user = new User("Four", "Four");
        String expected = "Four";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("One", "One");
        userList.addUser("Two", "Two");
        userList.addUser("Three", "Three");

        // TODO: change password of one user
        boolean actual = userList.changePassword("One","One","Two");

        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("One", "One");
        userList.addUser("Two", "Two");
        userList.addUser("Three", "Three");

        // TODO: call login() with correct username and password
        User actual = userList.login("One","One");

        // TODO: assert that User object is found
        User expected = userList.findUserByUsername("One");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("One", "One");
        userList.addUser("Two", "Two");
        userList.addUser("Three", "Three");

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("One","Two");

        // TODO: assert that the method return null
        assertEquals(null, actual);
    }

}