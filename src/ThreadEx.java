public class ThreadEx implements Runnable {

    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    ThreadEx(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();
    }

    public void run() {
        int sum;
        System.out.println(thrd.getName() + " - запуск");
        answer = sa.sumArray(a);
        System.out.println("Сумма для " + thrd.getName() + ": " + answer);
        System.out.println(thrd.getName() + " завершение");
    }
}
