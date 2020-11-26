package br.com.empresa.processador.modelo;

import lombok.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author tiago.costa
 *
 */
@Data
@Document(collection= "teste")
public class Vendedor implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    private String cpf;
    private String nome;
    private BigDecimal salario;

    
    public Vendedor() {
    	
    }
    
	/**
	 * @param cpf
	 * @param nome
	 * @param salario
	 */
	public Vendedor(String cpf, String nome, BigDecimal salario) {
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	 * @return the salario
	 */
	public BigDecimal getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Vendedor [cpf=" + cpf + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
	
    
    
}
