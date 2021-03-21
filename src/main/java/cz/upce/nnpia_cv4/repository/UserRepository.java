package cz.upce.nnpia_cv4.repository;

import cz.upce.nnpia_cv4.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    @EntityGraph(attributePaths = "reservation")
    User findByUsername(String username);
}
