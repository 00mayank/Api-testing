package api;

import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import utils.Config;

public class TodoApi extends BaseApi {

    public TodoApi() {
        super(Config.BASE_URL);
    }

    public double getPercent(int userId) {
    	Response response = get(Config.TODOS_ENDPOINT, 200); 
        JSONArray todos = new JSONArray(response.getBody().asString());

        int totalTasks = 0;
        int completedTasks = 0;

        for (int i = 0; i < todos.length(); i++) {
            JSONObject todo = todos.getJSONObject(i);
            if (todo.getInt("userId") == userId) {
                totalTasks++;
                if (todo.getBoolean("completed")) {
                    completedTasks++;
                }
            }
        }
        if (totalTasks > 0) {
        	return (double) completedTasks / totalTasks * 100;
        }
        else {
        return 0.0; } 
    }
}

