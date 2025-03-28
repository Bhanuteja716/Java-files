class vehicle{
    String brand;
    int speed;

    public vehicle(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }

    public static void main(String[] args) {

        car obj1=new car("ford",34,4);
        bike obj2=new bike("hero",100,true);
        truck obj3=new truck("tata",60,40);

    }
}

class car extends vehicle{

    int noofdoors;
    
    public car(String brand, int speed,int noofdoors) {
        super(brand, speed);
        this.noofdoors=noofdoors;
        System.out.println(brand);  
        System.out.println(speed);  
        System.out.println(noofdoors);  
    }
}

class bike extends vehicle{
    boolean gears;
    public bike(String brand,int speed,boolean gears){
        super(brand, speed);
        this.gears=gears;
        System.out.println(brand);  
        System.out.println(speed);  
        System.out.println(gears);
   }
}



class truck extends vehicle{
    int weight;
    public truck(String brand,int speed,int weight){
        super(brand,speed);
        this.weight=weight;
        System.out.println(brand);  
        System.out.println(speed);  
        System.out.println(weight); 
    }
}