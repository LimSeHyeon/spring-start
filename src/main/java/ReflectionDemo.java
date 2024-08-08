import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object object = new Car();
//        object.ride();
        Class carClass = Car.class;
        // Reflection
        Method ride = carClass.getMethod("ride");

        ride.invoke(object, null);

//        Car car = new Car();
//        car.ride();
    }
}

class Car {
    public void ride() {
        System.out.println("부릉부릉");
    }
}