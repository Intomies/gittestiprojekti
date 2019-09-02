package hh.swd20.esimerkkiprojekti.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import hh.swd20.esimerkkiprojekti.domain.Robot;

@Controller

public class robotController {

	List<Robot> robots = new ArrayList<Robot>();

	@GetMapping("/index")
	public String newFriendForm(@ModelAttribute Robot robot, Model model) {

		if (robot.getRobotModel() != null && robot.getRobotModel() != "") { // Tarkastaa, onko syöte tyhjä, jos on, niin lisäystä
																	// ei tapahdu
			robots.add(robot); // Lisää uuden robotin listalle
			model.addAttribute("robots", robots); // Lisää robots-listan Model-oliolle
			return "robotlist"; // Palauttaa sivun

		} else {

			model.addAttribute("robots", robots); // Tulostaa robots-listan vaikka syöte olisi tyhjä
			return "robotlist";

		}
	}

}
