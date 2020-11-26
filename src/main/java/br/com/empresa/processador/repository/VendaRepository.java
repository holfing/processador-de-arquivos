package br.com.empresa.processador.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.empresa.processador.modelo.Venda;

/**
 * @author tiago.costa
 *
 */
public interface VendaRepository extends MongoRepository<Venda, Long> {
	
}
