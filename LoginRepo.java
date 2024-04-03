// LoginRepo.java
package abc.nmp.repository;

import abc.nmp.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<Login, Integer> {
}
