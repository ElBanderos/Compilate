package compiler.language;

public class MyCharacter {

	private final MyScopeAccess root;
	private MyScopeAccess current;
	
	public MyCharacter() {
		root = new MyScopeAccess(null);
		current = root;
	}

	public void enterScope() {
		current = current.nextChild();
	}

	public void exitScope() {
		current = current.getParent();
	}

	public void put(String key, MyNode item) {
		current.put(key, item);
	}

	public MyNode lookup(String key) {
		return current.watch_up(key);
	}

	public void printTable() {
		System.out.format("| NAME                        | TYPE                | SCOPE                      |%n");
		root.print();
	}

	public void resetTable() {
		current = root; root.reset();
	}

	public void setCurrentClass(MyNode cRec)
	{
		current.setContainingClass(cRec);
	}

	public MyNode getCurrentClass()
	{
		return current.getContainingClass();
	}
}
