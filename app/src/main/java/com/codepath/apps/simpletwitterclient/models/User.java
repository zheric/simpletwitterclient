package com.codepath.apps.simpletwitterclient.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hang.zhang1 on 12/11/2015.
 */
public class User {
    private String name;
    private long id;
    private String screenname;
    private String profileImageUrl;

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getScreenname() {
        return screenname;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public static User fromJSON(JSONObject json){
        User user = new User();

        try {
            user.name = json.getString("name");
            user.id = json.getLong("id");
            user.screenname = json.getString("screen_name");
            user.profileImageUrl = json.getString("profile_image_url");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return user;
    }
}
