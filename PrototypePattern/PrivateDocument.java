package PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class PrivateDocument extends Document {
    private String owner;
    private List<String> allowedUsers;

    public PrivateDocument(String title, String content, String header, String footer,String owner, List<String> allowedUsers) {
        super(title, content, header, footer);
        this.allowedUsers = allowedUsers;
        this.owner = owner;
    }
    public PrivateDocument(PrivateDocument p){
        super(p);
        this.owner = p.owner;
        this.allowedUsers = new ArrayList<>(p.allowedUsers);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<String> getAllowedUsers() {
        return allowedUsers;
    }

    public void setAllowedUsers(List<String> allowedUsers) {
        this.allowedUsers = allowedUsers;
    }

    @Override
    public PrivateDocument copy(){
        return new PrivateDocument(this);
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"title\": \"" + getTitle() + "\",\n" +
                "  \"content\": \"" + getContent() + "\",\n" +
                "  \"header\": \"" + getHeader() + "\",\n" +
                "  \"footer\": \"" + getFooter() + "\",\n" +
                "  \"owner\": \"" + owner + "\",\n" +
                "  \"allowedUsers\": " + allowedUsers + "\n" +
                "}";
    }

}
