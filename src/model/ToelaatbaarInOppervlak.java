package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Een object die deze interface implementeert kan bepalen of deze op een zeker oppervlak past.
 */
public interface ToelaatbaarInOppervlak {
    boolean pastInOppervlak(double lengte, double breedte);
}
