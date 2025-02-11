package happyfamily_v2.src;
import happyfamily_v2.src.Pet;
import happyfamily_v2.src.Human;
import  java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father){
        this.mother=mother;
        this.father=father;
        this.children=new Human[0];
    }

    public Human getmother(){
        return mother;
    }

    public Human getfather(){
        return father;
    }

    public Pet getpet(){
        return pet;
    }

    public String toString() {
        return "Family{mother=" + mother + ", father=" + father + ", children=" + Arrays.toString(children) + ", pet=" + pet + "}";
    }


}
