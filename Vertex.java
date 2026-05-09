public class Vertex {
    public int id;

    private Vertex(int id) {
        this.id = id;
    }
    private int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Vertex{" + "id=" + id + "}";
    }
}
