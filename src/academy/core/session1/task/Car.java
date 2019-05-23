package academy.core.session1.task;

import java.util.Date;

public class Car implements Vehicle, FinancialCalculations{

	private Long id;
	public String name;
	public Integer year;
	public String color;
	public Date date;

	public String toString() {
		return null;
	}

	@Override
	public Double calculatePrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculateCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void speedUp(Integer speed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speedDown(Integer speed) {
		// TODO Auto-generated method stub
		
	}
}
