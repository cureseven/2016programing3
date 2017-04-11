class MyTime
{
	int hour;
	int min;

	void setTime(int h,int m)
	{
		hour = h;
		min = m;
	}
	void show(){
		if(hour<12){
		System.out.println("午前"+ hour +"時" + min +"分です。");
		}
		else{
			System.out.println("午後"+ (hour-12) +"時" + min +"分です。");
		}
		}
}


public class Sample1 {
        public static void main(String[] args)
        {
        	MyTime t1 = new MyTime();
        	MyTime t2 = new MyTime();

        	t1.setTime(11, 40);
        	t2.setTime(13, 50);
        	t1.show();t2.show();
        }
}
