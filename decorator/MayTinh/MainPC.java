package decorator.MayTinh;

public class MainPC {
    public static void main(String[] args) {
        PC pc = new ConcretePC("Mainboard A", "Intel", "16GB", "SSD", "LCD 24 inch", 300
                ,200,400,600);

        System.out.println(pc.build());

        UpgradeRAM upgradedPC1 = new UpgradeRAM(pc, "RAM 16GB", 100);
        System.out.println("Thông tin sau khi nâng cấp RAM:");
        System.out.println(upgradedPC1.build());

        UpgradeCPU upgradedPC2 = new UpgradeCPU(pc, "CPU Y", 200);
        System.out.println("\nThông tin sau khi nâng cấp CPU:");
        System.out.println(upgradedPC2.build());
    }
}
