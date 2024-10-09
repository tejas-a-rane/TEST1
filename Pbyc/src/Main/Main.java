package Main;
import com.employee.*;
import com.manager.*;
public class Main {
public static void main(String[] args) {
	Employee employee = new Employee();
	Manager manager = new Manager();
	
	System.out.println(manager.calsal(25000, 1500));
	System.out.println(employee.calsal(2500));
}
}
