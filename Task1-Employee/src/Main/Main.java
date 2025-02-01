package main;
import emplist.employee ;
public class Main {
    public static void main(String[] args){
        employee emp1= new employee("bob",35,'b',true,3.64);
        emp1.printemployee();
        emp1.updatesalary(4);
        emp1.checkwealth();
    }
}