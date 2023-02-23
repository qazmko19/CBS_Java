package task_5;

public class Animal {
    String name;
    int age;
    boolean tail;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isTail() {
        return tail;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, age: %d, tail: %b", name, age, tail);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + Boolean.hashCode(tail);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Animal animal = (Animal) obj;
        return (name == animal.name || (name != null && name.equals(animal.getName()))) &&
                (age == animal.age) &&
                (tail == animal.tail);
    }
}
