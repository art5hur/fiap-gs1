package com.github.ams.globalsolution.lov;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.github.ams.globalsolution.repository.PeixeRepository;

@Component
public class ListOfValueBuilder {
	
	@Autowired
	private PeixeRepository peixeRepository;



	public List<ListOfValue> getLovPeixes() {			
		return peixeRepository
				.findAll(Sort.by(Sort.Direction.ASC, "nome"))
				.stream()
				.map(p -> new ListOfValue(p.getId(), p.getNome()))
				.toList();
	}



}
