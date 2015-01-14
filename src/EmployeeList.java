import java.util.Scanner;


public class EmployeeList 
{
	Employee[] employeeList;	//배열 선언
	int count;
	
	public EmployeeList() //생성자
	{
		employeeList = new Employee[100];	//배열 초기화
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