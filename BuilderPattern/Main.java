package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Product p1 = Product.builder()
                .setName("Iphone")
                .setPrice(78999)
                .setDescription("awesome phone")
                .build();
        System.out.println(p1.getDescription());
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());
    }
}
