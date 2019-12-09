

public abstract class Person{

    private String nome;

    public Person(){

    }
    
    public Person(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Person nome(String nome) {
        this.nome = nome;
        return this;
    }    

    @Override
    public String toString() {
        return "Person [" +
            " nome='" + getNome() + "'" +
            "] ";
    }
    

}