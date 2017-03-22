package br.com.fiap.pizzaria;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.pizzaria.javabean.FormasPagamento;

/**
 * Created by logonrm on 21/03/2017.
 */

public class FormasPagamentoBO {

    public static List<FormasPagamento> getLista(){

        List<FormasPagamento> lista = new ArrayList<FormasPagamento>();
        lista.add (new FormasPagamento(1, "Bitcoin", 2));
        lista.add (new FormasPagamento(1, "Bitcoin", 2));
        lista.add (new FormasPagamento(1, "Bitcoin", 2));

        return lista;


    }
}
