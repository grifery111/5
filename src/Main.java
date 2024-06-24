class Mobile {
    private String brand;
    private String model;

    public Mobile(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public static class MobileInfo {
        private int year;
        private int price;
        private int rom;

        public MobileInfo(int year, int price, int rom) {
            this.year = year;
            this.price = price;
            this.rom = rom;
        }
        public void displayMobileInfo() {
            System.out.println("Year of release: " + year);
            System.out.println("Price: " + price);
            System.out.println("ROM: " + rom + "\n");
        }
    }

    public static void main(String[] args) {
        Mobile samsung = new Mobile("Techno", "Pova Note2");
        MobileInfo samsungInfo = new MobileInfo(2020, 30000, 128);
        samsung.displayInfo();
        samsungInfo.displayMobileInfo();

        Mobile apple = new Mobile("Xiaomi", "12 Pro");
        MobileInfo appleInfo = new MobileInfo(2023, 25000, 256);
        apple.displayInfo();
        appleInfo.displayMobileInfo();
    }
}