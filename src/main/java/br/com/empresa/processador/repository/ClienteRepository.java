package br.com.empresa.processador.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.empresa.processador.modelo.Cliente;

/**
 * @author tiago.costa
 *
 */
public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
