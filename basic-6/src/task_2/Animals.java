package task_2;

public enum Animals {
    DOG(10), CAT(5), ELEPHANT(30), PARROT(2);

    final int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name() + " " + age + " years old";
    }
}
