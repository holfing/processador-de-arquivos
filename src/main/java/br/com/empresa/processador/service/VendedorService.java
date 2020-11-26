package br.com.empresa.processador.service;

import br.com.empresa.processador.modelo.Vendedor;

/**
 * @author tiago.costa
 *
 */
public interface VendedorService {
	
	/**
	 * @param vendedor
	 * @return
	 */
	public void save(Vendedor vendedor);

}