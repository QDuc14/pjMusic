package test_HIeu;

import com.google.gson.Gson;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import songInformation.*;

public class getSongInf {

	public static void main (String[] args) throws Exception {
		// TODO Auto-generated method stub
		String query = "Nơi này có anh";
		Gson gson = new Gson();
		//Get songs data from api
		HttpResponse<JsonNode> response = Unirest.get("https://shazam-core.p.rapidapi.com/v1/tracks/search?query=Nơi này có anh")
				.header("x-rapidapi-host", "shazam-core.p.rapidapi.com")
				.header("x-rapidapi-key", "533d42cd24msheb307f07f2b6174p1c9e7fjsn952ba01d8c63")
				.asJson();
		//Save data to infString
		JsonNode infString = response.getBody();
		//Parse infString to array name:list
		JSONArray list = infString.getArray();

		String resultsSong;
		//Find song = query
		for(int i = 0; i < list.length(); i++){
			resultsSong = list.get(i).toString();
			//Parse json to obj
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
		System.out.println("CHo Tuan");
	}

	
}
