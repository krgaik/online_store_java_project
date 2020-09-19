package karolina.projects.online_store_project.Repository;

import karolina.projects.online_store_project.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
