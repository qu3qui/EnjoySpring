package springCore.methodInjection;

public abstract class CommandManagerBean {
	
	public CommandManagerBean () {
		System.out.println("Constructor - CommandManagerBean");
	}
	
	public Object process(Object commandState) {
		
		//Create instance of the command
		Command command = createCommand();
		
		//Use the methods of the implementation
		command.setState(commandState);
        return command.execute();   
		
	}
	
	/**
	 * this method is used in xml to connect with the prototype bean
	 * that wants to bind with this singleton bean
	 * 
	 * Another way to use this is defining the Decorator Lookup above this method
	 * @return
	 */
	protected abstract Command createCommand();

}
