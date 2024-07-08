package main.java.list.OrdenacaoIgor;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoa {
    
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa()
    {
        pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura)
    {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    
}
