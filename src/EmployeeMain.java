import java.util.Scanner;


public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		EmployeeList employeeList = new EmployeeList();
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("������� �Է�");
			System.out.println("�̸�:");
			String name = input.nextLine();
		
			if(name.length() <= 10)
			{
				System.out.println("��ȭ��ȣ:");
				String phone = input.nextLine();
				
				Employee employee = new Employee(name,phone);
				employeeList.setEmployee(employee);
					
				employeeList.printEmployee(); //����Լ�
			}
			else
				System.out.println("�̸��� ���� 10�����ϸ� �����մϴ�.\n");
		}
	}	
}
