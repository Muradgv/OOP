package happyfamily_v4.src;

public class Woman extends Human{
    public Woman(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }
    @Override
    public void greetpet(){
        if (getFamily()!=null && getFamily().getPet()!=null)
            System.out.println("Hi my sweetheart "+getFamily().getPet().getNickname());
        else
            System.out.println("Where is my pet");

    }

    public void makeup(){
        System.out.println("this looks great on me");
    }

}
