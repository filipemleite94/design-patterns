public abstract class size {
    //Composition - implementor
    protected color cor;
     
    //constructor with implementor as input argument
    public size(color c){
        this.cor=c;
    }
     
    abstract public void applyColor();
}