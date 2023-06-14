package compiler.language;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

public class Function extends MyNode {

	@Serial
	private static final long serialVersionUID = 1L;
	private final List<Var> paramList;
	private final List<Var> varList;
	private final List<Var> list;

	public Function(String id, String type) {
		super(id, type);
		paramList = new ArrayList<>();
		varList = new ArrayList<>();
		list = new ArrayList<>();
	}
	
	public void putParam(Var param){
		paramList.add(param);
	}
	
	public void putVar(Var var){
		varList.add(var);
	}

	public List<Var> getParamList() {
		return paramList;
	}

	public List<Var> getVarList() {
		return varList;
	}

	public List<Var> getList() {
		return list;
	}

	public void setList(List<Var> list) {
		this.list.addAll(list);
	}

}
