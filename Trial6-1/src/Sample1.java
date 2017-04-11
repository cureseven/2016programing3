import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample1 {

	public static void main(String[] args) throws IOException{
		System.out.println("単語を入力してください。");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
				String str1 = br.readLine();
				StringBuffer sb = new StringBuffer(str1);
				sb.reverse();
				String str2 = sb.toString();
				if(str1.equals(str2)){
					System.out.println(str1 +"は回文です。");
				}else{
					System.out.println(str1+"は回文ではありません。");
				}
	}

}
