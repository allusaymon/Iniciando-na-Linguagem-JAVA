package br.com.aulas.matinhas2608;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p1 = new Produto("Sasuke Labubu");
        p1.compraProduto(10);
        p1.venderProduto(5);
	}

}

/*package br.com.aulas.matinhas2608;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("=== CRIAÇÃO DOS PRODUTOS ===");
        
        // 1. Testando o construtor com descrição (inicia estoque em 0 e exibe os dados)
        System.out.println("Criando Produto 1:");
        Produto p1 = new Produto("Caderno Universitário");

        System.out.println("\n-----------------------------------");

        // 2. Comprando produtos (adicionando ao estoque)
        System.out.println("Comprando 10 unidades do Produto 1:");
        p1.compraProduto(10);

        System.out.println("\n-----------------------------------");

        // 3. Vendendo uma quantidade válida (estoque suficiente)
        System.out.println("Vendendo 4 unidades:");
        p1.venderProduto(4);

        System.out.println("\n-----------------------------------");

        // 4. Testando validação: tentar vender MAIS do que tem no estoque (tem 6, tenta vender 10)
        System.out.println("Tentando vender 10 unidades (Estoque atual: 6):");
        p1.venderProduto(10);

        System.out.println("\n-----------------------------------");

        // 5. Testando validação: tentar comprar valor negativo ou zero
        System.out.println("Tentando comprar valor inválido (-5):");
        p1.compraProduto(-5);

        System.out.println("\n-----------------------------------");

        // 6. Testando o construtor sem parâmetros
        System.out.println("Criando Produto 2 (sem parâmetros):");
        Produto p2 = new Produto();
        p2.exibirDados();
    }
}*/