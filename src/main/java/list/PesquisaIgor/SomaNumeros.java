package main.java.list.PesquisaIgor;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    List<Integer> numeros = new ArrayList<>();

    void adicionarNumero(int numero)
    {
        numeros.add(numero);
    }

    int calculaSoma()
    {
        int total = 0;
        for(int e : numeros)
        {
            total += e;
        }
        return total;
    }

    int encontraMaiorNumero()
    {
        int maiorNumero = 0;
        for(int e : numeros)
        {
            if(maiorNumero < e)
            {
                maiorNumero = e;
            }
        }
        return maiorNumero;
    }
    
    int encontraMenorNumero()
    {
        int menorNumero = 0;
        for(Integer e : numeros)
        {
            if(menorNumero > e)
            {
                menorNumero = e;
            }
        }
        return menorNumero;
    }

    List<Integer> exibirNumeros()
    {
        List<Integer> showNumbers = new ArrayList<>();

        for(int e : numeros)
        {
            showNumbers.add(e);
        }

        return showNumbers;
    }
}
