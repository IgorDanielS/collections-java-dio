package main.java.list.OperacoesBasicasIgor;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    
    List<Tarefa> tarefas = new ArrayList<>();

    void adicionarTarefa(String descricao)
    {
        tarefas.add(new Tarefa(descricao));
    }

    void removerTarefa(String descricao)
    {
        for(int i = 0; i < tarefas.size(); i++)
        {
            if(tarefas.get(i).descricao.equals(descricao)){
                tarefas.remove(i);
                break;
            }
        }
    }
    
    int obterNumeroTotalTarefas()
    {
        int i = tarefas.size();
        
        return i;
    }

    List<String> obterDescricoesTarefa()
    {
        List<String> descricoesLista = new ArrayList<>();
        for(int i = 0; i < tarefas.size(); i++)
        {
            descricoesLista.add(tarefas.get(i).descricao);
        }
        return descricoesLista;
    }
}
