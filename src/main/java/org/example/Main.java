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
    caretaker.setAge(35);
    caretaker.setCaretakerName("Marcel");
    caretaker.addAnimal(new Animal("Lion"));
    caretaker.addAnimal(new Animal("Tiger"));
    caretaker.addAnimal(animal3);


    Caretaker caretaker2 = new Caretaker();
    caretaker2.setAge(20);
    caretaker2.setCaretakerName("Alina");
    caretaker2.addAnimal(new Animal("Cat"));
    caretaker2.addAnimal(new Animal("Dog"));
    caretaker2.addAnimal(new Animal("Duck"));
    caretaker2.addAnimal(new Animal("Snake"));

    Caretaker caretaker3 = new Caretaker();
    caretaker3.setAge(22);
    caretaker3.setCaretakerName("Raul");

    caretaker3.addAnimal(new Animal("Siegel"));
    caretaker3.addAnimal(new Animal("Cow"));
    caretaker3.addAnimal(new Animal("Goat"));
    caretaker3.addAnimal(new Animal("Pig"));
    caretaker3.addAnimal(animal3);

    caretakerService.persist(caretaker);

  }
}