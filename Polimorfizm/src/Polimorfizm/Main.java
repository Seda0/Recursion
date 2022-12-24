package Polimorfizm;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee Ahmet=new Employee("Ahmet","Mehmet");
		Employee Hasan=new Employee("Hasan","Huseyin",6500);
		Employee Leyla=new Engineer("Leyla","Mecnun");
		Employee Ali=new Engineer("Ali","Veli",15001);
		Engineer Yasar =new Engineer("Yasar","Yasamaz");
		Ahmet.info();
		Hasan.info();
		Leyla.info();
		Ali.info();
		Yasar.info();
	}

}
