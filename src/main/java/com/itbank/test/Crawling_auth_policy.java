package com.itbank.test;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

@Component
public class Crawling_auth_policy {
	public static void main(String[] args) {
			
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> contents = new ArrayList<String>();
		
		final String K_URL1 ="https://kream.co.kr/auth_policy?category=sneakers&list=true";
		final String K_URL2 ="https://kream.co.kr/auth_policy?category=streetwear&list=true";
		final String K_URL3 ="https://kream.co.kr/auth_policy?category=accessories&list=true";
		final String K_URL4 ="https://kream.co.kr/auth_policy?category=electronics&list=true";
		final String K_URL5 ="https://kream.co.kr/auth_policy?category=life&list=true";
		final String K_URL6 ="https://kream.co.kr/auth_policy?category=premium-watches&list=true";
		final String K_URL7 ="https://kream.co.kr/auth_policy?category=premium-bags&list=true";
			
		
		
		
		
				
		Connection conn = Jsoup.connect(K_URL1);
			
		try {
			
			Document document = conn.get();
			
			Elements qna = document.select("div.wrap_auth");
		
			
			for(int j=0; j<qna.size();j++) {
			
				final String content = qna.get(j).text();

				contents.add(content);
				
			}
			
			
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		Connection conn1 = Jsoup.connect(K_URL2);
		
		try {
			
			Document document = conn1.get();
			
			Elements qna = document.select("div.content.streetwear");
		
			
			for(int j=0; j<qna.size();j++) {
			
				final String content = qna.get(j).text();

				contents.add(content);
				
			}
			
			
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		
		
		

		
		
		
		
		
		Connection conn2 = Jsoup.connect(K_URL3);
		
		try {
			
			Document document = conn2.get();
			
			Elements qna = document.select("div.content.accessories");
		
			
			for(int j=0; j<qna.size();j++) {
			
				final String content = qna.get(j).text();

				contents.add(content);
				
			}
			
			
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		
		Connection conn3 = Jsoup.connect(K_URL4);
		
		try {
			
			Document document = conn3.get();
			
			Elements qna = document.select("div.content.electronics");
		
			
			for(int j=0; j<qna.size();j++) {
			
				final String content = qna.get(j).text();

				contents.add(content);
				
			}
			
			
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	
		
		Connection conn4 = Jsoup.connect(K_URL5);
		
		try {
			
			Document document = conn4.get();
			
			Elements qna = document.select("div.content.life");
		
			
			for(int j=0; j<qna.size();j++) {
			
				final String content = qna.get(j).text();
	
				contents.add(content);
				
			}
			
			
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		Connection conn5 = Jsoup.connect(K_URL6);
		
		try {
			
			Document document = conn5.get();
			
			Elements qna = document.select("div.content.premium-watches");
		
			
			for(int j=0; j<qna.size();j++) {
			
				final String content = qna.get(j).text();
				
				contents.add(content);
				
			}
			
			
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		
		
		
	
		
		
		
		
		Connection conn6 = Jsoup.connect(K_URL7);
		
		try {
			
			Document document = conn6.get();
			
			Elements qna = document.select("div.content.premium-bags");
		
			
			for(int j=0; j<qna.size();j++) {
			
				final String content = qna.get(j).text();
			
				contents.add(content);
				
			}
			
			
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		
		
		
		for(String s : contents) {
			System.out.println(s);
			System.out.println();
		}
		
		
		
		
		
			

			
				
			
		}
}
