package RouteHandler_ChaiOfResponsibilityPattern.handlers;

import RouteHandler_ChaiOfResponsibilityPattern.DTOs.Request;

public class AuthenticationRequestHandler implements RequestHandler{
    private final RequestHandler nextHandler;
    public AuthenticationRequestHandler(RequestHandler handler){
        nextHandler = handler;
    }
    @Override
    public void handle(Request request) {
        System.out.println("doing authetication");
        this.nextHandler.handle(request);
    }
}
