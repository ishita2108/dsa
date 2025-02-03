package dsa.tricky;

class Parent {
     void print() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
     void print() {
        System.out.println("Child static method");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.print();  // Output?
    }
}

