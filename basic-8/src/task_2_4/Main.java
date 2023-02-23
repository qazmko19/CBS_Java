package task_2_4;

public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Samsung", 11499.99f, "ABC123EFG");
        Device device2 = new Device("Samsung", 11499.99f, "ABC123EFG");

        System.out.printf("%s, hashcode = %d, device 1 == device2: %b\n", device1.toString(), device1.hashCode(), device1.equals(device2));

        Monitor monitor1 = new Monitor("LG", 4999.99f, "GFE321CBA", 1920, 1080);
        Monitor monitor2 = new Monitor("LG", 4999.99f, "GFE321CBA", 1920, 1080);

        System.out.printf("%s, hashcode = %d, monitor 1 == monitor 2: %b\n", monitor1.toString(), monitor1.hashCode(), monitor1.equals(monitor2));

        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("Qualcomm", 999f, "QWE456UIO", 1000, "5F:75:3G:GF");
        EthernetAdapter ethernetAdapter2 = new EthernetAdapter("Qualcomm", 999f, "QWE456UIO", 1000, "5F:75:3G:GF");

        System.out.printf("%s, hashcode = %d, ethernet adapter 1 == ethernet adapter 2: %b\n", ethernetAdapter1.toString(), ethernetAdapter1.hashCode(), ethernetAdapter1.equals(ethernetAdapter2));
    }
}
