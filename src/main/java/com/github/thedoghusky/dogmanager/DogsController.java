package com.github.thedoghusky.dogmanager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DogsController {
	
	private static List<Dog> dogs = new ArrayList<>();

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
		model.addAttribute("dog", new Dog("", "", 1, false));
		return "newdog";
	}
	
	@PostMapping(path = "/newdog", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String createDog(Dog newDog, Model model, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "newdog";
		}

		getDogs().add(newDog);
		return "redirect:dogs";
	}

	private List<Dog> getDogs() {

		if (dogs.isEmpty()) {
			dogs.add(new Dog("Alpha", "Husky", 1, true));
			dogs.add(new Dog("Fun", "Husky", 3, true));
			dogs.add(new Dog("Alexis", "Husky", 2, true));
		}
		
		return dogs;
	}
	
}
