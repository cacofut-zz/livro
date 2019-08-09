import java.time.LocalDate;

public class PieceWorker extends Employee {

    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, 
        LocalDate birthDate, double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        this.wage = wage;
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
    
    @Override
    public double earnings() {
        return wage * pieces;
    }

    
}