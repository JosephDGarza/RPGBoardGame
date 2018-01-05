package com.dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HorizontalBoardMaker {

	public static void main(String[] args) {
		String divs ="";
		String css ="";
		int i =0;
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		String imgurl="";
		String name="";
		int str = 0;
		int hp = 0;
		Object[] obj = new Object[4];
		
		
		// 100 difference in height from sides and top/bottom
		// Pixels going up or down need to incriment by 290 to display box entirely. 
		// Pixels going side to side boxes need to adjust 210
		//decrement to fill going down to up, or left to right. Increment I to go down or to the right.
		//populate from left to right = set pixel to 270 then pixel = pixel +210
		//bottom row height should be 760px
		//Top height starts at 60px first item being 480px from the left.
		int pixel = 270; 
		// for (i=13; i > 8; i--) { for bottom 5 tiles
		
		//for (i=1; i < 6; i++) { top 5 tiles
		
		for (i=13; i > 8; i--) {
		
		pixel += 210;
		String query = "select imgurl,name,str,hp from EnemyDto WHERE id = '"
				+ i + "'";

		System.out.println(query);
		Query q2 = s.createQuery(query);

		q2.setFirstResult(0);
		q2.setMaxResults(1);
		List results = q2.list();
		Iterator it = results.iterator();
		List<EnemyDto> list = new ArrayList<EnemyDto>();
		while (it.hasNext()) {

			// Objects position is being correlated by the createQuery above. IE. g.appID is
			// the first, so that would be obj[0]
			obj = (Object[]) it.next();
			imgurl = (String) obj[0];
			name = (String) obj[1];
			str = (int) obj[2];
			hp = (int) obj[3];
			
			String[] convimg = imgurl.split("width=\"");
			convimg[0]+="width=\"175\" height=\"175\">";
			
			
			//This creates my div containers to host the images on my board
			divs = "<div id=\"picture" + i +"\">\r\n" + 
					" " + convimg[0] + "<div class=\"pic_transform" +i +"\">\r\n" +  
					"\r\n" + 
					"  <h2><span>"+i+"<span class='spacer'></span><br /><span class='spacer'></span></span></h2>\r\n" + 
					"  \r\n" + 
					"        <div class=\"text_display" +i +"\">\r\n" + 
					"          <h4>" + name + "<br>" + "HP: " + hp + " STR: "+ str + "<br> </h4> (base stats only)\r\n" + 
					"          \r\n" + 
					"           \r\n" + 
					"        </div>\r\n" + 
					"    </div>\r\n" + 
					"\r\n" + 
					"</div>";
			
			//This creates the css for each image to host its location on the board
			css = "#picture"+i+ "{\r\n" + 
					"  	  position: absolute;\r\n" + 
					"		top: "+ 760 +"px;\r\n" + 
					"		left: "+pixel+"px;\r\n" + 
					"      width: 175x;\r\n" + 
					"      height: 200px;\r\n" + 
					"\r\n" + 
					"      background-size: 200px 200px;\r\n" + 
					"      border: 14px solid rgba(7, 71, 115, .7); \r\n" + 
					"      -webkit-box-sizing: border-box;\r\n" + 
					"      -moz-box-sizing: border-box;\r\n" + 
					"      -ms-box-sizing: border-box;\r\n" + 
					"       box-sizing: border-box;\r\n" + 
					"       -webkit-box-shadow: 5px 5px 5px #111;\r\n" + 
					"     box-shadow: 5px 5px 50px #111;      \r\n" + 
					"               }\r\n" + 
					"\r\n" + 
					"\r\n" + 
					".pic_transform"+ i +"{\r\n" + 
					"        transition-duration: 0.5s;            \r\n" + 
					"        -webkit-transition-duration: 0.5s; \r\n" + 
					"        -moz-transition-duration: 0.5s;    \r\n" + 
					"        -o-transition-duration: 0.5s;\r\n" + 
					"         overflow: hidden;\r\n" + 
					"         height: 0px;\r\n" + 
					"                         }\r\n" + 
					"\r\n" + 
					"#picture" +i +":hover .pic_transform"+i +"{\r\n" + 
					"          height: 100px;\r\n" + 
					"                          }\r\n" + 
					"\r\n" + 
					".text_display" +i +"{\r\n" + 
					"        transform-origin: top;               \r\n" + 
					"        transition-duration: 0.5s;               \r\n" + 
					"        -webkit-transform-origin: top;       \r\n" + 
					"        -webkit-transition-duration: 0.5s;   \r\n" + 
					"        -moz-transform-origin: top;           \r\n" + 
					"        -moz-transition-duration: 0.5s;       \r\n" + 
					"        -o-transform-origin: top;    \r\n" + 
					"        -o-transition-duration: 0.5s;\r\n" + 
					"        font-size: 16px;\r\n" + 
					"        font-family: Arial;       \r\n" + 
					"        font-weight: normal;\r\n" + 
					"        text-align:center;\r\n" + 
					"        color: #FFF;       \r\n" + 
					"                     }\r\n" + 
					"\r\n" + 
					"#picture"+i+":hover .text_display"+i+ "{\r\n" + 
					"         background: rgba(0, 0, 0, 0.5);   \r\n" + 
					"         color: #fff;   \r\n" + 
					"           \r\n" + 
					"                      }\r\n" + 
					"";
			
			System.out.println(divs + "\n \n");
			
			
			
//			System.out.println(css + "\n \n \n \n");
			
			
			
			
			
			
		}
		
		}
		System.out.println("done");
			s.flush();
			s.close();
	}

}
