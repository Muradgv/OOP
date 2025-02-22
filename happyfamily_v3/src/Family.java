package happyfamily_v3.src;
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
        mother.setFamily(this);
        father.setFamily(this);

    }

    //getters and setters
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
    public Pet getPet(){ return pet;}
    public void setPet(Pet pet){ this.pet = pet; }
    public Human[] getChildren() {
        return children;
    }
    public void setChildren(Human[] children) {
        this.children = children;
    }

    //Functions
    public void addchild(Human child){
        Human[] newchild=Arrays.copyOf(children, children.length + 1);
        newchild[children.length]=child;
        children=newchild;
    }

    public boolean deletechild(int index){
        if (index<0 || index>= children.length){
            System.out.println("Out of the range");
            return false;
        }
        Human[] newChildren = new Human[children.length - 1];
        children[index].setFamily(null);
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                newChildren[j++] = children[i];
            }
        }
        children = newChildren;
        return true;
    }

    public boolean deletechild(Human child){
        if (child == null){
            return false;
        }

        else{
            for (int i=0;i<children.length;i++){
                if(child.equals(children[i])){
                    return deletechild(i);
                }
            }
        }
        return false;
    }

    public int countFamily() {System.out.println(children.length+2);
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Family{mother=%s, father=%s, children=%s, pet=%s}",
                mother, father, Arrays.toString(children), pet);
    }

    @Override
    protected void finalize() throws Throwable {
        throw new UnsupportedOperationException("finalize method is not supported");
        System.out.println("Family object is removed");
    }

}
