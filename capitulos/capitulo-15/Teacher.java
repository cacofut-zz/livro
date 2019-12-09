

public class Teacher extends Person{
    
    private String registration;


    public Teacher() {
        super();
    }

    public Teacher(String name, String registration) {
        super(name);
        this.registration = registration;
    }

    public String getRegistration() {
        return this.registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Teacher registration(String registration) {
        this.registration = registration;
        return this;
    }
    
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((registration == null) ? 0 : registration.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Teacher other = (Teacher) obj;
        if (registration == null) {
            if (other.registration != null)
                return false;
        } else if (!registration.equals(other.registration))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Teacher [registration=" + registration + "]";
    }


}