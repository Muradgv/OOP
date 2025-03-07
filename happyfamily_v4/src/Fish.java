package happyfamily_v4.src;

public class Fish extends Pet{
    public Fish(String nickname,int age, int tricklevel, String[] habits){
        super(nickname,age,tricklevel,habits);
        setSpecies(Species.FISH);
    }

    @Override
    public void respond(){
        System.out.println("Hello, my name is %s and I am a %s".formatted(getNickname(),Species.FISH.name()));
    }
}
