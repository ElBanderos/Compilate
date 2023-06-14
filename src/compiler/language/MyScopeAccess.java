package compiler.language;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyScopeAccess {

	private int next = 0;
	private MyScopeAccess parent;
	private final List<MyScopeAccess> children;
	private final Map<String, MyNode> records;

	private MyNode containingClass;

	public MyScopeAccess(Object object) {
		children = new ArrayList<>();
		records = new HashMap<>();
		if (object != null)
			parent = (MyScopeAccess) object;
	}

	public MyScopeAccess nextChild() {
		MyScopeAccess nextC;
		if (next >= children.size()) {
			nextC = new MyScopeAccess(this);
			children.add(nextC);
		} else nextC = children.get(next);
		next++;
		return nextC;
	}

	public MyScopeAccess getParent()
	{
		return parent;
	}

	public void put(String key, MyNode item)
	{
		records.put(key, item);
	}

	public MyNode watch_up(String key) {
		if (records.containsKey(key)) return records.get(key);
		else {
			if (parent == null) return null;
			else return parent.watch_up(key);
		}
	}

	public void print() {
		for (Map.Entry<String, MyNode> entry : records.entrySet())
		{
			String leftAlignFormat = "| %-27s | %-19s | %-27s|%n";
			String key = entry.getKey();
			MyNode value = entry.getValue();
			String recordClasses = value.getClass().getSimpleName();
			System.out.format(leftAlignFormat, key, value.getType(), recordClasses);
		}
		for (MyScopeAccess myScopeAccess : children) myScopeAccess.print();
	}

	public void reset() {
		next = 0;
		for (MyScopeAccess child : children) child.reset();
	}

	public void setContainingClass(MyNode myNode)
	{
		containingClass = myNode;
	}

	public MyNode getContainingClass()
	{
		return containingClass;
	}

}
