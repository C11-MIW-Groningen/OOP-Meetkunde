package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Een punt in de 2D ruimte
 */
public class Punt {
    private static final int DEFAULT_X_COORDINAAT = 0;
    private static final int DEFAULT_Y_COORDINAAT = 0;

    private double xCoordinaat;
    private double yCoordinaat;

    public Punt(double xCoordinaat, double yCoordinaat) {
        this.xCoordinaat = xCoordinaat;
        this.yCoordinaat = yCoordinaat;
    }

    public Punt() {
        this(DEFAULT_X_COORDINAAT, DEFAULT_Y_COORDINAAT);
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", this.xCoordinaat, this.yCoordinaat);
    }

    public double getxCoordinaat() {
        return xCoordinaat;
    }

    public double getyCoordinaat() {
        return yCoordinaat;
    }
}
