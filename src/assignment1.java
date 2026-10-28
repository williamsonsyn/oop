/*
    Assignment 1:Classes, objects and constructor
    PAWAN KOSHTI
    125B1F079
    A2
*/
class person{
    String name;
    int age;
    person(){
        
    }
    person(String name,int age){
        this.name=name;
        this.age=age;
    }
    person(person p){
        this.name=p.name;
        this.age=p.age;
    }
    public static void main(String[] args){
        person p1 = new person("pawan",19);
        person p2 = new person("balaji",19);
        person p3 = new person(p2); 
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p3.name);
        System.out.println(p3.age);
    }
   
}