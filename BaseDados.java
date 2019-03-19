package atividade1;

public class BaseDados {
	
	public static boolean Verificador(String palavra) {
	
	String palavras[] = {"",
			"Program",
			"Pgrau",
			";",
			"Var",
			"y",
			",",
			"x",
			":",
			"real",
			"Const",
			"A",
			":=",
			"=",
			"B",
			"2",
			"3",
			"Begin",
			"Read",
			"(",
			")",
			"Y",
			"*",
			"+",
			"a",
			"b;",
			"Write",
			"End.",
			"."
			};
	
	for(String i : palavras) {
		if(i.equals(palavra))
		return true; 
		}
		return false;
	}
	
	


}
