package fi.kaamos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.kaamos.bean.Vehicle;



@Controller
public class VehicleController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String vehicleForm(Model model) {
		model.addAttribute("vehicle", new Vehicle());
		return "index";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String vehicleSubmit(@ModelAttribute Vehicle vehicle, Model model) {
		System.out.println(vehicle.getDisplayName());
		model.addAttribute("vehicle", vehicle);
		return "result";
	}
}
