
public class pequeno extends size {

	public pequeno(color c) {
		super(c);
		this.applyColor();
	}

	@Override
	public void applyColor() {
		System.out.print(" pequeno");
		cor.applyColor();
	}

}
