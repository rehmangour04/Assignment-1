import com.careercamp.dto.ProductDTO;
import com.careercamp.exception.ProductNotFoundException;
import com.careercamp.service.ProductService;

public class App {
    private ProductService productService = new ProductService();
    public static void main(String[] args) throws Exception {
       App main = new App();
       main.addProduct();
       main.displayProduct();
       main.deleteProduct();
       main.updateProduct();
       main.displayProduct();
     //  main.searchProductById();
       //main.searchProductByProdName();
       main.displayproductAscending();
       //main.displayproductDescending();

    }

    public void addProduct()
    {
        System.out.println("Adding products:");
        productService.addProduct();
        System.out.println("________________________");
    }
    public void displayProduct()
    {
        System.out.println("Displaying products:");
        productService.displayProductServie();
        System.out.println("________________________");
    }
    public  void deleteProduct() throws ProductNotFoundException {
        System.out.println("Deleting products:");
        productService.deleteProductService(5);
        System.out.println("________________________");
    }

    public void updateProduct() throws ProductNotFoundException
    {
        System.out.println("Updating products:");
        productService.updateProductService(7);
        System.out.println("________________________");
    }

    public void searchProductById() throws  ProductNotFoundException
    {
        System.out.println("Searching products:");
        productService.searchProductByIdService(4);
        System.out.println("________________________");
    }

    public void  searchProductByProdName() throws ProductNotFoundException
    {
        System.out.println("Searching products:");
        productService.searchProductByProdNameByService("item");
        System.out.println("________________________");
    }

    public void displayproductAscending()
    {
        System.out.println("Printing products:");
        productService.displayProductServiceAscendingByService();
        System.out.println("________________________");
    }

}
