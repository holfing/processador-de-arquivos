package br.com.empresa.processador.service.impl;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.empresa.processador.modelo.Item;
import br.com.empresa.processador.modelo.Venda;
import br.com.empresa.processador.repository.VendaRepository;
import br.com.empresa.processador.service.VendaService;


/**
 * @author tiago.costa
 *
 */
@Service
public class VendaServiceImpl implements VendaService {

	private final VendaRepository repository;

    public VendaServiceImpl(VendaRepository repository) {
        this.repository = repository;
    }
	
	
	@Override
	public Venda salvar(Venda venda) {
		return repository.save(venda);
	}

	@Override
    public Optional<Venda> getVendaMaisCara() {

        List<Venda> vendas = repository.findAll();

        vendas.forEach(venda -> venda.setTotalVenda(venda.getItens()
                .stream()
                .map(Item::getPreco)
                .reduce(BigDecimal.ZERO, BigDecimal::add))
        );

        return vendas.stream()
                .max(Comparator.comparing(Venda::getTotalVenda));
    }

    @Override
    public Optional<Venda> getPiorVendedor() {

        List<Venda> vendas = repository.findAll();

        vendas.forEach(venda -> venda.setTotalVenda(venda.getItens()
                .stream()
                .map(Item::getPreco)
                .reduce(BigDecimal.ZERO, BigDecimal::add))
        );

        return vendas.stream()
                .min(Comparator.comparing(Venda::getTotalVenda));
    }


	@Override
	public void limparVendas() {
		repository.deleteAll();
	}
}
