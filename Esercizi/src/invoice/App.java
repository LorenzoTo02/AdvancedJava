package invoice;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		
		Invoice i1 = new Invoice(1, "Carlo", 1500.00);
		Invoice i2 = new Invoice(3, "Filippo", 1500.00);
		Invoice i3 = new Invoice(2, "Giuseppe", 1500.00);
		
		SortedSet<Invoice> invoices = new TreeSet<>(new Comparator<Invoice>() {

			@Override
			public int compare(Invoice o1, Invoice o2) {
				return o1.getId() - o2.getId();
			}
		});
		
		invoices.add(i1);
		invoices.add(i2);
		invoices.add(i3);
		System.out.println(invoices.toString());
		
	}

}
