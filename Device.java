public class Device {
    static class Laptop {
        String brand;
        String model;
        private String deviceId;

        public Laptop(String brand) {
            this.brand = brand;
        }

        public void printBrand() {
            System.out.println(brand);
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Laptop object with brand \"" + brand + "\" is being garbage collected.");
            super.finalize();
        }
    }

    public static void main(String[] args) {
        final Laptop l1 = new Laptop("Asus");
        l1.brand = "HP";
        l1.printBrand();
        System.out.println(l1.model);

        for (int i = 0; i < 100000; i++) {
            Laptop l = new Laptop("Dell");
            System.out.println(l);
        }
    }
}

// It still be abstract without any abstract method and concrete method
// abstract class Device{

// }


// abstract void partner();
// No method body — this means it’s only a declaration, not an implementation.
// It’s like a promise that subclasses must fulfill by providing their own version.
// The class containing it must be abstract.
// It’s part of the "what to do" in abstraction, without specifying "how to do it".
// Polymorphism: Allows different subclasses to have different implementations for the same method signature.


// void printInfo() {}
// Has a method body, even if empty.
// It’s a concrete method — it provides at least some implementation.
// Subclasses may override it, but they are not required to.
// It’s part of the "how to do it", even if you leave the body empty.
// You can call it directly without implementing in the subclass.

// | Feature             | `abstract void partner();`   | `void printInfo() {}`       |
// | ------------------- | ---------------------------- | --------------------------- |
// | Method body         | ❌ No                        | ✅ Yes (even if empty)      |
// | Must be overridden? | ✅ Yes, in concrete subclass | ❌ No, optional             |
// | Class containing it | Must be abstract             | Can be abstract or concrete |
// | Purpose             | Define **what** must be done | Define **how** it’s done    |
// | Directly callable?  | ❌ No (must override first)  | ✅ Yes                      |
