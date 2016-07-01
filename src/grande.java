
public class grande extends size {

	public grande(color c) {
		super(c);
		this.applyColor();
	}

	@Override
	public void applyColor() {
        System.out.print(" grande");
        cor.applyColor();
	}

}
