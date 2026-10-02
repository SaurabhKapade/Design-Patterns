package PrototypePattern;

public class Document implements Copyable<Document>{
    private String title;
    private String content;
    private String header;
    private String footer;

    public Document(String title, String content, String header, String footer) {
        this.title = title;
        this.content = content;
        this.header = header;
        this.footer = footer;
    }

    public Document(Document d){
        this.title = d.title;
        this.content = d.content;
        this.header = d.header;
        this.footer = d.footer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"title\": \"" + title + "\",\n" +
                "  \"content\": \"" + content + "\",\n" +
                "  \"header\": \"" + header + "\",\n" +
                "  \"footer\": \"" + footer + "\"\n" +
                "}";
    }

    @Override
    public Document copy() {
        return new Document(this);
    }
}
