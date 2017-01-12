package Day1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MutiShowRoom {
	
	@Autowired
	@Qualifier("multishowroom")
	Shoe s[];

}
