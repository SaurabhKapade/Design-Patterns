package RouteHandler_ChaiOfResponsibilityPattern.DTOs;

public class Request<T> {
    private int id;
    private String type;
    private String url;
    private T payload;

    public Request(int id, String type, String url, T payload){
        this.id = id;
        this.type = type;
        this.url = url;
        this.payload = payload;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public T getPayload() {
        return payload;
    }
}
