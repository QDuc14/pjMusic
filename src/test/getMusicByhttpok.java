package test;


import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

 

public class getMusicByhttpok {
	
	public static void main (String[] args)  {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		ArrayList<String> list = new ArrayList<String>();
		HttpResponse<String> response = Unirest.get("https://unsa-unofficial-spotify-api.p.rapidapi.com/search?query=magenta%20riddim&count=20&type=tracks")
				.header("x-rapidapi-host", "unsa-unofficial-spotify-api.p.rapidapi.com")
				.header("x-rapidapi-key", "816000848fmshd35ce00429d6043p1296fdjsnea474485598e")
				.asString();
		String infString = response.getBody();
		Object obj = infString;

		String[] results = infString.split("Results",2);
		System.out.println(results[0]);

	}

	
}
