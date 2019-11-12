public class Cropland extends  Res {
    public Cropland() {
        this.cost = new Integer[]{70, 90, 70, 20};
        this.time = new Double[]{Double.valueOf(1450/3), 1.6, Double.valueOf(1000 / 3)};
        this.populationBase = 0;
    }
}
