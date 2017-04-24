import java.io.*;
public class Sample1 {

	public static void main(String[] args)throws IOException {
		System.out.println("整数を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int num = Integer.parseInt(str);
		if(num%2 == 1){
		System.out.println("奇数");
		}
		else{
		System.out.println("遇数");
		}
	}

}
