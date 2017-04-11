package japan;

public class Date extends world.Date{
	public Date(int y, int m, int d) {
		super(y, m, d);
	}

	public void show(){
		System.out.println(year+"年"+month+"月"+day+"日");
	}

}
