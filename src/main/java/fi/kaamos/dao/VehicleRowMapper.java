package fi.kaamos.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.kaamos.bean.Vehicle;

public class VehicleRowMapper implements RowMapper<Vehicle>{
	
	public Vehicle mapRow(ResultSet rs, int rowNum) throws SQLException {
		Vehicle v = new Vehicle();
		v.setId(rs.getInt("id"));
		v.setUserId(rs.getInt("userId"));
		v.setType(rs.getInt("type"));
		v.setDisplayName(rs.getString("displayName"));
		v.setLatestInspectionDate(rs.getString("latestInspectionDate"));
		v.setLastInspectionDate(rs.getString("lastInspectionDate"));
		v.setLatestOilChange(rs.getString("latestOilChange"));
		return v;
	}

}
