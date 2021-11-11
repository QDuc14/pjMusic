package test_DUC;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import com.google.gson.Gson;
import songLyrics.*;

public class trackDetails {
    public static void main(String[] args) {
        HttpResponse<JsonNode> response = Unirest.get("https://shazam-core.p.rapidapi.com/v1/tracks/details?track_id=341759650")
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
        System.out.println(lyricsInf.getTitle());

        System.out.println(lyricsInf.getSections());
        //songLyrics.sections@28eaa59a

//        lyricsInf lyric = gson.fromJson(jsonStr, lyricsInf.class);
//        System.out.println(lyric);
    }
}
