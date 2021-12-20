public class Main {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};

        ThreadEx te1 = new ThreadEx("Child #1", a);
        ThreadEx te2 = new ThreadEx("Child #2", a);

    }
}
