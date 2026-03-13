package Geometria;
import java.util.Scanner;
public class Calculadora {

		 private double lado;
		    private double base;
		    private double altura;
		    private double raio;
		    private int opcao;

		    public void executar() {
		        Scanner kon = new Scanner(System.in);

		        while (true) {
		            System.out.println("   JAVA CONSTRUCTIONS INC.");
		            System.out.println("   Sistema de Cálculo de Áreas");
		            System.out.println("1. Calcular Área do Quadrado");
		            System.out.println("2. Calcular Área do Retângulo");
		            System.out.println("3. Calcular Área do Círculo");
		            System.out.println("4. Sair");
		            System.out.print("\nDigite sua opção: ");

		            opcao = kon.nextInt();

		            if (opcao == 4) {
		                System.out.println("Obrigado por usar o sistema Java Constructions Inc.!");
		                System.out.println("Boas construções!");
		                break;
		            }

		            switch (opcao) {
		                case 1:
		                    System.out.print("Digite o lado do quadrado (em metros): ");
		                    lado = kon.nextDouble();
		                    System.out.printf("Área do Quadrado = %.2f m²\n", lado * lado);
		                    break;

		                case 2:
		                    System.out.print("Digite a base do retângulo (em metros): ");
		                    base = kon.nextDouble();
		                    System.out.print("Digite a altura do retângulo (em metros): ");
		                    altura = kon.nextDouble();
		                    System.out.printf("Área do Retângulo = %.2f m²\n", base * altura);
		                    break;

		                case 3:
		                    System.out.print("Digite o raio do círculo (em metros): ");
		                    raio = kon.nextDouble();
		                    System.out.printf("Área do Círculo = %.2f m²\n", 3.14159 * raio * raio);
		                    break;

		                default:
		                    System.out.println("Opção inválida! Escolha de 1 a 4.");
		            }

		            kon.nextLine();
		            System.out.println("\nPressione ENTER para continuar...");
		            kon.nextLine();
		        }

		        kon.close();
		    }
	}



