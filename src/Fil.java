import java.util.concurrent.atomic.AtomicInteger;

public class Fil {
    private static final AtomicInteger counter = new AtomicInteger();
    private final int id;

    public Fil(){
        this.id = counter.incrementAndGet();
        try {Thread.sleep(1000);}
        catch (InterruptedException e){e.printStackTrace();}
    }
    public int getId(){return id;}
    @Override
    public String toString(){return String.format("Fil id si=½d",id);};
}
