public class Ramda01 {
    public static void main(String[] args) {
        System.out.println("hello ramda!");

        /** 람다식 도입 전
        MyFunctionalInterface mfi = new MyFunctionalInterface() {
            @Override
            public int runSomething(int count) {
                return 0;
            }
        };
         */

        // 간소화 전
        // MyFunctionalInterface mfi = (int a) -> {return a * a;};

        // 간소화 후
        MyFunctionalInterface mfi = a -> a * a;

        // 람다식 테스트
        int b = mfi.runSomething(5);
        System.out.println("b::" + b);

        doIt(mfi);
    }

   public static void doIt(MyFunctionalInterface mfi) {
        int b = mfi.runSomething(5);

        System.out.println(b);
    }

}
