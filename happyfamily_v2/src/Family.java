package happyfamily_v2.src;
import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Pet pet;
    private Human[] children;

    public Family(Human mother, Human father){
        this.mother=mother;
        this.father=father;
        this.children=new Human[0];
    }
//getters and setters of mother and father
    public Human getMother(){
        return mother;
    }
    public Human getFather() {
        return father;
    }
    public void setMother(Human mother) {
        this.mother = mother;
    }
    public void setFather(Human father) {
        this.father = father;
    }

    public void addchild(Human child){
        Human[] newchild=Arrays.copyOf(children, children.length + 1);
        newchild[children.length]=child;
        children=newchild;
    }

    public boolean deletechild(int index){
        Human[] newChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                newChildren[j++] = children[i];
            }
        }
        children = newChildren;
        children[index].setFamily(null);
        return true;
    }

    public int countFamily() {
        return 2 + children.length;
    }

    public String toString() {
        return String.format("Family{mother=%s, father=%s, children=%s, pet=%s}",
                mother, father, Arrays.toString(children), pet);
    }

}
