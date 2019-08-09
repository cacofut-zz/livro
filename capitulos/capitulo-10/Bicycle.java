
public class Bicycle implements CarbonFootprint {

    private int qtdGas;

    public Bicycle(){
        this.qtdGas = 0;
    }

    public Bicycle(int qtdGas){
        this.qtdGas = qtdGas;
    }

    /**
     * @return the qtdGas
     */
    public int getQtdGas() {
        return qtdGas;
    }

    /**
     * @param qtdGas the qtdGas to set
     */
    public void setQtdGas(int qtdGas) {
        this.qtdGas = qtdGas;
    }

    @Override
    public String toString() {
        return String.format("Quantidade de gás: " + getQtdGas());
    }

    @Override
    public int getCarbonFootprint() {
        return getQtdGas();
    }

    
    
}