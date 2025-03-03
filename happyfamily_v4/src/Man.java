package happyfamily_v4.src;

public class Man extends Human{
    public Man(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }
    @Override
    public void greetpet(){
        if (getFamily()!=null && getFamily().getPet()!=null)
            System.out.println("Hi my bro "+getFamily().getPet().getNickname());
        else
            System.out.println("Where is my pet");

    }

    public void playfootball(){
        System.out.println("Pass the baaal!!!");
    }

}
