package emplist;

public class employee{
    public String name;
    public int age;
    public char eyecolor;
    private boolean engineer;
    private double salary;
    public employee(String name, int age, char eyecolor, boolean engineer, double salary){
        this.name=name;
        this.age=age;
        this.eyecolor=eyecolor;
        this.engineer=engineer;
        this.salary=salary;
    }
    public void printemployee(){
        System.out.println("1st employee's name is "+name);
        System.out.println("1st employee's age is "+age);
        System.out.println("1st employee's eyecolor is "+eyecolor);
        System.out.println("is 1st employee an engineer: "+engineer);
        System.out.println("1st employee's salary is "+salary);
    }
    public void updatesalary(double newsalary){
        if (salary<newsalary){
            double inc=newsalary-salary;
            salary=newsalary;
            System.out.println("the salary is increased about "+inc);
        }
        else{
            double dec=newsalary-salary;
            salary=newsalary;
            System.out.println("the salary is decreased about "+dec);

        }
    }
    public void checkwealth(){
        if (salary>3){
            System.out.println("This employee is reach as he/she makes: "+salary);

        }
        else{
            System.out.println("This employee's is poor as he/she makes: "+salary);
        }
    }

}