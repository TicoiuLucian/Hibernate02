package org.example;

import org.example.entity.Animal;
import org.example.entity.Caretaker;
import org.example.service.AnimalService;
import org.example.service.CaretakerService;
import org.example.service.Service;

public class Main {
  public static void main(String[] args) {

    Service<Caretaker> caretakerService = new CaretakerService();
    Service<Animal> animalService = new AnimalService();

    Animal animal3 = animalService.persist(new Animal("Pantera"));

    Caretaker caretaker = new Caretaker();
    Caretaker caretaker1 = new Caretaker();
    Caretaker caretaker2 = new Caretaker();
    Caretaker caretaker3 = new Caretaker();

    caretaker.setAge(35);
    caretaker.setCaretakerName("Marcel");
    caretaker.addAnimal(new Animal("Lion"));
    caretaker.addAnimal(new Animal("Tiger"));
    caretaker.addAnimal(animal3);

    caretaker1.setAge(40);
    caretaker1.setCaretakerName("Ionut");
    caretaker1.addAnimal(new Animal("Rhino"));
    caretaker1.addAnimal(new Animal("Giraffe"));
    caretaker1.addAnimal(new Animal("Boar"));

    caretaker2.setAge(45);
    caretaker2.setCaretakerName("Gheorghe");
    caretaker2.addAnimal(new Animal("Deer"));
    caretaker2.addAnimal(new Animal("Gazele"));
    caretaker2.addAnimal(new Animal("Hiena"));

    caretaker3.setAge(50);
    caretaker3.setCaretakerName("Mihai");
    caretaker3.addAnimal(new Animal("Dog"));
    caretaker3.addAnimal(new Animal("Cat"));
    caretaker3.addAnimal(new Animal("Ostrich"));


    caretakerService.persist(caretaker);
    caretakerService.persist(caretaker1);
    caretakerService.persist(caretaker2);
    caretakerService.persist(caretaker3);

  }
}