package RouteHandler_ChaiOfResponsibilityPattern.handlers;

import RouteHandler_ChaiOfResponsibilityPattern.DTOs.Request;

public class AuthorisationRequestHandler implements RequestHandler{

    private final RequestHandler nextHandler;
    public AuthorisationRequestHandler(RequestHandler handler){
        this.nextHandler = handler;
    }
    @Override
    public void handle(Request request) {
        System.out.println("doing authoristion");
        this.nextHandler.handle(request);
    }
}
