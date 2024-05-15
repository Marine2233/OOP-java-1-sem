import java.util.List;

public interface IVendingMachine {
    void addProduct(Product product);
    void initProducts(List<Product>listProducts);
    Product getProduct(String name);
}
