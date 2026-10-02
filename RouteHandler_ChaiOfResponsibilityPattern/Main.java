package RouteHandler_ChaiOfResponsibilityPattern;

import RouteHandler_ChaiOfResponsibilityPattern.DTOs.Request;
import RouteHandler_ChaiOfResponsibilityPattern.Schema.Todo;
import RouteHandler_ChaiOfResponsibilityPattern.controllers.TodoController;

public class Main {
    public static void main(String[] args){
        Todo todo = new Todo(1,"complete design pattern","study COR design pattern");
        Request<Todo> request = new Request<>(
                1,
                "POST",
                "/todo/create",
                todo
        );
        TodoController controller = new TodoController();
        Todo result = controller.createTodo(request);

        System.out.println("Title: " + result.getTitle());
        System.out.println("Description: " + result.getDescription());
        System.out.println("Status: " + result.getStatus());
    }
}
