package de.iad.ef.model;

public abstract class LimitedCounter extends BasicCounter {

    private final Integer DEFAULT_MAXIMUM = Integer.MAX_VALUE;
    private final Integer DEFAULT_MINIMUM = Integer.MIN_VALUE;
    private Integer minimumCount;
    private Integer maximumCount;

    //Konstruktor

    protected LimitedCounter() {
        this(0, 999);
        /*super();  Alternative
        this.minimumCount = 0;
        this.maximumCount = 999;*/

    }
    protected LimitedCounter( Integer min, Integer max){
        super(min);// macht das was BasicCounter macht, nur dass er jetzt Grenzen hat
        this.maximumCount=max;
        this.minimumCount=min;

    }

    //Getter & Setter
    public Integer getDEFAULT_MAXIMUM() {
        return DEFAULT_MAXIMUM;
    }

    public Integer getDEFAULT_MINIMUM() {
        return DEFAULT_MINIMUM;
    }

    public Integer minimumIs(){
        return minimumCount;

    }
    public Integer maximumIs(){
        return maximumCount;

    }
    // Methoden

    public Boolean isMaximumReached(){
        if(this.currentCount()==maximumCount){
        return true;
        }
        else return false;
    }

    public Boolean isMinimumReached(){
        //Alternative=
        return this.currentCount()== minimumCount;

//        if(this.currentCount()== maximumCount) {
//            return true;
//        }
//        else return false;
    }

}
