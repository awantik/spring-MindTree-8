package Day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIAnnotationMain {

	public static void main(String[] args) {
		
		ApplicationContext appCtxt = new AnnotationConfigApplicationContext(DIAppConfig.class);
		
		//Bata b = appCtxt.getBean(Bata.class);
	   // Bata b2 = appCtxt.getBean("bata1", Bata.class);
	   /* 
		Bata b2 = appCtxt.getBean("bata2", Bata.class);
		Bata b3 = appCtxt.getBean("bata2", Bata.class);
		
		Bata b4 = appCtxt.getBean("bata1", Bata.class);
		Bata b5 = appCtxt.getBean("bata1", Bata.class);

		// Not same because prototype & different objects
		if( b2 == b3){
			System.out.println("b2 & b3 They are same");
		}
		
		// Same because singleton & same objects
		if( b4 == b5){
			System.out.println("b4 & b5 They are same");
		}
		
		
		ShoeShowRoom ssr = appCtxt.getBean(ShoeShowRoom.class);
		System.out.println(ssr);
		System.out.println(ssr.s1);
		
		ShoeShowRoom ssr2 = appCtxt.getBean(ShoeShowRoom.class);
		System.out.println(ssr2);
		System.out.println(ssr2.s1);
		*/
		MutiShowRoom ssr = (MutiShowRoom) appCtxt.getBean(MutiShowRoom.class);
		ssr.s[1].makeShoeComfortable();
		

	}

}
