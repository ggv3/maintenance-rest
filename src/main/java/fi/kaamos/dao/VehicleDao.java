package fi.kaamos.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fi.kaamos.bean.Vehicle;

@Repository
public class VehicleDao {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public List<Vehicle> fetchUsersVehicles() {
		String sql = "SELECT * FROM vehicle WHERE userid = 1";
		RowMapper<Vehicle> mapper = new VehicleRowMapper();
		List<Vehicle> vehicles = jdbctemplate.query(sql, mapper);
		return vehicles;
	}
	
}
