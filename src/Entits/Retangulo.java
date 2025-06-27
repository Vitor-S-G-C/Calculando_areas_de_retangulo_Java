package entits;

public class Retangulo {

    public double largura;
    public double altura;

    public double area() {
        return altura * largura;
    }

    public double perimetro() {
        return 2 * (altura + largura);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }

    public String toString() {
        return "Altura: " + altura + ", Largura: " + largura
                + ", Área: " + String.format("%.2f", area())
                + ", Perímetro: " + String.format("%.2f", perimetro())
                + ", Diagonal: " + String.format("%.2f", diagonal());
    }
}
