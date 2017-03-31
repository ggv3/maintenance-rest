package fi.kaamos.bean;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer>{
	List<Vehicle> findById(int userId);
}
