class myclass
{
      static int count=0;
      static double pi=3.14;
      myclass()
      {
           count = count+1;
       }
       public void set()
       {
            System.out.println("Count is:"+count);
            System.out.println("Pi value is:"+pi);
        }
        public static void main(String args[])
        {
            myclass m = new myclass();
            m.set();
            myclass m1 = new myclass();
            m1.set();
            myclass m2 = new myclass();
            m2.set();
       System.out.println("Final count is:"+count);
       System.out.println("Final value of pi is:"+pi);
     }
}