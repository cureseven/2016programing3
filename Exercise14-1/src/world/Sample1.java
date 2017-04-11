package world;

public class Sample1 {

	public static void main(String[] args) {
		world.Date[] da;
		da = new world.Date[2];
		da[0]=new japan.Date(2016,7,25);
		da[1]=new usa.Date(2016, 7, 25);

		da[0].show();
		da[1].show();
	}

}
