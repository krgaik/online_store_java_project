package karolina.projects.online_store_project.Service.ProductService;

import java.util.List;

import karolina.projects.online_store_project.Model.Category;
import karolina.projects.online_store_project.Model.Products;
import karolina.projects.online_store_project.Repository.CategoryRepo;
import karolina.projects.online_store_project.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServices {

    @Autowired
    ProductRepo productRepo;
    @Autowired
    CategoryRepo cateRepo;

    public List<Products>getAllProducts(){
        return productRepo.findAll();
    }
    public List<Products>getProductsByCategory(String product_id){
        return productRepo.getByCategoryId(product_id);
    }

    public List<Category>getAllCategory(){
        return cateRepo.findAll();
    }

    public Products getProductsById(long productId) throws Exception {
        return productRepo.findById(productId).orElseThrow(() ->new Exception("Product is not found"));
    }
}