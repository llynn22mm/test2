
public class Employee
{
	String name;
	String pn;

	public Employee(String name, String pn)	//������-�ʱ�ȭ ���� 
	{
		this.name = name;
		this.pn = pn;
	}
	@Override	
	public String toString()	//ObjectŬ����
	{
		String str = "�̸� : " + name + "\t��ȭ��ȣ : " + pn;
		
		return str;
	}
}