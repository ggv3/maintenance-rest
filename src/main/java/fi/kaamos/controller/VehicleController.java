package fi.kaamos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.kaamos.bean.Vehicle;

@Controller
public class VehicleController {
	
	@RequestMapping("/")
	public String vehicle(Model model) {
		Vehicle v = new Vehicle();
		v.setId(1);
		v.setUserId(1);
		v.setType(1);
		v.setDisplayName("Toyota Corolla '94");
		v.setTotalKilometersDriven(12);
		model.addAttribute("vehicle", v);
		return "index";
	}
}
