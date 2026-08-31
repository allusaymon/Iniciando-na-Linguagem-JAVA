//ATIVIDADE PRA FAZER SOZINHO -- PODE TÁ MT ERRADO PQ SEQUER CONSIGO EXECUTAR O CÓDIGO :heartbreak:

package br.com.aulas.matinhas2608;

public class Produto {
	String descricao;
	private int estoque;
	
	//Construtor com parâmetros	
	Produto(String descricao) {
		this();
		this.descricao = descricao;
		exibirDados(); 
		}
		
	//Construtor sem parâmetros
	Produto() {
		this.descricao = "Nada";
		this.estoque=0;
	}
	
    public void venderProduto(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade de venda inválida!");
        } else if (quantidade > estoque) {
            System.out.printf("Estoque insuficiente para vender %d unidade(s). Estoque atual: %d\n", quantidade, estoque);
        } else {
            estoque -= quantidade;
            System.out.println("\nVenda realizada com sucesso!");
            exibirDados();
        }
    }

	public void compraProduto(int quantidade) {
		if(quantidade > 0) {
			estoque+= quantidade;
			System.out.println("\nCompra realizada");
			exibirDados();
		}else {
			System.out.printf("Valor Inválido pra compra!");
		} 
	}

	public void exibirDados() {
		System.out.printf("Nome: %s" + "\nEstoque: %d ", descricao, estoque);
	}
	
}
