package model;

import java.math.BigDecimal;

//Create a new class called SalesPerson that extends the Employee class.
//
//SalesPerson should have an additional property that should be a double 
//called commissionRate with all necessary getter and setters.
//
//SalesPerson should have a constructor that accepts name, salary, supervisor,
//and commissionRate as parameters, in that order.


public class SalesPerson extends Employee{
	private double commissionRate;

	public SalesPerson(String name, BigDecimal salary, Employee supervisor, double commissionRate) {
		super(name, salary, supervisor);
		this.commissionRate = commissionRate;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	
}
