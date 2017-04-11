class Yoyaku
{
	private int month;
	private int day;
	private String name;

	Yoyaku(int m,int d,String n)
	{
		month = m;
		day = d;
		name = n;
	}
	public String toString(){
		return(month,day,name);
		//返し方
	}
}
class TwinYoyaku extends Yoyaku
{
	private String roommate;

	TwinYoyaku (int m,int d,String n1,String n2)
	{
		super(m,d,n1);
		roommate = n2;
	}
	public String toString(){
		System.out.println(month +"月"+day+ "日,"+ name +","+roommate);
		//返し方
	}
}
public class Sample1 {

	public static void main(String[] args) {
		TwinYoyaku[] y = new TwinYoyaku[3];
		y[0] = (6,1,"鈴木太郎");
		y[1] = (6,2,"山田花子");
		y[2] = (6,2,"山本次郎","山本恵子");
		toString(y[0]);
		//飛ばし方
	}

}
