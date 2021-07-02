package de.iad.ef.model;

public class StoppingCounter extends LimitedCounter {

    /*Methoden*/

   @Override
    public void count(){
            if (!super.isMaximumReached()) {  //super.isMaximumReached() ebenfalls möglich
                super.count();
            }

    }
    //@Override
    public void unCount(){
       if (!super.isMinimumReached()) {  //super.isMaximumReached() ebenfalls möglich
           super.uncount();
        }

    }
    // Konstruktoren

    public StoppingCounter(){
        super();

    }
    public StoppingCounter(Integer minCount, Integer maxCount){
        super(minCount, maxCount);

    }

}
