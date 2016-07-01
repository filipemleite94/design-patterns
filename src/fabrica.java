
public class fabrica {
	public void fazer(String nome, String tamanho, String cor){
		if(nome.equals("figura")){
			(new figura()).fazer(tamanho, cor);
		}
		else if(nome.equals("objeto")){
			(new objeto()).fazer(tamanho, cor);
		}
	}
}
