package karolina.projects.online_store_project.Repository;

import karolina.projects.online_store_project.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
