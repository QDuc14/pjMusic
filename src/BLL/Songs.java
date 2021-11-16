package BLL;

import com.google.gson.Gson;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import songInformation.songInf;

public class Songs {
    Gson gson = new Gson();
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
    public songInfomation getSongInfo(String query, JSONArray list){
        songInfomation song = new songInfomation();
        String resultsSong;
        String result;
        for(int i = 0; i < list.length(); i++){
            resultsSong = list.get(i).toString();
            //Parse json to obj
            songInf data = gson.fromJson(resultsSong, songInf.class);
            if(query.equalsIgnoreCase(data.heading.title)) {
                song.setId(data.getId());
                song.setTitle(data.heading.getTitle());
                song.setSubtitle(data.heading.getSubtitle());
                song.setArtist(data.getAlias());
            }
        }
        return song;
    }


    public static void main(String[] args) throws Exception {
        Songs song = new Songs();
        String query = "nơi này có anh";
        JSONArray list = song.getDataFromAPI(query);
        songInfomation result = song.getSongInfo(query,list);
        System.out.println(result.getId());
    }
}
