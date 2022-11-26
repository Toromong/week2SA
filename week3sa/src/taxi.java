public class taxi {
    int maxPassengers=4;
    int number;
    String destination;
    int distanceToDestination;
    int defaultDistance = 1;
    int defaultPrice = 3000;
    int pricePerDistance = 1000;
    int currentPassengers;
    int fueledOil;
    String run = "운행";
    public taxi(int currentPassengers, int number, int fueledOil,String destination,int distanceToDestination){
        this.number = number;
        this.fueledOil=fueledOil;
        this.currentPassengers = currentPassengers;
        this.destination = destination;
        this.distanceToDestination = distanceToDestination;

    }
    public int getNumber(){
        return number;
    }
    public int getoil(){
        return fueledOil;
    }
    public void addfuel(int x){
        fueledOil+=x;
    }
    public void usefuel(int x){
        fueledOil-=x;
    }
    public String running(){
        return run;
    }
    public int finalPrice(int x){
        return 3000+1000*(x-1);
    }

    public void showtaxiInfo() {

        System.out.println("차량번호는: "+number);
        System.out.println("목적지는"+destination+"거리는"+distanceToDestination);
        System.out.println("차량상태는 "+this.running());
        System.out.println("기름량은"+this.getoil());
        System.out.println("최종가격은"+this.finalPrice(this.distanceToDestination));
    }
}

/*
클래스:택시
속성:번호, 주유량,최대승객수,목적지, 목적지까지거리, 기본거리, 기본요금,거리당요금,
메서드:
 */