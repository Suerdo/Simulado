package SimuladoII;

import java.util.Objects;

public class Estatua implements ItemASerEmbaladoIF {
    private String material;
    private double base;
    private double altura;
    private double peso;

    public Estatua(String material, double base, double altura, double peso) throws Exception {
        super();
        testaEntrada(material, base, altura, peso);
        this.material = material;
        this.base= base;
        this.altura = altura;
        this.peso = peso;
    }
    private void testaEntrada(String material, double base, double altura, double peso) throws Exception {
        if (material == null || material.equals(""))
            throw new Exception("Material tem que ser informado");

        if (base <= 0 || altura <= 0)
            throw new Exception("Base/altura tem que ser maior que zero");

        if (peso <= 0)
            throw new Exception("Peso tem que ser maior que zero");
    }

    public String getMaterial() {
        return material;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
    public double getArea(){
        double area = getAltura() * getBase() / 2.0;
        return area;
    }
    @Override
    public String toString() {
        return "Estatua de " + material + ", com área " + getArea() + " e peso de " + getPeso() + " gramas.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estatua estatua = (Estatua) o;
        return Double.compare(estatua.base, base) == 0 && Double.compare(estatua.altura, altura) == 0 && Double.compare(estatua.peso, peso) == 0 && material.equals(estatua.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, base, altura, peso);
    }
}
