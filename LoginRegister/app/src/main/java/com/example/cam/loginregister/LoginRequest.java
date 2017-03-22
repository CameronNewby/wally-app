package com.example.cam.loginregister;

/**
 * Created by cam on 22/03/17.
 * This class controls the mapping form parameters to a https POST request which is sent to our
 * Register.php script to be processed into the database.
 *
 * Parameters:
 * REGISTER_REQUEST_URL this must point to webhost and the Register.php that has been uploaded there.
 */

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class LoginRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://cameronmnewby.000webhostapp.com/Login.php";
    private Map<String, String> params;

    public LoginRequest(String username, String password, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams(){
        return params;
    }
}
