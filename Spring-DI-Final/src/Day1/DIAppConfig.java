package Day1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class DIAppConfig {
	
	@Bean(name="bata1")
	public Shoe getShoeBean(){
		return new Bata();
	}
	
	@Bean(name="bata2")
	public Shoe getnewShoeBean(){
		return new Bata();
	}
	/*
	@Bean(name="bata2")
	//@Scope("prototype")
	public Shoe getMoreShoeBean(){
		return new Bata("Great Stuff");
	}
	*/
	@Bean
	//@Scope("prototype")
	public ShoeShowRoom getssr(){
		return new ShoeShowRoom();
	}
	/*
	@Bean(name="puma1")
	public Puma getPumaBean(){
		return new Puma();
	}
    
	
	@Bean(name="multishowroom")
	Shoe[] getNew(){
		Shoe s[] = new Bata[10];
		for(int i = 0; i < s.length; i++){
			s[i] = new Bata();
		}
		return s;
	}
	
	@Bean
	MutiShowRoom getMSR(){
		return new MutiShowRoom();
	}
	*/
	
	
}
