package test;

import java.util.ArrayList;
import com.google.gson.Gson;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import DTO.*;
 

public class getSongInf {
	
	public static void main (String[] args)  {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		ArrayList<String> list = new ArrayList<String>();
		HttpResponse<String> response = Unirest.get("https://unsa-unofficial-spotify-api.p.rapidapi.com/search?query=magenta%20riddim&count=20&type=tracks")
				.header("x-rapidapi-host", "unsa-unofficial-spotify-api.p.rapidapi.com")
				.header("x-rapidapi-key", "816000848fmshd35ce00429d6043p1296fdjsnea474485598e")
				.asString();
		String infString = response.getBody();
		music music = gson.fromJson(infString, DTO.music.class);
		System.out.println(music.results);
//		for(int i = 0; i < music.results.size(); i++){
//			System.out.println(music.results.get(i));
//		}

	}

	
}
