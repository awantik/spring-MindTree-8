package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/newgreeting/{id}")
    public Greeting newGreeting(@RequestParam(value="name", defaultValue="GreatWorld") String name, 
    		@PathVariable("id") int empId) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name + " " +empId));
    }
    
    @RequestMapping("/delnewgreeting/{id}")
    public Greeting delnewGreeting(@RequestParam(value="name", defaultValue="GreatWorld") String name, 
    		@PathVariable("id") int empId) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name + " " +empId));
    }
    
    
}
