public class Main {

	public static void main(String[] args) {
		
		DyadoKoleda dyado;
		dyado=DyadoKoleda.getDyado();
		Board board = new Board();
		BlueBikesCommand blueBikesCommand = new BlueBikesCommand(board);
		PinkDollsCommand pinkDollsCommand = new PinkDollsCommand(board);
		Observer elf = new Elf("Gosho");
		Observer elf2 = new Elf("Gosho2");
		
		board.subscribe(elf);		
		dyado.setCommand(pinkDollsCommand);
		dyado.IWantToy();
		board.setToy("Pink","Doll");
		board.unsubscribe(elf);
		
		AbstractWorkshop dollWorkshop = WorkshopProducer.getWorkshop("TOY");
		Toy doll = dollWorkshop.getToy("DOLL");
		AbstractWorkshop pinkWorkshop = WorkshopProducer.getWorkshop("COLOR");
		Color pink = pinkWorkshop.getColor("PINK");
		doll.create();
		pink.fill();
		
		board.subscribe(elf2);
		dyado.setCommand(blueBikesCommand);
		dyado.IWantToy();
		board.setToy("Blue","Bike");
		board.unsubscribe(elf2);
		
		AbstractWorkshop bikeWorkshop = WorkshopProducer.getWorkshop("TOY");
		Toy bike = bikeWorkshop.getToy("BIKE");
		bike.create();

		AbstractWorkshop blueWorkshop = WorkshopProducer.getWorkshop("COLOR");
		Color blue = blueWorkshop.getColor("BLUE");
		blue.fill();
		
		
	}

}