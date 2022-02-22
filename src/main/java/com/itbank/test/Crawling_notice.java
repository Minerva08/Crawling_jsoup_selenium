package com.itbank.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

@Component
public class Crawling_notice {

	public static void main(String[] args) {
			
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<HashMap<String, String>> contents = new ArrayList<HashMap<String, String>>();
		
		for(int i=1;i<=277;i++) {
			String N_url = "https://kream.co.kr/notice/"+i;
			list.add(N_url);
		}
			
		for(int i=0;i<list.size();i++) {
			
			Connection conn = Jsoup.connect(list.get(i));
			
			try {
				
				Document document = conn.get();
				
				Elements date = document.select(".title_box > .date");
				Elements title = document.select(".title_box > p");
				
			
				
				for(int j=0; j<date.size();j++) {
					HashMap<String, String> Notice =  new HashMap<String, String>();
					Notice.put("Title",title.get(j).text());
					Notice.put("Date",date.get(j).text());
					contents.add(Notice);
					
				}
				
			}
			catch (IOException e){
				e.printStackTrace();
			}
			
		}
	
			
			
		}
}
