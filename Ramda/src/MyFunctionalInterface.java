
// 해당 어노테이션 붙이는 건 옵션.
// 컴파일러가 해당 인터페이스가 함수형 인터페이스의 조건을 만족하는지 검사함.
// 즉, 하나의 추상 메서드로 선언되어 있는지 검사함.
@FunctionalInterface
public interface MyFunctionalInterface {
    public abstract int runSomething(int count);
}
