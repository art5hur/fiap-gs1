package com.github.ams.globalsolution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.ams.globalsolution.controller.dto.FormPeixe;
import com.github.ams.globalsolution.model.Peixe;
import com.github.ams.globalsolution.repository.PeixeRepository;



@Controller
@RequestMapping("peixes")
public class PeixeController {

	@Autowired
	private PeixeRepository peixeRepository;
	 
	
	@GetMapping()
	public String list(Model model) {
		List<Peixe> peixes = peixeRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
		model.addAttribute("peixes", peixes);
		return "peixe/list";
	}

	@PostMapping("save")
	public String save(@ModelAttribute FormPeixe peixe) {
						
		Peixe entity = peixe.toModel();
		peixeRepository.save(entity);
		return "redirect:/peixes";
	}

	@GetMapping("add")
	public String create(Model model) {
		model.addAttribute("peixe", new FormPeixe());
		return "peixe/form";
	}

	@GetMapping("update/{id}")
	public String update(@PathVariable Long id, Model model) {
		Peixe peixe = peixeRepository.findById(id).orElse(new Peixe());

		model.addAttribute("peixe", new FormPeixe().toForm(peixe));
		
		return "peixe/form";
	}

	@GetMapping("delete/{id}")
	public String delete(@PathVariable Long id) {
		peixeRepository.deleteById(id);
		return "redirect:/peixes";
	}
}
