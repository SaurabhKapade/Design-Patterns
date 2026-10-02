package RouteHandler_ChaiOfResponsibilityPattern.handlers;

import RouteHandler_ChaiOfResponsibilityPattern.DTOs.Request;

public class FinishingHandler implements RequestHandler{
    @Override
    public void handle(Request request) {
        System.out.println("finishing the request");
    }
}
