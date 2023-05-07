package SimuladoII;

import java.util.Objects;

public class PratoRedondo implements ItemASerEmbaladoIF {
    private double raio;
    private String material;
    private double peso;


    public PratoRedondo(String material, double raio, double peso) throws Exception {
        super();
        testaEntrada(material, raio, peso);
        this.material = material;
        this.raio = raio;
        this.peso = peso;
    }
    private void testaEntrada(String material, double raio, double peso) throws Exception {
        if (material == null || material.equals(""))
            throw new Exception("Material tem que ser informado");

        if (raio <= 0)
            throw new Exception("Raio tem que ser maior que zero");

        if (peso <= 0)
            throw new Exception("Peso tem que ser maior que zero");
    }

    public double getRaio() {
        return raio;
    }
    @Override
    public String getMaterial() {
        return material;
    }
    public double getArea(){
        return Math.PI * Math.pow(raio, 2);
    }
    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, peso, raio);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof PratoRedondo))
            return false;
        PratoRedondo other = (PratoRedondo) obj;
        return Objects.equals(material, other.material)
                && Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso)
                && Double.doubleToLongBits(raio) == Double.doubleToLongBits(other.raio);
    }

    @Override
    public String toString() {
        return "Prato redondo de " + material + ", com área " + getArea() + " e peso de " + getPeso() + " gramas.";
    }

}
