package RouteHandler_ChaiOfResponsibilityPattern.DTOs;

public class Response<T> {
    private int id;
    private boolean success;
    private int statusCode;
    private T data;
    private String message;

    public Response(int id,boolean success,int statusCode,T data,String message){
        this.id = id;
        this.success= success;
        this.statusCode = statusCode;
        this.data = data;
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public boolean isSuccess() {
        return success;
    }
}
