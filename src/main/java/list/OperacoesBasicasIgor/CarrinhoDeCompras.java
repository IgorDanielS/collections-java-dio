package main.java.list.OperacoesBasicasIgor;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    
    List<Item> carrinho = new ArrayList<>();

    boolean adicionarItem(String nome, double preco, int quantidade)
    {
        //poderia adicionar uma exception caso n consiga realizar o addItem
        carrinho.add(new Item(nome, preco, quantidade));
        return true;
    }

    boolean removerItem(String nome)
    {
        for(Item e : carrinho)
        {
            if(e.getNome().equals(nome))
            {
                carrinho.remove(e);
                return true;
            }
        }
        return false;
        
    }

    double calcularValorTotal()
    {
        double valorTotal = 0;
        for(Item e : carrinho)
        {
            valorTotal += (e.getPreco()*e.getQuantidade());
        }
        return valorTotal;
    }

    void exibirItens()
    {
        for(Item e : carrinho)
        {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        
        CarrinhoDeCompras c = new CarrinhoDeCompras();

        c.adicionarItem("farinha", 5, 3);
        c.adicionarItem("cuscuz", 6, 2);

        double valorTotal = c.calcularValorTotal();

        c.exibirItens();

        System.out.println("As suas compras deram: " + valorTotal);
    }


}
