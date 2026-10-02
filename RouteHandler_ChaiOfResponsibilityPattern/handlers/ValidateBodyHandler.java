package RouteHandler_ChaiOfResponsibilityPattern.handlers;

import RouteHandler_ChaiOfResponsibilityPattern.DTOs.Request;

public class ValidateBodyHandler implements RequestHandler{

    private final RequestHandler nextHandler;
    public ValidateBodyHandler(RequestHandler handler){
        this.nextHandler = handler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("validating body");
        this.nextHandler.handle(request);
    }
}
