import java.util.StringTokenizer;

public class mediador {
	public void send(fabrica f, String msg){
		StringTokenizer st = new StringTokenizer(msg);
		if (st.countTokens() >= 3){
			f.fazer(st.nextToken(), st.nextToken(), st.nextToken());
		}
		else System.out.println("Nada foi feito");
	}
}
