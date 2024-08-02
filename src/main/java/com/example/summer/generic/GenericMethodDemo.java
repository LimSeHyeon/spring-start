package com.example.summer.generic;

public class GenericMethodDemo {
    public static void main(String[] args) {
        ClassWithGenericMethod<Integer> classWithGenericMethod = new ClassWithGenericMethod<>();
        classWithGenericMethod.<Integer>genericMethod(7,8);
    }
}

class GenericClass<C> {
    C c;

    // 제네릭 클래스
    public C methodC(C c) {
        return c;
    }

    // 제네릭 메소드
    public <M> M methodD(M m) {
        return m;
    }

    public <G> C multiMethod(G g, C c) {
        return c;
    }
}

class ClassWithGenericMethod<T> {
    T t; // 제네릭 클래스

    public <T> T genericMethod(T t1, T t2) { // <T> : 나 제네릭 쓰겠다 ! 나머지 세 T 모두 같은 T !
        return t1;
    }
}
