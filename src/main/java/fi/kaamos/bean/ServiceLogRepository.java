package fi.kaamos.bean;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ServiceLogRepository extends CrudRepository<Servicelog, Integer>{
	List<Servicelog> findByVehicleId(int vehicleId);
}
