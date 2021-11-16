package BLL;

import com.google.gson.Gson;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import songInformation.songInf;

public class Songs {

    public JSONArray getDataFromAPI (String query){
        //Get songs data from api
        HttpResponse<JsonNode> response = Unirest.get("https://shazam-core.p.rapidapi.com/v1/tracks/search?query=" + query)
                .header("x-rapidapi-host", "shazam-core.p.rapidapi.com")
                .header("x-rapidapi-key", "533d42cd24msheb307f07f2b6174p1c9e7fjsn952ba01d8c63")
                .asJson();
        //Save data to infString
        JsonNode infString = response.getBody();
        //Parse infString to array name:list
        JSONArray list = infString.getArray();
        return list;
    }

    public String getSongId(JSONArray list, String query){
        Gson gson = new Gson();
        String resultsSong;
        String result = "";
        //Find song = query
        for(int i = 0; i < list.length(); i++){
            resultsSong = list.get(i).toString();
            //Parse json to obj
            songInf data = gson.fromJson(resultsSong, songInf.class);
            if(query.equalsIgnoreCase(data.heading.title))
                result = data.getId();
        }
        return result;
    }


    public static void main(String[] args) throws Exception {
        Songs song = new Songs();
        String query = "nơi này có anh";
        JSONArray list = song.getDataFromAPI(query);
        System.out.println(song.getSongId(list, query));
    }
}
