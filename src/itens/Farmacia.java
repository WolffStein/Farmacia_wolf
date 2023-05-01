package itens;

import java.util.*;

public class Farmacia { 
	
public static void criarProduto(List<Produto> produtos) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o fabricante");
		
		String fabricante = ler.nextLine();		
		
		System.out.println("Digite o codigo de barras");
		
		String codigoBarras = ler.nextLine();
		
		System.out.println("Digite o tipo de produto");
		
		String tipo_produto = ler.nextLine();
		
		if(tipo_produto.equals("Medicamentos")) {
			
			Medicamentos generico = new Medicamentos();
			
			System.out.println("Digite o nome do medicamento");
			
			String nome = ler.nextLine();
			
			System.out.println("Digite o valor do medicamento");
			
			double valor = ler.nextDouble();
			
			ler.nextLine();
			
			System.out.println("Digite o tipo do medicamento");
			
			String tipo = ler.nextLine();
			
			generico.setNome(nome);
			
			generico.setTipo(tipo);
			
			generico.setValor(valor);
			
			generico.setCodigoBarras(codigoBarras);
			
			generico.setFabricante(fabricante);
			
			produtos.add(generico);
			
			
			
		}
		else if(tipo_produto.equals("Cosmeticos")) {
			
			Cosmeticos generico = new Cosmeticos();
			
			System.out.println("Digite o nome do Cosmetico");
			
			String nome = ler.nextLine();
			
			System.out.println("Digite o valor do Cosmetico");
			
			double valor = ler.nextDouble();
			
			ler.nextLine();
			
			generico.setNome(nome);
			
			generico.setValor(valor);
			
			generico.setCodigoBarras(codigoBarras);
			
			generico.setFabricante(fabricante);
			
			produtos.add(generico);
			
		}
		
		
	}
	
	public static void listarProduto(List<Produto> produtos) {
		
		for(int i = 0; i<produtos.size(); i++) {
			System.out.println(produtos.get(i).getFabricante());
			System.out.println(produtos.get(i).getCodigoBarras());
			
			if(produtos.get(i) instanceof Medicamentos) {
				System.out.println(((Medicamentos) ((List<Produto>) produtos).get(i)).getNome());
				System.out.println(((Medicamentos) ((List<Produto>) produtos).get(i)).getValor());
				System.out.println(((Medicamentos) ((List<Produto>) produtos).get(i)).getTipo());
			}
			else if(produtos.get(i) instanceof Cosmeticos) {
				System.out.println(((Cosmeticos) ((List<Produto>) produtos).get(i)).getNome());
				System.out.println(((Cosmeticos) ((List<Produto>) produtos).get(i)).getValor());
			}
			
		}
	}
	
	
	public static void buscarProduto(List<Produto> produtos) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome no produto que deseja buscar");
		String nome = ler.nextLine();
		
		for(int i = 0; i<produtos.size(); i++) {
			if(produtos.get(i) instanceof Medicamentos) {
				if(nome.equals((((Medicamentos) ((List<Produto>) produtos).get(i)).getNome()))) {
					
					System.out.println(produtos.get(i).getFabricante());
					System.out.println(produtos.get(i).getCodigoBarras());
					
					System.out.println(((Medicamentos) ((List<Produto>) produtos).get(i)).getNome());
					System.out.println(((Medicamentos) ((List<Produto>) produtos).get(i)).getValor());
					System.out.println(((Medicamentos) ((List<Produto>) produtos).get(i)).getTipo());

				}

			}
			else if(produtos.get(i) instanceof Cosmeticos) {
				if(nome.equals(((Cosmeticos) ((List<Produto>) produtos).get(i)).getNome())) {
				
					System.out.println(produtos.get(i).getFabricante());
					
					System.out.println(produtos.get(i).getCodigoBarras());
					
					System.out.println(((Cosmeticos) ((List<Produto>) produtos).get(i)).getNome());
					
					System.out.println(((Cosmeticos) ((List<Produto>) produtos).get(i)).getValor());
				}
				
			}
			
		}

		
	}
	
	
	
	
	
	
	public static void main(String[] args){
		List<Produto> produtos = new ArrayList<Produto>();
		Scanner ler = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("1) cadastrar");
			System.out.println("2) listar");
			System.out.println("3) buscar produto");
			
			int opcao = ler.nextInt();
			
			if( opcao == 1 ) {
				criarProduto(produtos);
			}
			else if( opcao == 2 ){
				listarProduto(produtos);
			}
			else if( opcao == 3) {
				buscarProduto(produtos);
			}
		}
	}
}
