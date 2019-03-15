package springCore.methodInjection;

/**
 * Default Implementation class for the Command class
 * 
 * @author sebastianbuitrago
 *
 */
public class CommandBean implements Command {
	
	CommandBean(){
		System.out.println("Created the prototype Bean");
	}

	public void setState(Object commandState) {
		System.out.println("Called set state method from command bean implementation");
	}

	public Object execute() {
		System.out.println("Called execute method from command bean implementation");
		return null;
	}

}
