package Day1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
class NewAppConfig {
	
	@Bean(name="b2")
	//@Scope("prototype")
	public Bata getBataShoe(){
		return new Bata();
	}
	
	@Bean(name="p1")
	protected Puma getPumaShoe(){
		return new Puma();
	}
	
	@Bean(name="b1")
	@Scope("prototype")
	public Bata getNewBataShoe(){
		return new Bata();
	}
    
}

@Configuration
class Conf{
	@Bean(name="p3")
	protected Puma getPumaShoe(){
		return new Puma();
	}
}