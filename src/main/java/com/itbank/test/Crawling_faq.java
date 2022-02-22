package com.itbank.test;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

@Component
public class Crawling_faq {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> contents = new ArrayList<String>();
		
		final String K_URL1 ="https://kream.co.kr/faq?page=1";
		
	  final String K_URL2="https://kream.co.kr/faq?page=2"; 
	  final String K_URL3="https://kream.co.kr/faq?page=3"; 
	  final String K_URL4="https://kream.co.kr/faq?page=4"; 
	  final String K_URL5="https://kream.co.kr/faq?page=5"; 
	  final String K_URL6="https://kream.co.kr/faq?page=6"; 
	  final String K_URL7="https://kream.co.kr/faq?page=7";
	  
	  list.add(K_URL1);
	  list.add(K_URL2);
	  list.add(K_URL3);
	  list.add(K_URL4);
	  list.add(K_URL5);
	  list.add(K_URL6);
	  list.add(K_URL7);
	 
		 
		
		
		for(int i=0;i<list.size();i++) {
			
			Connection conn = Jsoup.connect(list.get(i));
			
			try {
				
				Document document = conn.get();
				
				Elements qna = document.select("div.content");
			
				
				for(int j=0; j<qna.size();j++) {
					final String content = qna.get(j).text();
					System.out.println(content);
					contents.add(content);
					
				}
				System.out.println();
				
			}
			catch (IOException e){
				e.printStackTrace();
			}
		}
		
		for(String C : contents) {
			C.replace("KREAM", "OLIS");
			System.out.println(C);
		}
		
			
		
	}
}
