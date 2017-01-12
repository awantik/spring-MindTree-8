package CustomAnnotation;

import java.lang.annotation.*;  
import java.lang.reflect.*;  
  
//Single Value Annotation
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface MyAnnotation{  
int value();  
}  
 
//Single Value Annotation
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface MultipleAnnotation{  
	int key() default 100;
	int value();  
} 

//Marker Annotation - Does not take any argument
@Retention(RetentionPolicy.RUNTIME)  
@interface MyMarkerAnnotation{
	
}

//Applying annotation  
@MyMarkerAnnotation
class Hello{
	public int name;
	
@MyAnnotation(value = 10)  
public void sayHello(){
	System.out.println("hello annotation");
	} 

@MultipleAnnotation(value = 20)
public void sayHi(){
	System.out.println("hi annotation");
}

}  

public class CistomAnnMain {

	public static void main(String args[])throws Exception{  
		  
		Hello h=new Hello(); 
		
		//Access 
		Method m=h.getClass().getMethod("sayHello");  
		  
		MyAnnotation manno=m.getAnnotation(MyAnnotation.class);  
		
		System.out.println("value is: "+manno.value()); 
		
		Method m2=h.getClass().getMethod("sayHi");  
		  
		MultipleAnnotation manno2=m2.getAnnotation(MultipleAnnotation.class);  
		System.out.println("value is: "+manno2.key()); 
		
		MyMarkerAnnotation ma = Hello.class.getAnnotation(MyMarkerAnnotation.class);
        System.out.println(ma);
        
        Method me[] = Hello.class.getMethods();
        for(Method mm : me){
        	System.out.println(mm.getName());
        }
        
        Field f[] = Hello.class.getFields();
        for(Field ff : f){
        	System.out.println(f.length);
        }
		}
	
	    

}
