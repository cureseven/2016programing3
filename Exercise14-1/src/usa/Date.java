package usa;

public class Date extends world.Date{
	public Date(int y, int m, int d) {
		super(y, m, d);
	}

	public void show(){
		System.out.println(year+"/"+month+"/"+day);
	}

}
