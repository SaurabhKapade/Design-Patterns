package BuilderPattern;

public class Product {
    private String name;
    private Integer price;
    private String description;

    public String getDescription() {
        return description;
    }
    public Integer getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public Product(Builder b){
        this.name = b.getName();
        this.price = b.getPrice();
        this.description = b.getDescription();
    }
    public static Builder builder(){
        return new Builder();
    };
    public static class Builder{
        private String name;
        private Integer price;
        private String description;

        public String getName() {
            return name;
        }

        public Integer getPrice() {
            return price;
        }

        public Builder setPrice(Integer price) {
            this.price = price;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }
}


