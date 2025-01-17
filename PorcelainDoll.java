public class PorcelainDoll extends Doll {
    public PorcelainDoll(String name, double price){
        super(name,"Porcelain", price);
    }
    @Override
    public void play(){
        System.out.println("Teddy Doll says: Hug me!");
    }
}