public class RoomCarpetDemo
{
	public static void main(String[] args)
	{
		//create a roomDimension and a roomCarpet and print out the whole information
		RoomDimension room = new RoomDimension(30,20);
		RoomCarpet carpet = new RoomCarpet(room,50);
		System.out.println(carpet);
	}
}
