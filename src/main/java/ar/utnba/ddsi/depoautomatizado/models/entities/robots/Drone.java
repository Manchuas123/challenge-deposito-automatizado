package ar.utnba.ddsi.depoautomatizado.models.entities.robots;

public class Drone extends Robot {
    
    public Drone(Long id) {
        super(id);
    }

    //TODO no podemos implementar comportamiento de un dron que no conocemos, no sabemos como utiliza su hardware
    // como mucho podemos suponer que tendra las llamadas descrpitas en la clase "Robot"
} 