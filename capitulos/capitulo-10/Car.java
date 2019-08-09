

public class Car implements CarbonFootprint{

    private int qtdkilometros;

    public Car(){
        this.qtdkilometros = 0;
    }

    public Car(int qtdkilometros){
        this.qtdkilometros = qtdkilometros;
    }

    public int getQtdkilometros() {
        return qtdkilometros;
    }

    @Override
    public int getCarbonFootprint() {
        return getQtdkilometros();
    }

    public String toString(){
        return String.format("Quantidade de kilometros: " + getQtdkilometros());
    }
}