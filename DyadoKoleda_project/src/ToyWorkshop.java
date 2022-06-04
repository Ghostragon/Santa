

public class ToyWorkshop extends AbstractWorkshop {

	@Override
	Color getColor(String colorName) {
		// Shape factory... cannot return color
		return null;
	}

	@Override
	Toy getToy(String toyName) {
		if(toyName.equals("DOLL")) {
			return new Doll();
		}
		
		if(toyName.equals("BIKE")) {
			return new Bike();
		}
		System.out.println("Unknown toy");
		return null;
	}

}
