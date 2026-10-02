package RouteHandler_ChaiOfResponsibilityPattern.controllers;

import RouteHandler_ChaiOfResponsibilityPattern.DTOs.Request;
import RouteHandler_ChaiOfResponsibilityPattern.Schema.Todo;
import RouteHandler_ChaiOfResponsibilityPattern.factory.RequestHandlerFactory;
import RouteHandler_ChaiOfResponsibilityPattern.handlers.*;

public class TodoController {
    public Todo createTodo(Request<Todo> request){
        RequestHandlerFactory.getHandlersForCreateTodo().handle(request);

        System.out.println(request.getPayload());
        return request.getPayload();
    }
}
