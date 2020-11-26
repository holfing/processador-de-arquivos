package br.com.empresa.processador.service;

import java.util.Optional;

import br.com.empresa.processador.modelo.Venda;

/**
 * @author tiago.costa
 *
 */
public interface VendaService {
	
	
	/**
	 * @param venda
	 * @return
	 */
	Venda salvar(Venda venda);
	
	/**
	 * @return
	 */
	Optional<Venda> getVendaMaisCara();
	
	/**
	 * @return
	 */
	Optional<Venda> getPiorVendedor();
	
	
	void limparVendas();
}
