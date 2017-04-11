class Member
{
	static int sum = 0;
	private int num;
	private String name;
	Member(String n)
	{
		sum = sum +1;
		num = sum;
		name = n;
	}public String toString()
	{
		System.out.println("会員番号"+num+"番 "+name);
	}
}
class CoMember extends Member
{
	CoMember(String n)
	{
		super(n);
		CoMember m = new CoMember;
	}
	public String toString()
	{						//toStringわかんない
		n = String n;
		System.out.println("会員番号"+num+"番"+name+"(法人)");
	}
}
public class Sample1 {

	public static void main(String[] args) {
		CoMember[] m;
		m = new CoMember[3];
		m[0]= "鈴木太郎";
		m[1]= "山口大学";
		m[2]= "田中次郎";
		toString(m[0]);

	}

}
