package br.com.empresa.processador.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.empresa.processador.modelo.Vendedor;

/**
 * @author tiago.costa
 *
 */
public interface VendedorRepository extends MongoRepository<Vendedor, String> {

}
