public class Imp implements Runnable {


    String impl = "하이요미";
    int num = 7;

    public Imp(String impl, int num) {
        this.impl = impl;
        this.num = num;
    }

    public Imp() {
    }

    @Override
    public void run() {
        if (num == 6) {
            System.out.println(impl + num);
        } else {

        }
    }

    @Override
    public String toString() {
        return "Imp{" +
                "impl='" + impl + '\'' +
                ", num=" + num +
                '}';
    }
}
