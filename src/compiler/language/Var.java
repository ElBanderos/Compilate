package compiler.language;

import java.io.Serial;

public class Var extends MyNode {

	@Serial
	private static final long serialVersionUID = 1L;

	public Var(String name, String type) {
		super(name, type);
	}

}
