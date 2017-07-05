package SpringCustomSecurityPackage;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by student on 7/5/17.
 */
public interface UserRepository extends CrudRepository {
    User findByUsername(String username);
}
