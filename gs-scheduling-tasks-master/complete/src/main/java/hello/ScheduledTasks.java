package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //fixedDelay - the period will be measured from the completion time of each preceding invocation
    //fixedRate - irrespective of previous task completion
    
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("#The time is now {}", dateFormat.format(new Date()));
    }
    
    @Scheduled(cron="*/5 * * * * TUE-FRI")
    public void reportNewCurrentTime() {
        log.info("@The new time is now {}", dateFormat.format(new Date()));
    }
	
    
    @Scheduled(cron="0 0/2 * 1/1 * ?")
    public void reportAgainCurrentTime() {
        log.info("%The again time is now {}", dateFormat.format(new Date()));
    }
			
			
}
