class Abc extends Thread {
    public void run() {
        System.out.println("Single task from multiple Thread");
    }

    public static void main(String[] args) {
        Abc t1 = new Abc();
        t1.start();
        Abc t2 = new Abc();
        t2.start();
    }

}
