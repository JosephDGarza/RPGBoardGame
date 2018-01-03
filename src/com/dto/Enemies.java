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
		scrub.setAttack("Scrub gives you a prostate exam for ");
		scrub.setMiss(5);
		scrub.setMissScript("Forgot to wear his gloves today, so no prostate exam! No damage taken");
		
		
		EnemyDto frog = new EnemyDto();
		frog.setHp(35);
		frog.setCurrentHp(35);
		frog.setDodge(2);
		frog.setName("Frog King");
		frog.setStr(11);
		frog.setImgurl("<img\r\n" + 
				"	src=\"http://img2.wikia.nocookie.net/__cb20141220023915/villains/images/e/ed/King_Wart.jpg\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		frog.setAttack("Frog King chokes you with his chain for ");
		frog.setMiss(5);
		frog.setMissScript("Frog King broke his chain! No damage taken");
		
		EnemyDto smiley = new EnemyDto();
		smiley.setHp(13);
		smiley.setCurrentHp(13);
		smiley.setDodge(2);
		smiley.setName("Smiley");
		smiley.setStr(15);
		smiley.setImgurl("<img\r\n" + 
				"	src=\"http://www.fille.com/blog_article/Smiley-face3.gif\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		smiley.setAttack("Smiley viciously tears your flesh with his braces for ");
		smiley.setMiss(5);
		smiley.setMissScript("Smiley broke his braces on you! No damage taken");
		
		
		EnemyDto fireelmo = new EnemyDto();
		fireelmo.setHp(40);
		fireelmo.setCurrentHp(40);
		fireelmo.setDodge(2);
		fireelmo.setName("Fire Elmo");
		fireelmo.setStr(14);
		fireelmo.setImgurl("<img\r\n" + 
				"	src=\"https://media.giphy.com/media/yr7n0u3qzO9nG/giphy.gif\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		fireelmo.setAttack("Fire Elmo brings you to where all of semestry street went... For ");
		fireelmo.setMiss(2);
		fireelmo.setMissScript("Hell froze over! No damage taken");
		
		
		EnemyDto trex  = new EnemyDto();
		trex.setHp(45);
		trex.setCurrentHp(45);
		trex.setDodge(2);
		trex.setName("Baddass Trex");
		trex.setStr(5);
		trex.setImgurl("<img\r\n" + 
				"	src=\"https://i.pinimg.com/originals/35/09/7d/35097d789cd257e415870866eb17ec0a.jpg\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		trex.setAttack("Baddass Trex disrespects you. Instead of shooting you, he slaps you with his tiny arms for ");
		trex.setMiss(10);
		trex.setMissScript("Baddass Trex couldn't reach. No damage taken");
		
		EnemyDto cuteKitten = new EnemyDto();
		cuteKitten.setHp(20);
		cuteKitten.setCurrentHp(20);
		cuteKitten.setDodge(2);
		cuteKitten.setName("Cute Kitten... Or is it...?");
		cuteKitten.setStr(10);
		cuteKitten.setImgurl("<img src=\"https://i.ytimg.com/vi/LHrRgtD-RNg/maxresdefault.jpg\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		cuteKitten.setAttack("The kitten is actually the devil. He stabs you with his pitch fork for ");
		cuteKitten.setMiss(5);
		cuteKitten.setMissScript("The kitten decided it was nap time. No damage taken");
		
		EnemyDto heart = new EnemyDto();
		heart.setHp(1);
		heart.setCurrentHp(1);
		heart.setDodge(0);
		heart.setName("Heal");
		heart.setStr(-50);
		heart.setImgurl("<img src=\"https://media.giphy.com/media/xUPGcgvoipFxRtpMl2/giphy.gif\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		heart.setAttack("You've been healed for 50 health!");
		heart.setMiss(0);
		heart.setMissScript("");
		
		EnemyDto alien = new EnemyDto();
		alien.setHp(30);
		alien.setCurrentHp(30);
		alien.setDodge(2);
		alien.setName("Boss Alien");
		alien.setStr(7);
		alien.setImgurl("<img src=\"https://res.cloudinary.com/format-magazine-production/image/upload/c_crop,h_400,w_479,x_0,y_35,f_gif,f_auto/dpr_1.0/c_scale,w_1200,h_1002/alien\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		alien.setAttack("Boss Alien dropped a bottle on you. He doesn't care. His ignorance hits you for ");
		alien.setMiss(7);
		alien.setMissScript("You went into another isle. No damage taken");
		
		
		
		
		EnemyDto mikeWazowski = new EnemyDto();
		mikeWazowski.setHp(15);
		mikeWazowski.setCurrentHp(15);
		mikeWazowski.setDodge(2);
		mikeWazowski.setName("Mike Wazowski");
		mikeWazowski.setStr(3);
		mikeWazowski.setImgurl("<img src=\"https://vignette.wikia.nocookie.net/pixar/images/6/65/Gaming-disney-infinity-monsters-inc-1.jpg/revision/latest?cb=20130123184936\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		mikeWazowski.setAttack("Mike Wazowski accidentally gets eye juice on you. The disgust hurts you for ");
		mikeWazowski.setMiss(5);
		mikeWazowski.setMissScript("Mike Wazowski had his glasses on today. No disgusting eye juice on you. No damage taken");
		
		
		EnemyDto tickleMonster  = new EnemyDto();
		tickleMonster.setHp(25);
		tickleMonster.setCurrentHp(25);
		tickleMonster.setDodge(2);
		tickleMonster.setName("Mr. Tickles");
		tickleMonster.setStr(5);
		tickleMonster.setImgurl("<img src=\"https://s3.amazonaws.com/indieobscura-www/assets/editorial/2017/04/little-nightmares-monsters-the-janitor.png\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		tickleMonster.setAttack("Mr. Tickles tickles you. You pee your pants for ");
		tickleMonster.setMiss(5);
		tickleMonster.setMissScript("Mr. Tickles couldn't find your tickle spot. No damage taken");
		
		
		EnemyDto superman  = new EnemyDto();
		superman.setHp(60);
		superman.setCurrentHp(60);
		superman.setDodge(2);
		superman.setName("Weird Guy With Underwear Outside Pants");
		superman.setStr(20);
		superman.setImgurl("<img src=\"http://cartoon-characters.com/wp-content/uploads/2014/05/Superman.jpg\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		superman.setAttack("Undwear guy retaliates, you fly accross the world for ");
		superman.setMiss(60);
		superman.setMissScript("Undwear guy acts like you're not even there as you hit him. No damage taken");
		
		
		EnemyDto spongebob  = new EnemyDto();
		spongebob.setHp(40);
		spongebob.setCurrentHp(40);
		spongebob.setDodge(2);
		spongebob.setName("Funny Pants");
		spongebob.setStr(7);
		spongebob.setImgurl("<img src=\"http://cdn.smosh.com/sites/default/files/bloguploads/spongebob-gif-idgaf.gif\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		spongebob.setAttack("Funny Pants makes you laugh so hard your stomach hurts for ");
		spongebob.setMiss(5);
		spongebob.setMissScript("This episode of SpongeBob sucked. No laughter, no damage taken");
		
		EnemyDto arm  = new EnemyDto();
		arm.setHp(1);
		arm.setCurrentHp(1);
		arm.setDodge(0);
		arm.setName("Strength Bonus");
		arm.setStr(0);
		arm.setImgurl("<img src=\"http://images.clipartpanda.com/muscle-clipart-pT788pjT9.jpg\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		arm.setAttack("You have gained 1+str ");
		arm.setMiss(0);
		arm.setMissScript("");
		
		
		EnemyDto theFlash  = new EnemyDto();
		theFlash.setHp(15);
		theFlash.setCurrentHp(15);
		theFlash.setDodge(50);
		theFlash.setName("Some Fast Nerd");
		theFlash.setStr(6);
		theFlash.setImgurl("<img src=\"http://tvshowlovers.blob.core.windows.net/images/original/000/000/411.jpg\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		theFlash.setAttack("You're not sure what happened. But there's a hand print on your rear end for ");
		theFlash.setMiss(1);
		theFlash.setMissScript("Did he move? No damage taken");
		
		
		EnemyDto deante  = new EnemyDto();
		deante.setHp(30);
		deante.setCurrentHp(30);
		deante.setDodge(2);
		deante.setName("Random Bully");
		deante.setStr(10);
		deante.setImgurl("<img src=\"https://image.ibb.co/mxtoMb/IMG_2762.jpg\" width=\"500\" height=\"500\">");
		deante.setAttack("He calls you fat. Your self esteem is hurt for ");
		deante.setMiss(8);
		deante.setMissScript("His insult made no sense. No damage taken");
		
		EnemyDto rollback = new EnemyDto();
		rollback.setHp(1);
		rollback.setCurrentHp(1);
		rollback.setDodge(0);
		rollback.setName("Time to go back some squares!");
		rollback.setStr(0);
		rollback.setImgurl("<img src=\"https://cdn-images-1.medium.com/max/2000/1*WCCNcRCDUsku7IM34r58Lg.jpeg\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		rollback.setAttack("You're sent back squares ");
		rollback.setMiss(0);
		rollback.setMissScript("");
		
		EnemyDto car = new EnemyDto();
		car.setHp(75);
		car.setCurrentHp(75);
		car.setDodge(0);
		car.setName("THE CAR FROM STREET FIGHTER!!");
		car.setStr(3);
		car.setImgurl("<img src=\"https://i.pinimg.com/736x/b5/8c/f1/b58cf176de790240ebe2ea7eb7a5b275--fun-gif-street-fighter.jpg\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		car.setAttack("Don't know why Ryu and Ken fight this car. Your hands hurt for ");
		car.setMiss(5);
		car.setMissScript("You punched the soft seats. Is that leather? No damage taken");
		
		
		ArrayList<EnemyDto> data = new ArrayList<EnemyDto>();
		data.add(frog);
		data.add(scrub);
		data.add(fireelmo);
		data.add(smiley);
		data.add(trex);
		data.add(cuteKitten);
		data.add(heart);
		data.add(alien);
		data.add(mikeWazowski);
		data.add(tickleMonster);
		data.add(superman);
		data.add(spongebob);
		data.add(arm);
		data.add(theFlash);
		data.add(deante);
		data.add(rollback);
		data.add(car);
		
		
		
		
		
		
		

		
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
