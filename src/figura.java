public class figura extends coisa {
	@Override
	public void fazer(String tamanho, String cor){
		System.out.print("Foi criado um fig");
		padrao(tamanho, cor);
	}
}