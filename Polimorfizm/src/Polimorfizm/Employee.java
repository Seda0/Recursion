package Polimorfizm;

public class Employee {

	protected String ayrac="- - - - - - - -- - - - - -";
	protected String name,surname,job;
	protected int salary,annualPermit;
	protected Employee(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		this.job="Calisan";
		this.salary=5500;
		this.annualPermit=10;
	}
	protected Employee(String name, String surname, int salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.annualPermit=10;
		if(salary>6000) {
			this.job="Kidemli calısan";
			annualPermit+=3;
	}
		else if (salary>0 && salary<=6000) {
			this.job="calisan";
		} else {
			this.job="stajyer";
			annualPermit=0;
		}
	}
	protected Employee() {
		}
	public int makeRaise(int howMuch) {
		salary+=howMuch;
		return salary;
	}
	public int makeRaise(double howMuch) {
		double money=(double)salary*howMuch;
		makeRaise((int)money);
		return salary;
	}
	public void setJob(String job) {
		this.job=job;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void setAnnualPermit(int permit) {
		this.annualPermit=permit;
	}
	public String getJob() {
		return job;
	}
	public int getSalary() {
		return salary;
	}
	public int getAnnualPermit() {
		return annualPermit;
	}
	public void info() {
		System.out.println( getJob()+"bilgileri \n"+ayrac+"\nCalisan ismi:"+name+"\n Çalişan soyadi:"+surname+"\n Görevi:"+getJob()+"\n Maaşi:"+getSalary()+"\n İzin günü:"+getAnnualPermit()+"İş günü \n"+ayrac);
	}
	public void raiseinfo() {
		System.out.println(getJob()+"Zam Uygulamasi\n"+ayrac+"\nYeni verilecek maas:"+getSalary()+"\n"+ayrac);
	}
	}


