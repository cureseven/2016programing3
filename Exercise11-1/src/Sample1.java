class Ameba extends Thread
{
	int sum;

	Ameba(){
		sum =sum+1;
		if(sum<100)
		System.out.println(sum+"匹目のアメーバが生まれました。");
		this.start();
	}

	public void run(){
		for(int i=0;i<=100;i++){
			try {
				Ameba a=new Ameba();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("例外が発生しました。");
			}
		}
	}
}
class Sample1 {

	public static void main(String[] args) {
		Ameba a= new Ameba();
		a.start();

	}

}
