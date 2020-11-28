package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.FormaGeometrica;
import entities.Retangulo;
import entities.enums.Color;

public class Progama {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<FormaGeometrica> lista = new ArrayList<>();
		FormaGeometrica novaForma;
		
		System.out.print("Informe a qtde de formas geometricas deseja cadastrar: ");
		int num = sc.nextInt();
		
		for(int x =1; x <=num;x++) {
			System.out.print("CIRCULO ou RETANGULO(c/r)");
			char forma = sc.next().charAt(0);
			System.out.print("PRETO, AZUL OU VERDE: ");
			Color cor = Color.valueOf(sc.next());
			if(forma == 'c') {
				System.out.print("Informe o raio: ");
				Double raio = sc.nextDouble();
				lista.add(new Circulo(cor, raio));

			}else{
				System.out.print("Informe a largura: ");
				Double largura = sc.nextDouble();
				System.out.print("Informe a altura: ");
				Double altura = sc.nextDouble();
				lista.add(new Retangulo(cor, largura, altura));
				
			}
		}
		System.out.println();
		System.out.println("AREAS DAS FORMAS GEOMETRICAS:");
		for(FormaGeometrica listinha : lista) {
			System.out.println(String.format("%.2f ",listinha.area()));
		}
		
		sc.close();
	}

}
