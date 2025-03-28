package happyfamily_v4.src;

public class RoboCat extends Pet{
    public RoboCat(String nickname,int age, int tricklevel, String[] habits){
        super(nickname,age,tricklevel,habits);
        setSpecies(Species.ROBOCAT);
    }
    @Override
    public void respond(){
        System.out.println("Hello, my name is %s and I am a %s".formatted(getNickname(),Species.ROBOCAT.name()));
    }
}
