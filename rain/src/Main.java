public class Main {
    String zz = "zz";
    int nn=1;

    @Override
    public String toString() {
        return "Main{" +
                "zz='" + zz + '\'' +
                ", nn=" + nn +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        System.out.println("k hklnlnl");
        System.out.println(args[0]);
        main2();
        main3();
        Imp impl = new Imp();
        impl.run();
        Imp impl2 = new Imp("z케케케케",2);
        impl2.run();
        impl.toString();
    }

    public static void main2() {
        System.out.println("k hklnlnl 2");
    }

    public static void main3() {
        System.out.println("k hklnlnl 3");
    }
}





