class test extends Thread{
    public void run(){
        System.out.println("Single Task from single Thread");
    }
    public static void main(String[] args) {
        test t=new test();
        t.start();
    }
}
