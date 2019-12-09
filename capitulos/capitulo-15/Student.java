
public class Student extends Person{

    private String ra;

    public Student() {
        super();
    }

    public Student(String name, String ra) {
        super(name);
        this.ra = ra;
    }

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Student ra(String ra) {
        this.ra = ra;
        return this;
    }



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ra == null) ? 0 : ra.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (ra == null) {
			if (other.ra != null)
				return false;
		} else if (!ra.equals(other.ra))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "Student [ra=" + ra + "]";
	}

     

}