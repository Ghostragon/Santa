
public class DyadoKoleda {
	private Command command;
	private static DyadoKoleda dyado;
	private DyadoKoleda() {
		
	}
	
	public static DyadoKoleda getDyado() {
		if(dyado==null) {
			dyado = new DyadoKoleda();
		}
		return dyado;
		
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void IWantToy() {
		if(this.command == null) {
			System.out.println("No command set");
			return;
		}
		this.command.execute();
	}
	
}
