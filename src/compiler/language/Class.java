package compiler.language;

import java.io.Serial;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class extends MyNode {
	@Serial
	private static final long serialVersionUID = 1L;
	private final Map<String, Function> methodList;
	private final Map<String, Var> fieldList;

	public Class(String name, String type) {
		super(name, type);
		methodList = new LinkedHashMap<>();
		fieldList = new LinkedHashMap<>();
	}

	public void putOnField(String fName, Var field) {
		fieldList.put(fName, field);
	}

	public void putOnMethod(String mName, Function currentMethod) {
		methodList.put(mName, currentMethod);
	}

	public Map<String, Function> getMethodList() {
		return methodList;
	}
}
