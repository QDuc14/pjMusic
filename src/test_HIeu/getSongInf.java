package test_HIeu;

import com.google.gson.Gson;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import DTO.*;

public class getSongInf {

	public static void main (String[] args) throws Exception {
		// TODO Auto-generated method stub
//		ArrayList <actions> actionsList = new ArrayList<>();
		Gson gson = new Gson();
		HttpResponse<JsonNode> response = Unirest.get("https://shazam-core.p.rapidapi.com/v1/tracks/search?query=Nơi này có anh")
				.header("x-rapidapi-host", "shazam-core.p.rapidapi.com")
				.header("x-rapidapi-key", "533d42cd24msheb307f07f2b6174p1c9e7fjsn952ba01d8c63")
				.asJson();
		JsonNode infString = response.getBody();
		JSONArray list = infString.getArray();
		String resultsSong;
		String query = "Nơi này có anh";
		for(int i = 0; i < list.length(); i++){
			resultsSong = list.get(i).toString();
			songInf data = gson.fromJson(resultsSong, songInf.class);
			if(query.equalsIgnoreCase(data.heading.title)){
				System.out.println("Title: " + data.heading.title);
				System.out.println("Subtitle: "+data.heading.subtitle);
				System.out.println("=======================");
				for(int j = 0; j < data.getActions().length;j++){
					System.out.println(data.getActions()[0].getId());
					System.out.println(data.getActions()[0].getType());
					System.out.println(data.getActions()[0].getName());
				}
				break;
			}
		}
		System.out.println("=======================");
		System.out.println("=======================");
	}

	
}
