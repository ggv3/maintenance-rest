package fi.kaamos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fi.kaamos.bean.Vehicle;
import fi.kaamos.bean.VehicleRepository;

@RestController
public class VehicleController {
	
	@Autowired
	VehicleRepository repository;
	
	@RequestMapping(value="/vehicles", method = RequestMethod.GET)
	public @ResponseBody List<Vehicle> vehicleListRest() {
		return (List<Vehicle>) repository.findById(1);
	}

}
