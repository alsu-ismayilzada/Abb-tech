package lesson_1;

public class Task {

    public static void main(String[] args) {
        //autoboxing

        int primitiveInt = 10;
        Integer wrapperInt;
        wrapperInt = primitiveInt;

        //unboxing

        Integer anotherWrapperInt = 25;
        int anotherPrimitiveInt = anotherWrapperInt;

        System.out.println("primitiveInt: " + primitiveInt);
        System.out.println("wrapperInt: " + wrapperInt);
        System.out.println("anotherWrapperInt: " + anotherWrapperInt);
        System.out.println("anotherPrimitiveInt: " + anotherPrimitiveInt);

    }
}
