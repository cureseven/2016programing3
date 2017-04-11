import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sample1 {

	public static void main(String[] args) {
		try{
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("data.txt")));

			for(int i=0;i<=100;i++){
			pw.println(10*(Math.random()));
			}

			pw.close();
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			int[] data =new int[100];
			String str;
			int a[]={0,0,0,0,0,0,0,0,0,0};

			for(int i=0;i<100;i++){
				str = br.readLine();
				data[i]=Integer.parseInt(str);
				for(int j=0;j<=9;j++){
					if(data[i]==j){
					a[j]++;
					}
				}
			for(int k=0;k<=10;k++){
			System.out.println(k+":"+a[k]);
			}
		}
		}catch(IOException e){
			System.out.println("入出力エラーです。");
		}
	}
}
