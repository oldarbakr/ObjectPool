public class Main {
    public static void main(String[] args) {
        var pool = new FilHavuzu();
        var fil1 = pool.kontrol();
        var fil2 = pool.kontrol();
        var fil3 = pool.kontrol();
        pool.kayit(fil1);
        pool.kayit(fil3);
        var fil4 = pool.kontrol();
        var fil5 = pool.kontrol();

        pool.toString();
    }
}
