import entidades.Produto;
import servicos.CarrinhoDeCompras;
import strategies.DescontoClienteNovo;
import strategies.DescontoClienteRegular;
import strategies.DescontoClienteVIP;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Calça cargo", 269.0);
        Produto produto2 = new Produto("Calça carpenter", 479.0);
        Produto produto3 = new Produto("Calça parachute", 599.0);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarProduto(produto1);
        carrinhoDeCompras.adicionarProduto(produto2);
        carrinhoDeCompras.adicionarProduto(produto3);

        carrinhoDeCompras.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Total para Cliente Novo: R$" + carrinhoDeCompras.calcularTotalComDesconto());
        carrinhoDeCompras.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Total para Cliente Novo: R$" + carrinhoDeCompras.calcularTotalComDesconto());
        carrinhoDeCompras.setDescontoStrategy(new DescontoClienteVIP());
        System.out.println("Total para Cliente Novo: R$" + carrinhoDeCompras.calcularTotalComDesconto());
    }
}
