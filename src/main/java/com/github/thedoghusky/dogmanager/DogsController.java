package com.github.thedoghusky.dogmanager;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
		model.addAttribute("dog", new Dog(null, null, null, false));
		model.addAttribute("ages", new int[]{1, 2, 3, 4, 5, 6, 7});
		
		return "newdog";
	}
	
	@PostMapping(path = "/newdog", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String createDog(@Valid Dog newDog, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("ages", new int[]{1, 2, 3, 4, 5, 6, 7});
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
