package com.example.surveyapp;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import android.util.Log;

//appinjabalpur.comule.com
    public class UserFunction 
  {
	private JSONParser jsonParser;
	private static String url_Appin_Technology="http://10.0.2.2/Survey/survey.php";
    private static String  User_data="data1";
    private static String All_User="user";
    private static String Login_User ="join";
    private static String Change_Pass = "pass";
    private static String Reg_name="adpic"; 
    
	public UserFunction() 
	{
		jsonParser = new JSONParser();
	}



	public JSONObject Load_Detail(String s1,String s2,String s3,String s4)
	{
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("tag",User_data));
		params.add(new BasicNameValuePair("id",s1));
		params.add(new BasicNameValuePair("name",s2));
		params.add(new BasicNameValuePair("loc",s3));
		params.add(new BasicNameValuePair("zip",s4));
		JSONObject json = jsonParser.getJSONFromUrl(url_Appin_Technology, params);
        return json;
	}
	
	
	
	
	public JSONObject ADDPhoto(String image,String email)
	{
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("tag",Reg_name));
		params.add(new BasicNameValuePair("img",image));
		params.add(new BasicNameValuePair("email",email));
		JSONObject json = jsonParser.getJSONFromUrl(url_Appin_Technology, params);
		Log.e(params.toString(),json.toString());
        return json;
        
	}
	
}
