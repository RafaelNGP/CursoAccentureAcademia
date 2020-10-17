public class Door {
    private boolean status;
    private String color;
    private int dimensionX;
    private int dimensionY;
    private int dimensionZ;

    public Door(int dimensionX, int dimensionY, int dimensionZ) {
        this.color = "marrom";
        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
        this.dimensionZ = dimensionZ;
    }
    public Door() {
    }

    public boolean isStatus() {
        return status;
    }
    private void setStatus(boolean status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public int getDimensionX() {
        return dimensionX;
    }
    public void setDimensionX(int dimensionX) {
        this.dimensionX = dimensionX;
    }

    public int getDimensionY() {
        return dimensionY;
    }
    public void setDimensionY(int dimensionY) {
        this.dimensionY = dimensionY;
    }

    public int getDimensionZ() {
        return dimensionZ;
    }
    public void setDimensionZ(int dimensionZ) {
        this.dimensionZ = dimensionZ;
    }

    void open_close(){
        setStatus(!this.status);
    }
    void colorIT(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Door{" +
                "Open=" + status +
                ", color='" + color + '\'' +
                ", dimensionX=" + dimensionX +
                ", dimensionY=" + dimensionY +
                ", dimensionZ=" + dimensionZ +
                '}';
    }
}
