public class TeddyDoll extends Doll{
    public TeddyDoll(String name, double price){
        super(name,"Fur", price);
    }
    @Override
    public void play(){
        System.out.println("Teddy Doll says: Hug me!");
    }
}