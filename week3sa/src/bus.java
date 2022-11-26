public class bus {
    int number;
    int fueledOil;
    int maxPassengers=30;
    int price = 1000;
    String run = "운행";
    int moneyMade = 0;
    int passenger;
    int currentPassengers;
    int speed = 0;


    public bus(int currentPassengers, int number, int fueledOil){
        this.number = number;
        this.fueledOil=fueledOil;
        this.currentPassengers = currentPassengers;
    }
    public int remainingSeats(){
        return maxPassengers-currentPassengers-passenger;
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


    public void changeStatus(){
        if(this.run=="차고지행") {
            if (fueledOil > 10) {
                this.run = "운행";
                System.out.println("차고지행->운행");
            } else if (fueledOil < 10) {
                System.out.println("기름이 부족합니다");
            }
        }
        if(this.run=="운행"){
            this.run="차고지행";
            System.out.println("운행->차고지행");
            if(fueledOil<10){
                this.run = "차고지행";
            }
        }


    }
    public void take(int passenger) {
        for(int i =0; i<passenger; i++){
            this.passenger++;
            this.moneyMade+=1000;
        }

    }
    public int getMoneyMade() {
        return moneyMade;
    }
    public String running(){
        return run;
    }
    public int speedUp(int x){
        return speed+= x;
    }
    public int speedDown(int x){
        return speed-=x;
    }

    public void showInfo() {
        System.out.println("차량번호는: "+number);
        System.out.println("번돈은 "+moneyMade);
        System.out.println("차량상태는 "+this.running());
        System.out.println("남은좌석은 "+this.remainingSeats());
        System.out.println("기름량은"+this.getoil());


    }

}


