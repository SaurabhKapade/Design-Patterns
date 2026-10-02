package RouteHandler_ChaiOfResponsibilityPattern.factory;

import RouteHandler_ChaiOfResponsibilityPattern.handlers.*;

public class RequestHandlerFactory {
    public static RequestHandler getHandlersForCreateTodo(){
        return new AuthenticationRequestHandler(
                new AuthorisationRequestHandler(
                        new ValidateBodyHandler(
                                new ValidateParamsHandler(
                                        new FinishingHandler()
                                )
                        )
                )
        );
    }
}
