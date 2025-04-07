public class GerenciadorDeVendas {
    public static void main(String[] args) {
        // Cadastro de itens com nome, valor base e desconto aplicável
        ItemEletronico smartphone = new ItemEletronico("Smartphone", 2000.0, 0.10);
        ItemEletronico laptop = new ItemEletronico("Laptop", 4500.0, 0.15);
        ItemEletronico dispositivoPortatil = new ItemEletronico("Tablet", 1500.0, 0.05);

        // Exibição dos valores finais após desconto
        smartphone.mostrarValorComDesconto();
        laptop.mostrarValorComDesconto();
        dispositivoPortatil.mostrarValorComDesconto();
    }
}

// Classe que representa um item eletrônico à venda
class ItemEletronico {
    private String modelo;
    private double valorBase;
    private double descontoAplicavel;

    // Inicializa os dados do item
    public ItemEletronico(String modelo, double valorBase, double descontoAplicavel) {
        this.modelo = modelo;
        this.valorBase = valorBase;
        this.descontoAplicavel = descontoAplicavel;
    }

    // Calcula o valor após dedução do desconto
    public double calcularValorFinal() {
        return valorBase - (valorBase * descontoAplicavel);
    }

    // Formata e exibe o resultado no console
    public void mostrarValorComDesconto() {
        System.out.printf("%s - Valor com desconto: R$ %.2f%n", modelo, calcularValorFinal());
    }
}