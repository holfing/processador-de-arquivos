package br.com.empresa.processador.service;

/**
 * @author tiago.costa
 * 
 * servico com operações de saida para arquivos.
 */
public interface OutputFileService {

	/**
	 * @param nomeArquivo
	 */
	void gerarRelatorio(String nomeArquivo);
	
	/**
	 * 
	 */
	void limparDados();
}
