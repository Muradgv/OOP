package happyfamily_v4.src;

public class Dog extends Pet implements Foulable{
    public Dog(Species species, String nickname,int age, int tricklevel, String[] habits){
        super(species,nickname,age,tricklevel,habits);
        setSpecies(Species.DOG);
    }
    @Override
    public void foul(){
        System.out.println("I need to cover it up");
    }
    @Override
    public void respond(){
        System.out.println("Hello, my name is %s and I am a %s".formatted(getNickname(),Species.DOG.name()));
    }
}
