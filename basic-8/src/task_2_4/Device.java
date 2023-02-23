package task_2_4;

public class Device {
    public String manufacturer;
    public float price;
    public String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
        result = prime * result + (int)price;
        result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
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

        Device device = (Device) obj;
        return (manufacturer == device.manufacturer || (manufacturer != null && manufacturer.equals(device.getManufacturer()))) &&
                (price == device.price) &&
                (serialNumber == device.serialNumber || (serialNumber != null && serialNumber.equals(device.getSerialNumber())));
    }

    @Override
    public String toString() {
        return String.format("Device = %s, price = %f, serial number = %s", manufacturer, price, serialNumber);
    }
}
