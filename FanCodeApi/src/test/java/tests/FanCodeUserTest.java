package tests;

import api.TodoApi;
import api.UserApi;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FanCodeUserTest {

	@Test
    public void fanCodeUserCompletion() {
        UserApi usersAPI = new UserApi();
        TodoApi todosAPI = new TodoApi();

        // Get FanCity users
        List<JSONObject> users = usersAPI.getUsers();
        Assert.assertFalse("No users found in FanCode city.", users.isEmpty());

        // Validate completion percentage for each user
        for (JSONObject user : users) {
            int userId = user.getInt("id");
            double completionPercent = todosAPI.getPercent(userId);

            Assert.assertTrue( "User " + userId + " has less than 50% tasks completed.",completionPercent > 50);
        }
    }
}
