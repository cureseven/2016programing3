//dDQi-otd8
class Room{
	private int morning;
	private int afternoon;
	private int evening;

	Room(int m,int a,int e){
		morning = m;
		afternoon = a;
		evening = e;
	}

	int calFee(int start,int end){
		int fee=0;
		for(int i = start;i<end;){
		if(i>=6 && i<=12){
			fee=fee+morning;
		}
		else if(i>12 && i<=18){
			fee=fee+afternoon;
		}
		else if(i>18 && i<=24){
			fee=fee+evening;
		}
		else{
			System.out.println("エラー");
		}
		return(fee);
	}
		return fee;
}
}


class Sample1 {

	public void main(String[] args) {
		Room r;
		r = new Room(800,1000,1200);
		System.out.println("6:00-12:00: \\"+r.calFee(6, 12));
		System.out.println("6:00-18:00: \\"+r.calFee(6, 18));
		System.out.println("6:00-24:00: \\"+r.calFee(6, 24));
		System.out.println("12:00-18:00: \\"+r.calFee(12, 18));
		System.out.println("12:00-24:00: \\"+r.calFee(12, 24));
		System.out.println("18:00-24:00: \\"+r.calFee(18, 24));



	}

}

