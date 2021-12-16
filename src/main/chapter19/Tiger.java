package main.chapter19;

import java.io.Serializable;

public class Tiger implements Mammal, Serializable {

    public boolean hasLegs(){
        return true;
    }

    @Override
    public boolean hasFur() {
        return false;
    }
    public boolean burnsBright(){
        return true;
    }
}
