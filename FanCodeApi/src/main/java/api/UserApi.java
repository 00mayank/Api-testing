package api;

import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import utils.Config;

import java.util.ArrayList;
import java.util.List;

public class UserApi extends BaseApi {

    public UserApi(){
        super(Config.BASE_URL);
    }

    public List<JSONObject> getUsers() {
    	Response response = get(Config.USERS_ENDPOINT, 200);
        JSONArray users = new JSONArray(response.getBody().asString());

        List<JSONObject> fanCodeUsers = new ArrayList<>();
        for (int i = 0; i < users.length(); i++) {
            JSONObject user = users.getJSONObject(i);
            JSONObject geo = user.getJSONObject("address").getJSONObject("geo");
            double lat = Double.parseDouble(geo.getString("lat"));
            double lng = Double.parseDouble(geo.getString("lng"));

            if (lat >= -40 && lat <= 5 && lng >= 5 && lng <= 100) {
                fanCodeUsers.add(user);
            }
        }
        return fanCodeUsers;
    }
}
