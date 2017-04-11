class Hotel
{
	private boolean[] room;
	Hotel(int n){room = new boolean[n];}

	void reserve(int i){
		 room[i-1] = true;
	}
	void cancel(int i){
		room[i-1] = false;
	}
	void show(){
		for(int i=0; i<room.length;i++){
			System.out.print((i+1)+"号室の予約：");
			if(room[i]) System.out.println("有");
			else System.out.println("無");
		}
}
}

public class Sample1 {
	public static void main(String[] args)
	{
		Hotel h = new Hotel(5);
		h.reserve(1);
		h.reserve(3);
		h.reserve(5);
		h.cancel(3);
		h.reserve(4);
		h.show();
	}
}
