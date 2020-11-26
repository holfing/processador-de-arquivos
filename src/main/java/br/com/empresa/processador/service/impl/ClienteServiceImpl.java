package br.com.empresa.processador.service.impl;

import org.springframework.stereotype.Service;

import br.com.empresa.processador.modelo.Cliente;
import br.com.empresa.processador.repository.ClienteRepository;
import br.com.empresa.processador.service.ClienteService;

/**
 * @author tiago.costa
 *
 */
@Service
public class ClienteServiceImpl implements ClienteService{

	
	private final ClienteRepository repository;

    public ClienteServiceImpl(ClienteRepository repository) {
        this.repository = repository;
    }

    @Override
    public void salvar(Cliente cliente) {
        repository.save(cliente);
    }

}
