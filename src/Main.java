import entits.Retangulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.print("Qual a altura do retângulo? ");
        retangulo.altura = sc.nextDouble();
        System.out.print("Qual a largura do retângulo? ");
        retangulo.largura = sc.nextDouble();

        System.out.println("\n=== Dados do Retângulo ===");
        System.out.println("Área: " + String.format("%.2f", retangulo.area()));
        System.out.println("Perímetro: " + String.format("%.2f", retangulo.perimetro()));
        System.out.println("Diagonal: " + String.format("%.2f", retangulo.diagonal()));
    }
}
