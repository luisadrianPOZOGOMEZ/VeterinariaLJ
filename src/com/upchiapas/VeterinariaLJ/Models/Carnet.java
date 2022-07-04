package com.upchiapas.VeterinariaLJ.Models;

public class Carnet {
    private Dueno dueno;
    private Mascota mascota;

    public Carnet(Dueno dueno, Mascota mascota) {
        this.dueno = dueno;
        this.mascota = mascota;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public Mascota getMascota() {
        return mascota;
    }
}
