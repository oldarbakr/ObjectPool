import java.util.HashSet;
import java.util.Set;

public abstract class NesneHavuzu<T>{
    private final Set<T> uygunNesneler = new HashSet<>();
    private final Set<T> kullanmadakiNesneler = new HashSet<>();

    protected abstract T create();

    public synchronized T kontrol(){
        if(uygunNesneler.isEmpty()){uygunNesneler.add(create());}

            var a= uygunNesneler.iterator().next();
        uygunNesneler.remove(a);
        kullanmadakiNesneler.add(a);
            return a;

    }

    public synchronized void kayit(T nesneOrnegi){
        kullanmadakiNesneler.remove(nesneOrnegi);
        uygunNesneler.add(nesneOrnegi);
    }
    @Override
    public String toString(){
    return String.format("Uygun olan nesne adedi=½d kullanımda olan nesne adedi=%d"
            ,uygunNesneler.size(),kullanmadakiNesneler.size());
}
}
