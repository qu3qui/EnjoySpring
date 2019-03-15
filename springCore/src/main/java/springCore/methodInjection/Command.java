package springCore.methodInjection;

public interface Command {
	
	public void setState(Object commandState);
	
	public Object execute();
	
}
