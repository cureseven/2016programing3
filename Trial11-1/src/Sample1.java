import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Countdown extends Thread
{
	private int count;

	Countdown(int c){
		count = c;
	}
	public void run(){
		try{
			for(int i=count;i>=0;i--){
			Thread.sleep(1000);
			System.out.println("残り:"+i);
			}
		}catch (InterruptedException e) {
			System.out.println("例外が発生しました。");
		}
	}
}
class Sample1 {

	public static void main(String[] args)throws IOException {
		System.out.println("カウント数を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		Countdown c = new Countdown(n);
		c.start();
	}

}
