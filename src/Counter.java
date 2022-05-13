public class Counter {
    private int counter;

    public Counter(int startValue) {
    this.counter = startValue;
}

public Counter() {
    this.counter = 0;
}

public int value(){
    return counter;
}

public  void increase(){
    counter +=1;
}

public void increase(int increaseBy){
    if (increaseBy < 0) {
        return;
    }else {
        counter += increaseBy;
    }
}

public  void decrease(){
    counter = counter - 1;
}

public void decrease( int decreaseBy){
    if (decreaseBy < 0){
        return;
    }else {
        counter -= decreaseBy;
    }

@Override
public String toString(){
    return "Counter is currently set to: " +  value();
}

}


}