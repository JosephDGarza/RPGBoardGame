package com.dto;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Backgrounds {
	public static void main(String[] args) {
	
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	
	
	BackgroundDto city = new BackgroundDto("https://hdwallsource.com/img/2014/9/cool-city-background-18304-18768-hd-wallpapers.jpg");
	
	BackgroundDto cityWGreen = new BackgroundDto("http://bestwallpaperhd.com/wp-content/uploads/2013/06/3D-Digital-Forest-City.jpg");
	
	BackgroundDto mountainCreek = new BackgroundDto("http://cdn.pcwallart.com/images/cool-nature-desktop-backgrounds-wallpaper-1.jpg");
	
	BackgroundDto rocksAndWater = new BackgroundDto("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9fy-q0GKBNUhxGWvXKuGAbPa55eKLf_Z-NwY2ZMs53X30e-fd");
	
	BackgroundDto sand = new BackgroundDto("http://www.mycoolbackgrounds.com/backgrounds/22588/Great%20Sand%20Dunes%20National%20Monument,%20Colorado.jpg");
	
	ArrayList<BackgroundDto> data = new ArrayList<BackgroundDto>();
	
	data.add(city);
	data.add(cityWGreen);
	data.add(mountainCreek);
	data.add(rocksAndWater);
	data.add(sand);
	
		
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
