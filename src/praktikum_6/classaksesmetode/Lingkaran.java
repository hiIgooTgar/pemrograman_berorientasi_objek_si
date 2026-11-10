package praktikum_6.classaksesmetode;

public class Lingkaran {
    private double radius;
    
    void isiJariJari(double radius) {
        this.radius = radius;
    }
    
    private double perolehPi() {
        return 3.141592653589793;
    }
    
    public double perolehKeliling() {
        return 2 * perolehPi() * radius;
    }
}
