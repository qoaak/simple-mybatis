package com.sample.todo.mappers;

import java.util.List;

import com.sample.todo.vo.Todo;

public interface TodoMapper {

	List<Todo> getAllTodo();
	void addTodo(Todo todo);
	void deleteTodo(int no);
}
