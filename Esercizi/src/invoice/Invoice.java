package invoice;

public class Invoice {

	private int id;
	private String owner;
	private double amount;
	
	public Invoice(int id, String owner, double amount) {
		this.id = id;
		this.owner = owner;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Invoice [id=");
		builder.append(id);
		builder.append(", owner=");
		builder.append(owner);
		builder.append(", amount=");
		builder.append(amount);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
