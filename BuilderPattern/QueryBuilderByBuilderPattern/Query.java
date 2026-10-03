package BuilderPattern.QueryBuilderByBuilderPattern;

public class Query {
    private String[] columns;
    private String table;
    private String where;
    private int limit;

    public Query(QueryBuilder queryBuilder){
        this.columns = queryBuilder.columns;
        this.table = queryBuilder.table;
        this.where = queryBuilder.where;
        this.limit = queryBuilder.limit;
    }

    public String[] getColumns(){
        return this.columns;
    }
    public String getTable(){
        return this.table;
    }
    public String getWhere(){
        return this.where;
    }
    public int getLimit(){
        return this.limit;
    }

    public static QueryBuilder queryBuilder(){
        return new QueryBuilder();
    }

    public static class QueryBuilder{
        private String[] columns;
        private String table;
        private String where;
        private int limit;

        public QueryBuilder setColumns(String[] columns){
            this.columns = columns;
            return this;
        }
        public QueryBuilder setTable(String table){
            this.table = table;
            return this;
        }
        public QueryBuilder setWhere(String where){
            this.where = where;
            return this;
        }
        public QueryBuilder setLimit(int limit){
            this.limit = limit;
            return this;
        }
        public Query build(){
            return new Query(this);
        }
    }
    @Override
    public String toString() {
        StringBuilder query = new StringBuilder();

        query.append("SELECT ");

        if (columns != null && columns.length > 0) {
            query.append(String.join(", ", columns));
        } else {
            query.append("*");
        }

        if (table != null) {
            query.append(" FROM ").append(table);
        }

        if (where != null) {
            query.append(" WHERE ").append(where);
        }

        if (limit > 0) {
            query.append(" LIMIT ").append(limit).append(";");
        }

        return query.toString();
    }
}
