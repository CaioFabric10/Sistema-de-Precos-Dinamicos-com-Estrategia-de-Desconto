package servicos;

import entidades.Produto;
import strategies.DescontoStrategy;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Produto> produtos;
    private DescontoStrategy descontoStrategy;

    public CarrinhoDeCompras(){
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularTotalComDesconto(){
        double total = 0.0;
        for (Produto produto : produtos) {
            total += descontoStrategy.calcularDesconto(produto.getPrecoBase());
        }
        return total;
    }



}
