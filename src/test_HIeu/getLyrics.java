package test_HIeu;

import com.google.gson.Gson;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import songLyrics.lyricsInf;
import BLL.*;
public class getLyrics {
    public static void main(String[] args){

        String id = ;
        HttpResponse<JsonNode> response = Unirest.get("https://shazam-core.p.rapidapi.com/v1/tracks/details?track_id="+id)
                .header("x-rapidapi-host", "shazam-core.p.rapidapi.com")
                .header("x-rapidapi-key", "533d42cd24msheb307f07f2b6174p1c9e7fjsn952ba01d8c63")
                .asJson();
        Gson gson = new Gson();
        JsonNode results = response.getBody();
        //Convert json to String
        String jsonStr = results.toString();
        System.out.println(jsonStr);
        //create lyricsInf obj from jsonStr
        lyricsInf lyricsInf = gson.fromJson(jsonStr, songLyrics.lyricsInf.class);
        for(int i = 0; i < lyricsInf.getSections()[1].getText().length; i++){
            System.out.println(lyricsInf.getSections()[1].getText()[i]);
        }
    }
}
