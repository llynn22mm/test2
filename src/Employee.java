
public class Employee
{
	String name;
	String pn;

	public Employee(String name, String pn)	//생성자-초기화 역할 
	{
		this.name = name;
		this.pn = pn;
	}
	@Override	
	public String toString()	//Object클래스
	{
		String str = "이름 : " + name + "\t전화번호 : " + pn;
		
		return str;
	}
}