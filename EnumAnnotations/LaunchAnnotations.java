package EnumAnnotations;

class Animal {
    public void animalUallyHuntsandeats() {
        IO.print("Animal eating ......");
    }

    public void animalUsuallyHuntsandEats() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'animalUsuallyHuntsandEats'");
    }
}

class Tiger extends Animal {
    // override
    @Override
    public void animalUsuallyHuntsandEats() {
        IO.print("Tiger fearless eat after hunt ");
    }
}

public class LaunchAnnotations {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        tiger.animalUallyHuntsandeats();
    }
}
