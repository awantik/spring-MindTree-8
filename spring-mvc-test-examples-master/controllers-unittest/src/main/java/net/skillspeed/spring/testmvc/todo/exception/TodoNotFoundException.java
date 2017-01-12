package net.skillspeed.spring.testmvc.todo.exception;

/**
 * @author Awantik Das
 */
public class TodoNotFoundException extends Exception {

    public TodoNotFoundException(String message) {
        super(message);
    }

}
