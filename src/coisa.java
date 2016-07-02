
public abstract class coisa {
	public abstract void fazer(String tamanho, String cor);
	
    public void padrao(String tamanho, String cor){
		int caso = 5;
		if(cor.equals("verde")){
			if(tamanho.equals("pequeno"))
				caso = 1;
			else if (tamanho.equals("grande"))
				caso = 2;
		}
		else if (cor.equals("azul")){
			if(tamanho.equals("pequeno"))
				caso = 3;
			else if (tamanho.equals("grande"))
				caso = 4;
		}
		switch( caso )
		{
		    case 1:
		            new pequeno(new verde());
		            break;		    
		    case 2:
		    		new grande(new verde());
		            break;		    
		    case 3:
		    		new pequeno(new azul());
		            break;		    
		    case 4:
	            	new grande (new azul());
	            	break;
		    default:
		            System.out.println(" e apenas isso");
		};
    }
}
