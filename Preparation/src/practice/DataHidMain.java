package practice;

public class DataHidMain {
	public static void main(String[] args) {
		Datahiding d=new Datahiding();
		System.out.println(d.getName());
		System.out.println(d.getBal());
		
		d.setBal(24);
		
		System.out.println("Balance:"+d.getBal());
	}
}