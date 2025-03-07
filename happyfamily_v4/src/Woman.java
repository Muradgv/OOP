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
            System.out.println("My pet is lost");

    }

    public void makeup(){
        System.out.println("This looks great on me");
    }

}
