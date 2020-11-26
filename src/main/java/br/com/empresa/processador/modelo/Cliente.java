package br.com.empresa.processador.modelo;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    private String cnpj;
    private String nome;
    private String areaNegocio;
    
    
	/**
	 * @param cnpj
	 * @param nome
	 * @param areaNegocio
	 */
	public Cliente(String cnpj, String nome, String areaNegocio) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.areaNegocio = areaNegocio;
	}
	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}
	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the areaNegocio
	 */
	public String getAreaNegocio() {
		return areaNegocio;
	}
	/**
	 * @param areaNegocio the areaNegocio to set
	 */
	public void setAreaNegocio(String areaNegocio) {
		this.areaNegocio = areaNegocio;
	}
}
