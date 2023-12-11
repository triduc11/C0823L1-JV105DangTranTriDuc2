package bai_giang.bai_1_lop_animal_va_lop_interface_Edible.animal;

import bai_giang.bai_1_lop_animal_va_lop_interface_Edible.edible.Edible;

public  class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
