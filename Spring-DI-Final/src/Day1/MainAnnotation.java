package Day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnotation {

	public static void main(String[] args) {
		//Input to AnnotationConfigApplicationContext is a class which provides bean creation process. It creates Spring container
		
		//ApplicationContext appCtxt = new AnnotationConfigApplicationContext(Conf.class,NewAppConfig.class);
		ApplicationContext newappCtxt = new  AnnotationConfigApplicationContext(DIAppConfig.class);
		
		ShoeShowRoom ssr = newappCtxt.getBean(ShoeShowRoom.class);
		ssr.s1.makeShoeComfortable();
		
		//Getting bean by type
		/*		
		Bata b1 = appCtxt.getBean("b1",Bata.class);
		b1.makeShoeComfortable();
		
		
		Bata b2 = appCtxt.getBean("b1",Bata.class);
		b2.makeShoeComfortable();
		
		if( b1 == b2){
			System.out.println("They are same");
		}else{
			System.out.println("They are not");
		}
		
		
		
		ApplicationContext newappCtxt = new AnnotationConfigApplicationContext(NewAppConfig.class);
		
		Puma p1 = appCtxt.getBean(Puma.class);
		Puma p2 = newappCtxt .getBean(Puma.class);
		
		if( p1 == p2){
			System.out.println("They are same");
		}else{
			System.out.println("They are not");
		}
		
		/*
		Bata b = appCtxt.getBean(Bata.class);
		
		b.makeShoeComfortable();
		
		Bata b2 = appCtxt.getBean(Bata.class);
		
		if ( b == b2 ){
			System.out.println("They are same");
		}else {
			System.out.println("They are not");
		}
		*/
		/*
		//ApplicationContext newappCtxt = new AnnotationConfigApplicationContext(AppConfig.class);
		//Spring container holds all the beans together
		
		//Request Spring Framework to return bean with object name "bata1"
		Bata b = appCtxt.getBean("bata1",Bata.class);
		b.makeShoeLookGood();
		
		
//		Bata b = (Bata) appCtxt.getBean("bata1");
//		
//		//Same because this is singleton
	
		Bata b1 = newappCtxt.getBean("bata2",Bata.class);
		Bata b2 = appCtxt.getBean("bata2", Bata.class);
		Bata b3 = appCtxt.getBean("bata2", Bata.class);
//		
//		b.makeShoeLookGood();
		
		if (b2 == b3){
			System.out.println("They are same");
		}
		if (b1 == b2){
			System.out.println("b1 & b2 : They are same");
		}
		
		Bata b11 = appCtxt.getBean("bata1", Bata.class);
		Bata b12 = appCtxt.getBean("bata1", Bata.class);
		
		System.out.println(b11);
		System.out.println(b12);
		
//		//Not same because this is prototype
//		Puma p1 = appCtxt.getBean("puma1",Puma.class);
//		Puma p2 = appCtxt.getBean("puma1",Puma.class);
//		
//		if (p1 != p2){
//			System.out.println("They are not same puma objets");
		}
*/
	}

}
