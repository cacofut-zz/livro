import java.util.Arrays;

import javafx.scene.control.SplitPane.Divider;

public class HugeInteger{

    private int[] digitos;
    private int qtdDigitosAtuais = 0;
    private static final int QTD_MAX_DIGITOS = 40;

    public HugeInteger(){
        digitos = new int[HugeInteger.QTD_MAX_DIGITOS];
    }

    public static void main(String[] args) {
        HugeInteger h1 = new HugeInteger();
        HugeInteger h2 = new HugeInteger();

        h1.parse("Cristiano Carvalho amaral");
        h2.parse("Cristiano Carvalho amarald");

        System.out.println( h1.isEqualTo(h2) );
        //System.out.println(h1);
        //h1.add(" 28 anos");        
        //System.out.println(h1);
        //h1.add(" idade");
        //System.out.println(h1);


    }

    public void parse(String value){
        char[] auxdigitos = value.toCharArray();
        if( auxdigitos.length > HugeInteger.QTD_MAX_DIGITOS ){
            return;
        }        
        for( int i = 0; i < auxdigitos.length; i++ ){
            digitos[i] = auxdigitos[i];     
            qtdDigitosAtuais++;    
        }
    }

    public String toString(){
        String value = "";
        for (int dig : digitos) {
            value += String.valueOf((char)dig);
        }
        return value;
    }

    public void add(String value){        
        if( value.length() > HugeInteger.QTD_MAX_DIGITOS ){
            throw new IllegalArgumentException("Value maior que o tomanho suportado");
        }
        if( value.length() + qtdDigitosAtuais > HugeInteger.QTD_MAX_DIGITOS ){
            throw new IllegalArgumentException("Existem apenas " + 
            (HugeInteger.QTD_MAX_DIGITOS - qtdDigitosAtuais) + " dígitos livres");
        }
        int indice = qtdDigitosAtuais;
        int count  = 0;
        while( count < value.length() ){
            digitos[indice] = value.charAt(count);
            indice++;
            count++;
            qtdDigitosAtuais++;
        }   

    }

    public void subtract(String value){

    }

    public boolean isEqualTo(HugeInteger huge){
        boolean equal = true;
        for( int i = 0; i < this.getDigitos().length; i++ ){
            if( this.getDigitos()[i] != huge.getDigitos()[i] ){
                equal = false;
                break;
            }
        }
        return equal;
    }

    public boolean isNotEqualTo(HugeInteger huge){
        return false;
    }

    public boolean isGreaterThan(HugeInteger huge){
        return false;
    }

    public boolean isLessThan(HugeInteger huge){
        return false;
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger huge){
        return false;
    }

    public boolean isLessThanOrEqualTo(HugeInteger huge){
        return false;
    }

    public int[] getDigitos(){
        return Arrays.copyOf(this.digitos, HugeInteger.QTD_MAX_DIGITOS);
    }
}