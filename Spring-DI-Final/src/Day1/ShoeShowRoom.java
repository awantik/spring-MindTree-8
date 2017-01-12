package Day1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ShoeShowRoom {
	
	@Qualifier(value="bata2")
	@Autowired
	 Shoe s1;
	
	public ShoeShowRoom(){
		System.out.println("Creating Shoe Show Room");
	}
}

/*

ShoeShowRoom ssr = new ShoeShowRoom();
ssr.s1 = new Bata();

*/