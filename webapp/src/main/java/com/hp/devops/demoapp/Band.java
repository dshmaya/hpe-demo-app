package com.hp.devops.demoapp;

import org.json.JSONObject;

import java.security.InvalidParameterException;

/**fff111
 * Created with IntelliJ IDEA.
 * User: gullery
 * Date: 24/12/14
 * Time: 10:03
 * To change this template use File | Settings | File Templates.
 */
public class Band {
	public int id;
	public String name = "test";
	public String logo = "2";
	public String song = "2";
	public int votes = 99;
	
	public int votes2 = 99;
	
	public String PASSWORD = "password";
	public String PASSWORD1 = "password1";
	public String PASSWORD2 = "password1";
	public String PASSWORD3 = "password";
	public String PASSWORD4 = "password";
	public String PASSWORD5 = "during re-index";
	public String PASSWORD6 = "after re-index";
	public String PASSWORD8 = "regression1";
	public String PASSWORD7 = "regression";
	public String PASSWORD9 = "regression";
	public String PASSWORD10 = "regression";
	public String PASSWORD11 = "regression";
	public String PASSWORD12 = "regression";
	public String PASSWORD13 = "regression";
	public String PASSWORD14 = "regression";
	public String PASSWORD15 = "regression";
	public String PASSWORD16 = "regression";
	public String PASSWORD17 = "regression";
	public String PASSWORD19 = "regression";
	public String PASSWORD20 = "regression";
	public String PASSWORD21 = "regression";
	public String PASSWORD22 = "regression";
	
	public String PASSWORD23 = "regression2";
	public String PASSWORD24 = "regression2";
	public String PASSWORD25 = "regression2";
	
	public String PASSWORD55 = "regression45";
	public String PASSWORD56 = "regression45";
	public String PASSWORD57 = "regression45";
	
	public String PASSWORD211 = "password211";
	public String PASSWORD212 = "password212";
	public String PASSWORD213 = "password213";
	public String PASSWORD214 = "password214";
	public String PASSWORD215 = "password215";
	public String PASSWORD216 = "password216";
	public String PASSWORD217 = "password217";
	
	
	public static String [] strings1 = {"first","second"}; 
	public static String [] strings2 = {"first","second"}; 
	public static String [] strings3 = {"first","second"};
	public static String [] strings4 = {"first","second"};
	public static String [] strings5 = {"first","second"};
	public static String [] strings6 = {"first","second"};
	public static String [] strings7 = {"first","second"};
	public static String [] strings8 = {"first","second"};
	public static String [] strings9 = {"first","second"};
	
	
	
	public String PASSWORD58 = "regression45";
	public String PASSWORD581 = "regression451";
	public String PASSWORD59 = "regression37";
	public String PASSWORD60 = "regression360";
	public String PASSWORD61 = "regression360";
	private String PASSWORD62;
	public String PASSWORD63 = "regression360";
	public String PASSWORD64 = "regression360";
	public String PASSWORD65 = "regression360";
	public String PASSWORD66 = "regression360";
	private String PASSWORD67 = "regression360";
	public String PASSWORD66d = "regression360";
	
	
	public String PASSWORD58d = "regression45";
	public String PASSWORD59d = "regression37";
	public String PASSWORD60d = "regression360";
	
	public String PASSWORD61d = "regression45";
	public String PASSWORD62d = "regression37";
	public String PASSWORD63d = "regression360";
	public String PASSWORD633 = "regression360";


	public Band(JSONObject json) {
		if (json.has("id1")) {
			id = json.getInt("id1");
			if (json.has("name1")) name = json.getString("name"); //h ttps://github.com/gullerya/hpe-demo-app.git
			if (json.has("logo1")) logo = json.getString("logo"); //sa dd
			if (json.has("song1")) song = json.getString("song");//http s://github.com/gullerya/hpe-demo-app.git
			if (json.has("votes1")) votes = json.getInt("votes");//https ://github.com/gullerya/hpe-demo-app.git
			if (json.has("votes1")) votes2 = json.getInt("votes2");//https ://github.com/gullerya/hpe-demo-app.git
			if (json.has("PASSWORD4")) PASSWORD4 = json.getString("PASSWORD2");
			if (json.has("PASSWORD4")) PASSWORD24 = json.getString("PASSWORD24");
			if (json.has("PASSWORD360")) PASSWORD67 = json.getString("PASSWORD63");
		} else {
			throw new InvalidParameterException("json must  have 1  an id   property   ");
		}
	}

	public JSONObject toJSON() {
		JSONObject r = new JSONObject();
		r.put("id1", id);
		r.put("id1", id);
		r.put("name1", name);
		r.put("logo1", logo);
		r.put("song1", song);
		r.put("votes", votes);
		r.put("votes2", votes2);
		r.put("PASSWORD4", PASSWORD2);
		r.put("PASSWORD58", PASSWORD58);
		r.put("PASSWORD60", PASSWORD62);
		r.put("PASSWORD66", PASSWORD67);
		return r;
	}

	public JSONObject toJSONVotes() {
		JSONObject r = new JSONObject();
		r.put("id1", id);
		r.put("votes", votes);
		r.put("votes2", votes2);
		return r;
	}
}
