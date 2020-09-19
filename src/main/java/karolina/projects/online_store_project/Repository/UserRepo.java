package karolina.projects.online_store_project.Repository;

import karolina.projects.online_store_project.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByMobile(String mobile);
}