package de.iad.ef.model;

public class RollOverCounter extends LimitedCounter {

    /*Methoden*/

   @Override
    public void count(){
            if (this.isMaximumReached()) {  //super.isMaximumReached() ebenfalls möglich
                this.setCount(this.minimumIs());
                return;
            }
            else{
                super.count();
            }
    }
    //@Override
        public void unCount(){
            if (this.isMinimumReached()) {  //super.isMaximumReached() ebenfalls möglich
            this.setCount(this.maximumIs());
            return;
        }
        else{
            this.uncount();
        }
    }
    // Konstruktoren

    public RollOverCounter(){
        super();

    }
    public RollOverCounter(Integer minCount, Integer maxCount){
        super(minCount, maxCount);

    }

}
