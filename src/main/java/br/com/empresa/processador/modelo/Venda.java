package br.com.empresa.processador.modelo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Document
@Getter
@Setter
@EqualsAndHashCode(exclude = {"itens", "totalVenda"})
@ToString(exclude = {"itens", "totalVenda"})
@NoArgsConstructor
public class Venda {

    @Id
    private Long idVenda;
    private List<Item> itens;
    private String nomeVendedor;
    @Transient
    private BigDecimal totalVenda;

    public Venda(Long idVenda, List<Item> itens, String nomeVendedor) {
        this.idVenda = idVenda;
        this.itens = itens;
        this.nomeVendedor = nomeVendedor;
    }

	/**
	 * @return the idVenda
	 */
	public Long getIdVenda() {
		return idVenda;
	}

	/**
	 * @param idVenda the idVenda to set
	 */
	public void setIdVenda(Long idVenda) {
		this.idVenda = idVenda;
	}

	/**
	 * @return the itens
	 */
	public List<Item> getItens() {
		return itens;
	}

	/**
	 * @param itens the itens to set
	 */
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	/**
	 * @return the nomeVendedor
	 */
	public String getNomeVendedor() {
		return nomeVendedor;
	}

	/**
	 * @param nomeVendedor the nomeVendedor to set
	 */
	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	/**
	 * @return the totalVenda
	 */
	public BigDecimal getTotalVenda() {
		return totalVenda;
	}

	/**
	 * @param totalVenda the totalVenda to set
	 */
	public void setTotalVenda(BigDecimal totalVenda) {
		this.totalVenda = totalVenda;
	}
    
    
}
