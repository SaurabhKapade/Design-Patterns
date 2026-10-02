package RouteHandler_ChaiOfResponsibilityPattern.Schema;

import RouteHandler_ChaiOfResponsibilityPattern.Enums.TodoStatus;

public class Todo {
    private int id;
    private String title;
    private String description;
    private TodoStatus status;

    public Todo(int id, String title, String description){
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = TodoStatus.PENDING;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public TodoStatus getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

}
