import java.util.Scanner;


public class EmployeeList 
{
	Employee[] employeeList;	//�迭 ����
	int count;
	
	public EmployeeList() //������
	{
		employeeList = new Employee[100];	//�迭 �ʱ�ȭ
		count = 0;
	}
	
	public void setEmployee(Employee employee)
	{
		employeeList[count] = employee;
		count++;
	}
				
	public void printEmployee()
	{
		for(int i=0; i<count; i++)
		{
			System.out.println(employeeList[i]);
		}
	}
}