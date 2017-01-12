package net.skillspeed.spring.testmvc.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skillspeed.spring.testmvc.todo.model.Todo;

/**
 * @author Awantik Das
 */
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
