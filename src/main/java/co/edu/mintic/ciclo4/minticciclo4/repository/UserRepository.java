package co.edu.mintic.ciclo4.minticciclo4.repository;

import co.edu.mintic.ciclo4.minticciclo4.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    @Query("{email : { $eq: ?0 }}")
    List<User> getUserByEmail(String email);

    @Query("{email :?0, password :?1}")
    Optional<User> getUserByEmailAndPassword(String email, String password);
}
