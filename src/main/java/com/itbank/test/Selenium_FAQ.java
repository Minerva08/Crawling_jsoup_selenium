package com.itbank.test;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_FAQ {
	private static String id = "webdriver.chrome.driver";
	private static String path = "D:/chromedriver.exe";
	
	public static void main(String[] args) {
		System.setProperty(id, path);
		
		WebDriver driver = new ChromeDriver();
		
		
			for(int j=1;j<=7;j++) {
				String url = "https://kream.co.kr/faq?list=true&page="+j;
				driver.get(url);
				WebElement click;
				for(int i=1;i<=10;i++) {
					try {
						click = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[2]/div[2]/div/ul/li["+i+"]/div/div[1]"));
						click.click();
					}catch(NoSuchElementException ex){
						System.out.println("게시글 없음");
						continue;
					}
					System.out.println(click.getText());
					System.out.println();
					
					click = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[2]/div[2]/div/ul/li["+i+"]/div/div[2]/div"));
					System.out.println(click.getText());
					System.out.println();
					System.out.println();
					
					click = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[2]/div[2]/div/ul/li["+i+"]/div/div[1]"));
					click.click();
					
					
					if(j==5 && i==10) {
						click = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[2]/div[2]/div/div[3]/div/div[3]/a[1]"));
						click.click();
						continue;
					}
					
								
					if(i==10 && j<6) {
						System.out.println("end");
						click = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/a["+(j+1)+"]"));
						click.click();
					}
					else if(i==10 && j==6) {
						click= driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/a[2]"));
						click.click();
					}
					
					
				}
				
				
				
			}
			
		
	}


}
