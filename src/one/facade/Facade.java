package one.facade;

import subsistema1.CrmService;
import subsistema2.CepApi;

public class Facade {

    public void migrar(String nome, String cep){

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
