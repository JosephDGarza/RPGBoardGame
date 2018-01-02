package com.dto;

import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Enemies {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		EnemyDto scrub = new EnemyDto();
		scrub.setHp(25);
		scrub.setCurrentHp(25);
		scrub.setDodge(2);
		scrub.setName("Scrub");
		scrub.setStr(8);
		scrub.setImgurl("<img\r\n" + 
				"	src=\"http://media.gettyimages.com/photos/male-surgeon-wearing-scrubs-holding-up-gloved-hands-portrait-picture-id200445831-001?s=612x612\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		
		EnemyDto frog = new EnemyDto();
		frog.setHp(35);
		frog.setCurrentHp(35);
		frog.setDodge(2);
		frog.setName("Frog King");
		frog.setStr(11);
		frog.setImgurl("<img\r\n" + 
				"	src=\"http://img2.wikia.nocookie.net/__cb20141220023915/villains/images/e/ed/King_Wart.jpg\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		
		EnemyDto smiley = new EnemyDto();
		smiley.setHp(13);
		smiley.setCurrentHp(13);
		smiley.setDodge(2);
		smiley.setName("Smiley");
		smiley.setStr(15);
		smiley.setImgurl("<img\r\n" + 
				"	src=\"http://www.fille.com/blog_article/Smiley-face3.gif\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		ArrayList<EnemyDto> data = new ArrayList<EnemyDto>();
		data.add(scrub);
		data.add(frog);
		data.add(smiley);
		

		
		for (int i =0; i< data.size(); i++) {
			System.out.println(data.get(i));
			Session session = factory.openSession();
			Transaction t = (Transaction) session.beginTransaction();

			session.persist(data.get(i));
			t.commit();
			session.close();
		
		}
		
		System.out.println("emeny update complete.");
	}

}
