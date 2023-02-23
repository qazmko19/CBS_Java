package task_2_4;

public class Monitor extends Device {
    public int resolutionX;
    public int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
        result = prime * result + (int)price;
        result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
        result = prime * result + resolutionX;
        result = prime * result + resolutionY;
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

        Monitor device = (Monitor) obj;
        return (manufacturer == device.manufacturer || (manufacturer != null && manufacturer.equals(device.getManufacturer()))) &&
                (price == device.price) &&
                (serialNumber == device.serialNumber || (serialNumber != null && serialNumber.equals(device.getSerialNumber()))) &&
                (resolutionY == device.resolutionY) &&
                (resolutionX == device.resolutionX);
    }

    @Override
    public String toString() {
        return String.format("Monitor = %s, price = %f, serial number = %s, resolution = %dx%d", manufacturer, price, serialNumber, resolutionX, resolutionY);
    }
}
