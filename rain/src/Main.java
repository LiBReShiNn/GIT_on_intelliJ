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
        System.out.println("k hklnlnl");
        System.out.println(args[0]);
        main2();
        main3();
        Imp impl = new Imp();
        impl.run();
        Imp impl2 = new Imp("z케호로리 호리리 호로돗 케케케",2);
        impl2.run();
        Imp impl3 = new Imp("서브마스터 생성이라귯",25445);
        impl3.run();
        impl.toString();
    }

    public static void main2() {
        System.out.println("k hklnlnl 2");
    }

    public static void main3() {
        System.out.println("k hklnlnl 3");
    }
}





