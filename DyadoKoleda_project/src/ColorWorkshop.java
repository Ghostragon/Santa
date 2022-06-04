

public class ColorWorkshop extends AbstractWorkshop {

	@Override
	Color getColor(String colorName) {
		if(colorName.equals("BLUE")) {
			return new Blue();
		}
		
		if(colorName == "PINK") {
			return new Pink();
		}
		System.out.println("Unknown color");
		return null;
	}

	@Override
	Toy getToy(String toyName) {
		// Color factory... cannot return shape
		return null;
	}

}
