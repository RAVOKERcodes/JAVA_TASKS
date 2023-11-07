package TASK;

import java.io.Serializable;
import java.util.Scanner;

class Product implements Serializable 
{
	private int units;
	private int price;
	private String cashDis;

	public Product(int units, int price, String cashDis) // constructor
	{
		super();
		this.units = units;
		this.price = price;
		this.cashDis = cashDis;
	}

	// getters and setters
	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String isCashDis() {
		return cashDis;
	}

	public void setCashDis(String cashDis) {
		this.cashDis = cashDis;
	}

	@Override
	public String toString() {
		return "Details [units=" + units + ", price=" + price + ", cashDis=" + cashDis + "]";
	}
}

public class task3_from_con 
{
	public static void main(String[] args) 
	{
		int gross = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Product[] ob = new Product[n]; // AOB
		
		for (int i = 0; i < n; i++)
		{
			ob[i] = new Product(sc.nextInt(), sc.nextInt(), sc.next());
		}
		
		for (Product amt : ob)
		{
			if (amt.getUnits() >= 10 && amt.isCashDis().equals("y")) 
			{
				int x = ((((amt.getUnits() * amt.getPrice()) * 80) / 100) * 95) / 100;
				gross = gross + x;
			} 
			else if (amt.getUnits() >= 10 && amt.isCashDis().equals("n")) 
			{
				int y = ((amt.getUnits() * amt.getPrice()) * 80) / 100;
				gross = gross + y;
			}
		}
		System.out.println("to be paid- " + gross);
	}
}