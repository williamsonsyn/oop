/*
    Assignment 2: Array of Objects
    PAWAN KOSHTI
    125B1F079
    A2
*/
class City{
    String name;
    int population;

    City(){

    }
    City(String name,int population){
        this.name=name;
        this.population=population;
    }
    City(City c){
        this.name=c.name;
        this.population=c.population;

    }
    void display(){
        System.out.print(this.name+" ");
        System.out.print(this.population);
        System.out.println();
    }
    public static void main(String[] args){
        City c[]= new City[5];
        c[0]= new City("Pune",12423542);
        c[1]= new City("Mumbai",12442373);
        c[2]= new City("Delhi",46345564);
        c[3]= new City("Jaipur",5675675);
        c[4]= new City("Nagpur",87967889);
        for(int i=1;i<c.length;i++){
             c[i].display();
        }
        

    }
    

}
