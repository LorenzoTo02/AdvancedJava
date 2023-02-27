package generics;

public class Pair<T, E> {

	private T n;
	private E f;
	
	public Pair(T n, E f) {
		this.n = n;
		this.f = f;
	}
	
	public T getN() {
		return n;
	}
	public void setN(T n) {
		this.n = n;
	}
	public E getF() {
		return f;
	}
	public void setF(E f) {
		this.f = f;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pair [n=");
		builder.append(n);
		builder.append(", f=");
		builder.append(f);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
