package com.example.summer.generic;

public class GenericMethodDemo {
    public static void main(String[] args) {

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

class classWithGenericMethod<T> {
    T t;

    public <T> T genericMethod(T t1, T t2) {
        return t1;
    }
}
