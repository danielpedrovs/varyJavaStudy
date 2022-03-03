package academy.learnprogramming;

public class Monitor {

    private String model;
    private String manufacture;
    private int Size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacture, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacture = manufacture;
        Size = size;
        this.nativeResolution = nativeResolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSize() {
        return Size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + ", " + y + " in colour " + color);
    }
}
