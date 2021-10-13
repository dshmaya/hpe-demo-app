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

	
	public String PASSWORD500 = "password500";
	public String PASSWORD501 = "password501";
	public String PASSWORD502 = "password502";
	public String PASSWORD503 = "password503";
	public String PASSWORD504 = "password504";
	public String PASSWORD505 = "password505";
	
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

	public String PASSWORD634 = "regression360";

	public String PASSWORD635 = "regression360";
	public String PASSWORD636 = "regression366";
	public String PASSWORD637 = "regression367";
	public String PASSWORD638 = "regression368";


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
