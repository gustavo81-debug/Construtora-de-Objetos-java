package Geometria;
import java.util.Scanner;
public class Calculadora {

		 private double lado;
		    private double base;
		    private double altura;
		    private double raio;
		    private int escolha;

		    public void executar() {
		        Scanner s = new Scanner(System.in);

		        while (true) {
		            System.out.println("Contrutora de objetos");
		            System.out.println("Sistema de Cálculo de Áreas");
		            System.out.println("1 Calcular Área do Quadrado");
		            System.out.println("2 Calcular Área do Retângulo");
		            System.out.println("3 Calcular Área do Círculo");
		            System.out.println("4 Sair");
		            System.out.println("Digite sua opção: ");

		            escolha = s.nextInt();

		            if (escolha == 4) {
		                System.out.println("Obrigado!!");
		                break;
		            }

		            switch (escolha) {
		                case 1:
		                    System.out.print("Digite o lado do quadrado (em metros): ");
		                    lado = s.nextDouble();
		                    System.out.printf("Área do Quadrado = %.2f m²\n", lado * lado);
		                    break;

		                case 2:
		                    System.out.println("Digite a base do retângulo (em metros): ");
		                    base = s.nextDouble();
		                    System.out.print("Digite a altura do retângulo (em metros): ");
		                    altura = s.nextDouble();
		                    System.out.printf("Área do Retângulo = %.2f m²\n", base * altura);
		                    break;

		                case 3:
		                    System.out.println("Digite o raio do círculo (em metros): ");
		                    raio = s.nextDouble();
		                    System.out.printf("Área do Círculo = %.2f m²\n", 3.14159 * raio * raio);
		                    break;

		                default:
		                    System.out.println("Opção inválida! Escolha de 1 a 4.");
		            }

		            s.nextLine();
		            System.out.println("Pressione ENTER para continuar");
		            s.nextLine();
		        }

		        s.close();
		    }
	}



