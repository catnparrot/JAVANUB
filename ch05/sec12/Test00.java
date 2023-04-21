package ch05.sec12;

import java.util.Objects;

public class Test00 {
	private int n;
	@Override
	public int hashCode() {
		return Objects.hash(n, name, rate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test00 other = (Test00) obj;
		return n == other.n && Objects.equals(name, other.name)
				&& Float.floatToIntBits(rate) == Float.floatToIntBits(other.rate);
	}
	private String name;
	private float rate;
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
}
