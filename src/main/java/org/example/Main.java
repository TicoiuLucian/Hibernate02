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
    Caretaker caretaker1 = new Caretaker();
    caretaker.setAge(40);
    caretaker.setCaretakerName("Ion");
    Caretaker caretaker2 = new Caretaker();
    caretaker.setAge(52);
    caretaker.setCaretakerName("Vasilica");
    caretaker2.addAnimal(new Animal("Lion"));
    caretaker2.addAnimal(new Animal("Goose"));
    caretaker2.addAnimal(new Animal("Bear"));
    caretaker1.addAnimal(new Animal("Tiger"));
    caretaker.addAnimal(new Animal("Dog"));
    caretaker.addAnimal(new Animal("Wolf"));
    caretaker1.addAnimal(new Animal("Deer"));
    caretaker1.addAnimal(new Animal("Lama"));
    caretaker.addAnimal(animal3);

    caretakerService.persist(caretaker);

  }
}