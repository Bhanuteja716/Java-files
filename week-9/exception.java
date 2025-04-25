class exception
{
    public static void checkNumber(int number) throws Exception
     {
         try
         {
            if(number%2==0)
            {
                throw new Exception("Even number cannot be instantiated"+number);
            }
            else
            {
                   System.out.println("Odd number found"+number);
            }
        }
         catch(Exception e)
          {
               System.out.println("Error found");
          }

        
     }
     public static void main(String args[])
     {
         checkNumber(4);
         System.out.println("The output is:"+e.getMessage());
     }

 }