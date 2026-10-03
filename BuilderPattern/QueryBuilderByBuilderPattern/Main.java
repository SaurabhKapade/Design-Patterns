package BuilderPattern.QueryBuilderByBuilderPattern;

public class Main {
    public static void main(String[] args){
        System.out.print("Hellow");
        Query query = Query.queryBuilder()
                .setColumns(new String[]{"name,email"})
                .setTable("user")
                .setWhere("age > 10")
                .setLimit(20)
                .build();
        System.out.println("query build");
        System.out.print(query.toString());

    }
}
