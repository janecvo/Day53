public class Animal{
    private String animalName;
    private boolean isDog;


public Animal(String animalName){
    this.animalName = animalName;
}

    public Animal (String animalName, boolean isDog){
    this.animalName = animalName;
    this.isDog = isDog;
}

public Animal(boolean isDog){
    this.isDog = isDog;
}

public String getName(){
    return animalName;
}

public boolean getIsDog(){
    return isDog;
}

@Override
public String toString(){
    getName();
    getIsDog();
    return  getName() + " is a dog  = " + getIsDog();
}

}