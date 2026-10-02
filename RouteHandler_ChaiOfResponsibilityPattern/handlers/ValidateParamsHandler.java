package RouteHandler_ChaiOfResponsibilityPattern.handlers;

import RouteHandler_ChaiOfResponsibilityPattern.DTOs.Request;

public class ValidateParamsHandler implements RequestHandler{
    private final RequestHandler nextHandler;
    public ValidateParamsHandler(FinishingHandler handler){
        this.nextHandler = handler;
    }
    @Override
    public void handle(Request request) {
        System.out.println("validating params");
        this.nextHandler.handle(request);
    }
}
