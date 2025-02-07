class test6
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter any number:");
       int n = sc.nextInt();
       System.out.println(n<<1);
       System.out.println(n<<2);
       System.out.println(n<<3);
       System.out.println(n>>1);
       System.out.println(n>>2);
       System.out.println(n>>3);
    }
}