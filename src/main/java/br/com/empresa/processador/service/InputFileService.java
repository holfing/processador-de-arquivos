package br.com.empresa.processador.service;

import java.util.stream.Stream;

/**
 * @author tiago.costa
 * servico com operações de entrada para arquivos.
 */
public interface InputFileService {
	
	/**
	 * @param linhasArquivo
	 * @throws IllegalArgumentException
	 */
	void processar(Stream<String> linhasArquivo) throws IllegalArgumentException;

}
