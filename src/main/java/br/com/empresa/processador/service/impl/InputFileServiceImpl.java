package br.com.empresa.processador.service.impl;

import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import br.com.empresa.processador.service.ClienteService;
import br.com.empresa.processador.service.InputFileService;
import br.com.empresa.processador.service.VendaService;
import br.com.empresa.processador.service.VendedorService;
import br.com.empresa.processador.util.ArquivoEnum;
import br.com.empresa.processador.util.ArquivoUtil;
import br.com.empresa.processador.util.UtilConversor;


/**
 * @author tiago.costa
 *
 */
@Service
public class InputFileServiceImpl implements InputFileService {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(InputFileServiceImpl.class);

    private final VendedorService vendedorService;
    private final ClienteService clienteService;
    private final VendaService vendaService;

    public InputFileServiceImpl(VendedorService vendedorService, ClienteService clienteService,VendaService vendaService) {
        this.vendedorService = vendedorService;
        this.clienteService = clienteService;
        this.vendaService = vendaService;
    }

    @Override
    public void processar(Stream<String> linhasArquivo) throws IllegalArgumentException {
    	System.out.println(linhasArquivo);
    	
    	linhasArquivo.forEach(line -> {

            if (ArquivoUtil.isValidInputLine(line)) {

                String[] fields = line.split("Ã§");
                ArquivoEnum tipoArquivo = ArquivoEnum.getValue(fields[0].substring(0, 3));

                try {
                    switch (tipoArquivo) {
                        case VENDEDOR:
                            vendedorService.save(UtilConversor.convertToVendedor(fields));
                            break;
                        case CLIENTE:
                            clienteService.salvar(UtilConversor.convertToCliente(fields));
                            break;
                        case VENDA:
                            vendaService.salvar(UtilConversor.convertToVenda(fields));
                            break;
                        default:
                    }
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Registro inválido");
                }

            } else {
                LOGGER.error("Linha inválida!");
            }
        });
    	
    }



}
