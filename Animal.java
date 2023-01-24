public final class Animal {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }
    public void printInfo() {
        System.out.printf("Привет %s", this.name);
    }
}
