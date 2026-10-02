package PrototypePattern;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Document d1 = new Document("Your title","your content","Your header","Your footer");
        Document d2 = new Document(d1);
        Document d3 = d1.copy();
        System.out.println(d3.toString());

        PrivateDocument pd = new PrivateDocument("Your title","your content","Your header","Your footer","owner",new ArrayList<>());
        System.out.println(pd.toString());

        PrivateDocument pd2 = pd.copy();
        System.out.println(pd2.toString());
    }
}
