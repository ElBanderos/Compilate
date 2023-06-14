package compiler.geninterp;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import compiler.language.Var;

public class Function implements Serializable, ByteCode {

	@Serial
	private static final long serialVersionUID = 1L;
	private final List<Var> catalog;
	private final List<CodeArguments> instList;
	private final List<Integer> varList;
	private int PC = 0;

	public Function() {
		catalog = new ArrayList<>();
		instList = new ArrayList<>();
		varList = new ArrayList<>();
	}

	public int getPC() {
		return PC;
	}

	public void setPC(int pc) {
		PC = pc;
	}

	public List<CodeArguments> getInstList() {
		return instList;
	}

	public void setInstList(CodeArguments inst) {
		instList.add(inst);
	}

	public List<Var> getCatalog() {
		return catalog;
	}

	public void setCatalog(List<Var> catalog) {
		this.catalog.addAll(catalog);
	}

	public List<Integer> getVarList() {
		return varList;
	}

	public CodeArguments getInstruction(int n)
	{
		return instList.get(n);
	}

}
