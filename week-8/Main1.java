interface playable
{
    public void play();
}
class Football implements playable
{
   public void play()
   {
      System.out.println("Foot ball");
   }
}
class Volleyball implements playable
{
   public void play()
   {
      System.out.println("Volley ball");
   }
}
class Basketball implements playable
{
   public void play()
   {
       System.out.println("Basket ball");
   }
}
class Main1
{
    public static void main(String args[])
    {
        System.out.println("Bhanu Teja");
        System.out.println("CSE24210");
        System.out.println("CSE-c");
        System.out.println("------");
        playable obj1 = new Football();
        playable obj2 = new Volleyball();
        playable obj3 = new Basketball();
        obj1.play();
        obj2.play();
        obj3.play();
    }
}
