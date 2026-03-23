class Product {
    int productId;
    String productName;

    Product(int id, String name) {
        productId = id;
        productName = name;
    }

    boolean isMatch(String keyword) {
        return productName.toLowerCase().contains(keyword.toLowerCase());
    }
}