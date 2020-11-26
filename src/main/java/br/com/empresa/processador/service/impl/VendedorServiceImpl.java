package br.com.empresa.processador.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.empresa.processador.modelo.Vendedor;
import br.com.empresa.processador.repository.VendedorRepository;
import br.com.empresa.processador.service.VendedorService;


/**
 * @author tiago.costa
 *
 */
@Service
public class VendedorServiceImpl implements VendedorService {
	@Autowired
	private  VendedorRepository repository;

	@Override
	public void save(Vendedor vendedor) {
		repository.save(vendedor);
	}

	

}
