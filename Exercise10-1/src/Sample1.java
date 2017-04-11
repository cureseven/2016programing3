import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PersonException extends Exception{
}
class Person{
	int birth_year;
	Person(int y){
		birth_year = y;
	}
	int calAge(int y)throws PersonException{
		if(y<birth_year){
			throw new PersonException();
		}
		else{
			return (y - birth_year);
		}
	}
}
class Sample1 {

	public static void main(String[] args)throws IOException {
		try{
			System.out.println("出生年を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int b = Integer.parseInt(str);
		System.out.println("起算年を入力してください。");
		String str1 = br.readLine();
		int y = Integer.parseInt(str1);
		Person p;
		p = new Person(b);
		System.out.println(y+"年時点の年齢は"+ p.calAge(y)+"才です。");

		}catch(Exception e){
			System.out.println("正しいデータを入れてください。");
		}finally{
			System.out.println("ご利用ありがとうございました。");
		}
	}

}
