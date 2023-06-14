package compiler.geninterp;

import java.io.Serial;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class File implements Serializable, ByteCode {

	@Serial
	private static final long serialVersionUID = 1L;
	private final Map<String, Function> methods;
	private Function mainMethod;

	public File() {
		methods = new LinkedHashMap<>();
		mainMethod = new Function();
	}

	public Map<String, Function> getMethods() {
		return methods;
	}

	public void addMethod(String name, Function method) {
		methods.put(name, method);
	}

	public Function getMainMethod() {
		return mainMethod;
	}

	public void setMainMethod(Function method) {
		mainMethod = method;
	}

}
