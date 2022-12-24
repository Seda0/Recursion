package Polimorfizm;

public class Engineer extends Employee {
	Engineer(String name, String surname) {
		super(name, surname);

		setJob("Muhendislik");
		setAnnualPermit(30);
		setSalary(12500);

	}

	Engineer(String name, String surname, int Salary) {
		super(name, surname);
		setSalary(salary);
		if (salary > 12500) {
			setJob("Yuksek Muhendis");
			setAnnualPermit(35);

		} else if (salary > 15000) {
			setJob("Kidemli Yuksek Muhendis");
			setAnnualPermit(40);

		} else {
			setJob("Muhendis");
			setAnnualPermit(30);

		}
	}

	public int makeRaise(double howMuch) {
		double money = (double) (getSalary() * howMuch) + 2500;
		makeRaise((int) money);
		return getSalary();

	}

}
