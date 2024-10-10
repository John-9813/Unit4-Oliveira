package org.events.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.Set;

@Entity
@DiscriminatorValue("ATLETICA")
public class GaraDiAtletica extends Evento {

    @ManyToMany
    private Set<Persona> atleti;

    @ManyToOne
    private Persona vincitore;

    // Costruttori, getter e setter
}

