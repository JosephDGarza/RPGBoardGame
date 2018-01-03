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
		
		
		EnemyDto fireelmo = new EnemyDto();
		fireelmo.setHp(40);
		fireelmo.setCurrentHp(40);
		fireelmo.setDodge(2);
		fireelmo.setName("Fire Elmo");
		fireelmo.setStr(14);
		fireelmo.setImgurl("<img\r\n" + 
				"	src=\"https://media.giphy.com/media/yr7n0u3qzO9nG/giphy.gif\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		
		
		EnemyDto trex  = new EnemyDto();
		trex.setHp(45);
		trex.setCurrentHp(45);
		trex.setDodge(2);
		trex.setName("Baddass Trex");
		trex.setStr(5);
		trex.setImgurl("<img\r\n" + 
				"	src=\"https://i.pinimg.com/originals/35/09/7d/35097d789cd257e415870866eb17ec0a.jpg\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		
		EnemyDto cuteKitten = new EnemyDto();
		cuteKitten.setHp(20);
		cuteKitten.setCurrentHp(20);
		cuteKitten.setDodge(2);
		cuteKitten.setName("Cute Kitten... Or is it...?");
		cuteKitten.setStr(10);
		cuteKitten.setImgurl("<img src=\"https://i.ytimg.com/vi/LHrRgtD-RNg/maxresdefault.jpg\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		
		EnemyDto heart = new EnemyDto();
		heart.setHp(1);
		heart.setCurrentHp(1);
		heart.setDodge(0);
		heart.setName("Heal");
		heart.setStr(-50);
		heart.setImgurl("<img src=\"https://media.giphy.com/media/xUPGcgvoipFxRtpMl2/giphy.gif\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		
		EnemyDto alien = new EnemyDto();
		alien.setHp(30);
		alien.setCurrentHp(30);
		alien.setDodge(2);
		alien.setName("Boss Alien");
		alien.setStr(7);
		alien.setImgurl("<img src=\"https://res.cloudinary.com/format-magazine-production/image/upload/c_crop,h_400,w_479,x_0,y_35,f_gif,f_auto/dpr_1.0/c_scale,w_1200,h_1002/alien\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		
		EnemyDto mikeWazowski = new EnemyDto();
		mikeWazowski.setHp(15);
		mikeWazowski.setCurrentHp(30);
		mikeWazowski.setDodge(2);
		mikeWazowski.setName("Mike Wazowski");
		mikeWazowski.setStr(3);
		mikeWazowski.setImgurl("<img src=\"https://vignette.wikia.nocookie.net/pixar/images/6/65/Gaming-disney-infinity-monsters-inc-1.jpg/revision/latest?cb=20130123184936\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		
		EnemyDto tickleMonster  = new EnemyDto();
		tickleMonster.setHp(15);
		tickleMonster.setCurrentHp(30);
		tickleMonster.setDodge(2);
		tickleMonster.setName("Mr. Tickles");
		tickleMonster.setStr(3);
		tickleMonster.setImgurl("<img src=\"https://s3.amazonaws.com/indieobscura-www/assets/editorial/2017/04/little-nightmares-monsters-the-janitor.png\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		
		
		
		
		
		ArrayList<EnemyDto> data = new ArrayList<EnemyDto>();
		data.add(scrub);
		data.add(frog);
		data.add(smiley);
		data.add(fireelmo);
		data.add(trex);
		data.add(cuteKitten);
		data.add(heart);
		data.add(alien);
		data.add(mikeWazowski);
		data.add(tickleMonster);
		
		
		

		
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
