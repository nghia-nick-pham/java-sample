package java_functional_programming.stream_api;

class Fruit {
    private String name;
    private int id;

    public Fruit(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
