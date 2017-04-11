//zxXeK5Df
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class TimeException extends Exception{
}
class Time{
	private int hour;
	private int min;

	Time(int h,int m){
		hour = h;
		min = m;
	}

	void show(){
		System.out.println(hour+"時"+min+"分");
	}
}
public class Sample1 {

	public static void main(String[] args)throws IOException, TimeException {
		try{
		System.out.println("何時ですか？");
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		int h = Integer.parseInt(str1);
		System.out.println("何分ですか？");
		String str2 = br.readLine();
		int m = Integer.parseInt(str2);
		Exception e;

		Time time = new Time(h,m);

		time.show();
		}catch(NumberFormatException e){
			System.out.println("NumberFormatExceptionです。");
		}

	}

}
