package itens;

import java.util.*;

public class Main {
	public static void main(String[] args){
		
		Farmacia cura = new Farmacia();
		
		Scanner ler = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("1) cadastrar");
			System.out.println("2) listar");
			System.out.println("3) buscar produto");
			
			int opcao = ler.nextInt();
			
			if( opcao == 1 ) {
				Farmacia.criarProduto(cura.produtos);
			}
			else if( opcao == 2 ){
				Farmacia.listarProduto(cura.produtos);
			}
			else if( opcao == 3) {
				Farmacia.buscarProduto(cura.produtos);
			}
		}
	}
}
