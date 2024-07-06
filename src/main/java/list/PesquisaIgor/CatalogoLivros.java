package main.java.list.PesquisaIgor;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    List<Livro> livros = new ArrayList<>();

    boolean adicionarLivro(String titulo, String autor, int anoPublicacao)
    {
        livros.add(new Livro(titulo, autor, anoPublicacao));
        return true;
    }

    List<Livro> pesquisaPorAutor(String autor)
    {
        List<Livro> livrosDoAutor = new ArrayList<>();

        for(Livro e : livros)
        {
            if(e.getAutor().equals(autor))
            {
                livrosDoAutor.add(e);
            }
        }

        return livrosDoAutor;
    }

    List<Livro> pesquisaPorIntevalosAnos(int anoInicial, int anoFinal)
    {
        List<Livro> livrosNoIntervalo = new ArrayList<>();
        for(Livro e : livros)
        {
            if(e.getAnoPublicacao() >= anoInicial && e.getAnoPublicacao() <= anoFinal)
            {
                
                livrosNoIntervalo.add(e);
            }
        }
        return livrosNoIntervalo;
    }   

    Livro pesquisarPorTitulo(String titulo)
    {
        for(Livro l : livros)
        {
            if(l.getTitulo().equals(titulo))
            {
                return l;
            }
        }
        return null;
    }
    
}
