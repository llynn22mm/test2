import java.util.Scanner;


public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		EmployeeList employeeList = new EmployeeList();
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("사원정보 입력");
			System.out.println("이름:");
			String name = input.nextLine();
		
			if(name.length() <= 10)
			{
				System.out.println("전화번호:");
				String phone = input.nextLine();
				
				Employee employee = new Employee(name,phone);
				employeeList.setEmployee(employee);
					
				employeeList.printEmployee(); //출력함수
			}
			else
				System.out.println("이름은 영문 10자이하만 가능합니다.\n");
		}
	}	
}
