package fi.kaamos.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.kaamos.bean.Vehicle;
import fi.kaamos.dao.VehicleDao;



@Controller
public class VehicleController {
	
	@Autowired
	private VehicleDao vehicleDao;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String vehicleList(Model model) {
		List<Vehicle> vehicles = vehicleDao.fetchUsersVehicles();
		System.out.println(vehicles);
		model.addAttribute("vehicles",vehicles);
		return "index";
	}
	//
	//@RequestMapping(value="/", method=RequestMethod.GET)
	//public String vehicleForm(Model model) {
	//	model.addAttribute("vehicle", new Vehicle());
	//	return "index";
	//}
	
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String vehicleSubmit(@ModelAttribute Vehicle vehicle, Model model) {
		System.out.println(vehicle.getDisplayName());
		model.addAttribute("vehicle", vehicle);
		return "result";
	}
}
