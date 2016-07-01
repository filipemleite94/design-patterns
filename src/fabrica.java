
public class fabrica {
	public void fazer(String nome, String tamanho, String cor, mediador med){
		if(nome.equals("figura")){
			med.fazer(new figura(), tamanho, cor);
		}
		else if(nome.equals("objeto")){
			med.fazer(new objeto(), tamanho, cor);
		}
		else System.out.println("Nada foi feito");
	}
}
