package com.example.summer.generic;

import java.sql.SQLOutput;

public class GenericClassDemo {
    public static void main(String[] args) {
        BoxObject boxObject = new BoxObject();
        boxObject.o = new Object();
        System.out.println(boxObject.o.toString());

        BoxGeneric boxGeneric = new BoxGeneric();
        boxGeneric.t = new Object();
        System.out.println(boxGeneric.t.toString());

//        String str1 = (String) boxObject.o;
//        String str2 = (String) boxGeneric.t;

        BoxObject boxComponent = new BoxObject();
        boxComponent.o = new Component();
        Component component = (Component) boxComponent.o;
        System.out.println(component.field);

        BoxGeneric<Component> boxGenericComponent = new BoxGeneric<>();
        boxGenericComponent.t = new Component();
        System.out.println(boxGenericComponent.t.field);


//        String str1 = (String) boxComponent.o; //런타임 시점 예외 잡힘
//        String str2 = (String) boxGenericComponent.t; // 컴파일 시점 예외 잡힘
    }
}

class BoxGeneric<T> {
    T t;
}

class BoxObject {
    Object o;
}

class Component {
    String field;
}
