package itens;

import java.util.*;

public class Farmacia { 
	
	List<Produto> produtos = new ArrayList<Produto>();
	
	
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
			
			System.out.println("Digite a forma do medicamento");
			
			String forma = ler.nextLine();
			
			generico.setNome(nome);
			
			generico.setValor(valor);
			
			generico.setCodigoBarras(codigoBarras);
			
			generico.setFabricante(fabricante);
			
			generico.setForma(forma);
			
			produtos.add(generico);
			
		}
		else if(tipo_produto.equals("Cosmeticos")) {
			
			Cosmeticos generico = new Cosmeticos();
			
			System.out.println("Digite o nome do cosmetico");
			
			String nome = ler.nextLine();
			
			System.out.println("Digite o valor do cosmetico");
			
			double valor = ler.nextDouble();
			
			ler.nextLine();
			
			System.out.println("Digite o tipo do cosmetico");
			
			String tipo = ler.nextLine();
			
			generico.setNome(nome);
			
			generico.setValor(valor);
			
			generico.setCodigoBarras(codigoBarras);
			
			generico.setFabricante(fabricante);
			
			generico.setTipo(tipo);
			
			produtos.add(generico);
			
		}		
	}
	
	public static void listarProduto(List<Produto> produtos) {
		
		for(int i = 0; i<produtos.size(); i++) {
			if(produtos.get(i) instanceof Medicamentos) {
				System.out.println(produtos.get(i).getFabricante());
				System.out.println(produtos.get(i).getCodigoBarras());
				System.out.println(produtos.get(i).getNome());
				System.out.println(produtos.get(i).getValor());
				System.out.println(((Medicamentos) produtos.get(i)).getForma());
			}
			else if(produtos.get(i) instanceof Cosmeticos) {
				System.out.println(produtos.get(i).getFabricante());
				System.out.println(produtos.get(i).getCodigoBarras());
				System.out.println(produtos.get(i).getNome());
				System.out.println(produtos.get(i).getValor());
				System.out.println(((Cosmeticos) produtos.get(i)).getTipo());
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
					System.out.println(produtos.get(i).getNome());
					System.out.println(produtos.get(i).getValor());
					System.out.println(((Medicamentos) produtos.get(i)).getForma());

				}

			}
			else if(produtos.get(i) instanceof Cosmeticos) {
				if(nome.equals(((Cosmeticos) ((List<Produto>) produtos).get(i)).getNome())) {
					System.out.println(produtos.get(i).getFabricante());
					System.out.println(produtos.get(i).getCodigoBarras());
					System.out.println(produtos.get(i).getNome());
					System.out.println(produtos.get(i).getValor());
					System.out.println(((Cosmeticos) produtos.get(i)).getTipo());
				}
				
			}
			
		}

	}

}
