package SimuladoII;

import java.util.Objects;

public class MalaRetagular implements ItemASerEmbaladoIF {
    private double lado1;
    private double lado2;
    private String material;
    private double peso;

    public double getLado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }
    @Override
    public String getMaterial() {
        return material;
    }
    @Override
    public double getPeso() {
        return peso;
    }
    public double getArea(){
        return lado1 * lado2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MalaRetagular that = (MalaRetagular) o;
        return Double.compare(that.lado1, lado1) == 0 && Double.compare(that.lado2, lado2) == 0 && Double.compare(that.peso, peso) == 0 && Objects.equals(material, that.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lado1, lado2, material, peso);
    }

    @Override
    public String toString() {
        return "Mala retagular de" + material + ", com área" + getArea() + "e peso de" + getPeso() + "gramas.";
    }
}
