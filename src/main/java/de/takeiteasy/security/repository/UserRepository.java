package de.takeiteasy.security.repository;

import de.takeiteasy.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

        User findByUsername(String username  );
}
