package karolina.projects.online_store_project.Repository;

import karolina.projects.online_store_project.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
