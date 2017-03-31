package fi.kaamos.bean;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
	List<User> findById(int id);
}
