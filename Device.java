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