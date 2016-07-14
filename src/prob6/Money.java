package prob6;

public class Money {

	private int i;

	public Money() {
	}

	public Money(int i) {
		this.i = i;
	}

	public Money add(Money a) {
		Money m = new Money(this.i + a.i);
		return m;
		
	}

	public Money minus(Money a) {
		Money m = new Money(this.i - a.i);
		return m;
	}

	public Money multiply(Money a) {
		Money m = new Money(this.i * a.i);
		return m;
	}

	public Money devide(Money a) {
		Money m = new Money(this.i / a.i);
		return m;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
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
		Money other = (Money) obj;
		if (i != other.i)
			return false;
		return true;
	}

}
