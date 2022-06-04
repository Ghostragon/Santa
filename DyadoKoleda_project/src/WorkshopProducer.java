

public class WorkshopProducer {

	public static AbstractWorkshop getWorkshop(String workshopName) {
		
		if(workshopName.equals("TOY")) {
			return new ToyWorkshop();
		}
		
		if(workshopName.equals("COLOR")) {
			return new ColorWorkshop();
		}
		
		System.out.println("Unknown factory");
		return null;

	}
	
}
