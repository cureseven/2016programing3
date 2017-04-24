import java.io.*;

public class Sample1 {

	public static void main(String[] args)throws IOException {
		System.out.println("受験者数を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		int[] test = new int[num];
		
		System.out.println("人数分の点数を入力してください。");
		for(int i=0;i<test.length; i++){
			test[i] = Integer.parseInt(br.readLine());
		}
		
			for(int j=0;j<test.length;j++){
			if(test[j] >= 90){
				System.out.println(j+"番目の人は"+test[j]+"点、秀です");
			}
			else if(test[j] >= 80){
				System.out.println(j+"番目の人は"+test[j]+"点、優です");
				
			}
			else if(test[j] >= 70){
				System.out.println(j+"番目の人は"+test[j]+"点、良です。");
				
			}
			else if(test[j] >= 60){
				System.out.println(j+"番目の人は"+test[j]+"点、可です");
				
			}
			else{
				System.out.println(j+"番目の人は"+test[j]+"点、不可です");
			}
		
	}

}
}
