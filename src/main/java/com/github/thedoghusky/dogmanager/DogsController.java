package com.github.thedoghusky.dogmanager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DogsController {
	
	
	@GetMapping("/")
	public String homePage(Model model) {
		return "home";
	}
	
	@GetMapping("/dogs")
	public String displayDogs(Model model) {
		model.addAttribute("dogs", getDogs());
		return "dogs";
	}
	
	@GetMapping("/newdog")
	public String newDog(Model model) {
		return "newdog";
	}
	
	@PostMapping("/newdog")
	public String createDog(@RequestBody Dog newDog, Model model) {
		
		return "dog-created";
	}

	private List<Dog> getDogs() {
		List<Dog> dogs = new ArrayList<>();
		
		dogs.add(new Dog("Alpha", "Husky", 1, true));
		dogs.add(new Dog("Fun", "Husky", 3, true));
		dogs.add(new Dog("Alexis", "Husky", 2, true));
		
		return dogs;
	}
	
}
