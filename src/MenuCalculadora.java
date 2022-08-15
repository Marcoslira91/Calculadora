import java.util.Scanner;

public class MenuCalculadora {

	public static void main(String[] args) {		
		Scanner leia = new Scanner(System.in);		
		Formulas calc = new Formulas();
		
		int opcao;
		double valor1, valor2;
		
		
		System.out.println("Programa Calculadora");
		System.out.println("Informe uma das opções a seguir");
		System.out.println("1 - Somar | 2 - Subtrair | 3 - Multiplicar | 4 - Dividir | 0 - Sair");
		opcao = leia.nextInt();
		
		if(opcao == 0) {
			System.out.println("Você saiu do programa.");
		}else {
			System.out.print("Informe o primeiro valor: ");
			valor1 = leia.nextDouble();
			System.out.print("Informe o segundo valor: ");
			valor2 = leia.nextDouble();
			
			switch (opcao) {
			case 1:
				System.out.println("A soma de "+valor1+" + "+valor2+" é: "+calc.soma(valor1, valor2));
				break;
			
			case 2:
				System.out.println("A subtração de "+valor1+" + "+valor2+" é: "+calc.subtrair(valor1, valor2));
				break;
				
			case 3:
				System.out.println("A multiplicação de "+valor1+" + "+valor2+" é: "+calc.multiplicar(valor1, valor2));
				break;
			
			case 4:
				System.out.println("A divisão de "+valor1+" + "+valor2+" é: "+calc.dividir(valor1, valor2));
				break;
				
			default:
				System.out.println("Informe um valor válido!");
				break;
			}
		}

	}

}
