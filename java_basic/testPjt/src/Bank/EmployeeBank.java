package Bank;

public class EmployeeBank {
	
	public String name; // public의 문제: 데이터를 변질 시킬 수 있음
	static int amount = 0;
	
	public EmployeeBank(String name) {
		this.name = name;
	}
	
	public void saveMoney(int money) {
		
		amount += money;
		System.out.println("amount : " + amount);
	}
	
	public void spendMoney(int money) {
		amount -= money;
		System.out.println("amount : " + amount);
	}
	
	public void getBankInfo() {
		
		System.out.println("Employee name : " + this.name);
		System.out.println("amount : " + amount);
	}

}
