import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Student
{
	public String name;
	public int point;

	Student(String n,int p)
	{
	    name = n;
		point = p;
	}
}


class Sample1 {

	public static void main(String[] args)throws IOException {
		Student[] stu = new Student[5];
		stu[0] = new Student("Tom",40);
		stu[1] = new Student("Alice",70);
		stu[2] = new Student("Mike",45);
		stu[3]= new Student("Jane",100);
		stu[4]= new Student("Bob",80);
		
		System.out.println("整数を入力してください。1:nameソート　2:点数ソート　そのほか:登録順");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
				String str1 = br.readLine();
				int num1 = Integer.parseInt(str1);
				
				
				if(num1 == 1){
						for(int s=0;s<5;s++){
							for(int t=s+1;t<5;t++){
								if(stu[s].name.compareTo(stu[t].name)>0){
								int tmp = stu[s].point;
								stu[s].point = stu[t].point;
								stu[t].point = tmp;
								String str = stu[s].name;
								stu[s].name = stu[t].name;
								stu[t].name = str;
								}
							}
							System.out.println(stu[s].name +  stu[s].point);
						}
				}
				
				if(num1 ==2){
					for(int s=0;s<5;s++){
						for(int t=s+1;t<5;t++){
							if(stu[s].point < stu[t].point){
							String str = stu[s].name;
							stu[s].name = stu[t].name;
							stu[t].name = str;
							int tmp = stu[s].point;
							stu[s].point = stu[t].point;
							stu[t].point = tmp;
							}
						}
					}
					for(int j=0;j<5;j++){
					System.out.println(stu[j].name + stu[j].point);
					}
				}
				if(num1 != 1 && num1 != 2){
					for(int j=0;j<5;j++){
						System.out.println(stu[j].name + stu[j].point);
					}
				}
	}
	}
