package com.sample.todo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sample.todo.service.TodoService;
import com.sample.todo.vo.Todo;

public class App {

	public static void main(String[] args)  {
		
		String resource = "classpath:/META-INF/spring/app-context.xml";
		
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		TodoService service = context.getBean(TodoService.class);
		
		
		List<Todo> todo = service.getAllTodo();
		System.out.println("��ȸ�� �Խñ� �� : " + todo.size());
	
		Todo todos = new Todo();
		
		todos.setTitle("����");
		todos.setContents("ddd");
		todos.setCompleted("�ƴϿ�");
		todos.setDates("2017-12-05");
		
		service.addTodo(todos);
		service.deleteTodo(6);
	}
}
