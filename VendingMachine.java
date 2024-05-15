import java.util.ArrayList;
import java.util.List;

public class VendingMachine implements IVendingMachine{
    private List<Product> listProduct = new ArrayList<>();
@Override
    public void addProduct(Product product){
        listProduct.add(product);
    }

 @Override   public void initProducts(List<Product>listProducts){
        this.listProduct = listProducts;
    }
@Override
    public Product getProduct(String name){
        for(Product product: listProduct)
            if(product.getName() == name)
                return product;
        return null;
        
    }

}

