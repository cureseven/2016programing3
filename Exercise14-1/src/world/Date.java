package world;

public abstract class Date {
	protected int year;
	protected int month;
	protected int day;
	public Date(int y,int m,int d){
		year = y;
		month =m;
		day =d;
	}
	abstract public void show();

}
