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

    Caretaker caretakerOne = new Caretaker();
    caretakerOne.setCaretakerName("Marcel");
    caretakerOne.setAge(35);

    Caretaker caretakerTwo = new Caretaker();
    caretakerTwo.setCaretakerName("Ion");
    caretakerTwo.setAge(27);

    Caretaker caretakerThree = new Caretaker();
    caretakerThree.setCaretakerName("Daniel");
    caretakerThree.setAge(21);

    caretakerOne.addAnimal(new Animal("Lion"));
    caretakerOne.addAnimal(new Animal("Tiger"));
    caretakerOne.addAnimal(new Animal("Panther"));

    caretakerTwo.addAnimal(new Animal("Deer"));
    caretakerTwo.addAnimal(new Animal("Mouse"));
    caretakerTwo.addAnimal(new Animal("Zebra"));

    caretakerThree.addAnimal(new Animal("Parrot"));
    caretakerThree.addAnimal(new Animal("Lizard"));
    caretakerThree.addAnimal(new Animal("Beetle"));
    caretakerThree.addAnimal(new Animal("Rabbit"));

    caretakerService.persist(caretakerOne);
    caretakerService.persist(caretakerTwo);
    caretakerService.persist(caretakerThree);
  }
}