package task_2_4;

public class EthernetAdapter extends Device {
    public int speed;
    public String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
        result = prime * result + (int)price;
        result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
        result = prime * result + speed;
        result = prime * result + ((mac == null) ? 0 : mac.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        EthernetAdapter device = (EthernetAdapter) obj;
        return (manufacturer == device.manufacturer || (manufacturer != null && manufacturer.equals(device.getManufacturer()))) &&
                (price == device.price) &&
                (serialNumber == device.serialNumber || (serialNumber != null && serialNumber.equals(device.getSerialNumber()))) &&
                (speed == device.speed) &&
                (mac == device.mac || (mac != null && mac.equals(device.getMac())));
    }

    @Override
    public String toString() {
        return String.format("Ethernet adapter = %s, price = %f, serial number = %s, speed = %d, MAC address = %s", manufacturer, price, serialNumber, speed, mac);
    }
}
