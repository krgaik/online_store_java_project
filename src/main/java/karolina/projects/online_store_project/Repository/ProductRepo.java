package karolina.projects.online_store_project.Repository;

import karolina.projects.online_store_project.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Products, Long> {
    @Query("Select pro FROM Products pro WHERE pro.category_id=:cat_id")
    List<Products> getByCategoryId(@Param("cat_id")String cat_id);
}