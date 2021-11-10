package test_DUC;

import com.google.gson.Gson;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class getSongInf {

	public static void main (String[] args)  {
		// TODO Auto-generated method stub

		Gson gson = new Gson();
		HttpResponse<String> response = Unirest.get("https://shazam-core.p.rapidapi.com/v1/tracks/search?query=Nơi này có anh")
				.header("x-rapidapi-host", "shazam-core.p.rapidapi.com")
				.header("x-rapidapi-key", "816000848fmshd35ce00429d6043p1296fdjsnea474485598e")
				.asString();
		String infString = response.getBody();
//		for(int i = 0; i < list.length();i++){
			System.out.println("alo alo alo alo alo alo alo alo alo alo alo alo alo alo");
			System.out.println(infString);
//		}


//		music music = gson.fromJson(infString, DTO.music.class);
//		for(int i = 0; i < music.results.size(); i++){
//			System.out.println(infString);
//		}

	}

	
}
