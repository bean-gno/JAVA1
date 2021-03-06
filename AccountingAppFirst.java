// Basic accounting app project
// Simulates and calculates the VAT(tax) and profit dividends the producers actually receive
// using supply price as input

public class AccountingApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]); // supply price input
		double vatRate = 0.1;  
		double vat = valueOfSupply*vatRate;  // actual VAT
		double total = valueOfSupply+vat;  // actual price that consumer needs to pay
		double expenseRate = 0.3;  // production cost rate (30%)
		double expense = valueOfSupply*expenseRate; // actual production cost
		double income = valueOfSupply-expense;  // total profit
		double dividend1 = income*0.5;  // profit dividends
		double dividend2 = income*0.3;
		double dividend3 = income*0.2;

		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+vat);
		System.out.println("Total : "+total);
		System.out.println("Expense : "+expense);
		System.out.println("Income : " + income);
		System.out.println("Dividend 1 : "+ dividend1);
		System.out.println("Dividend 2 : "+ dividend2);
		System.out.println("Dividend 3 : "+ dividend3);

	}

}
