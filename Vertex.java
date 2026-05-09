public class Vertex {
    public int id;

    public Vertex(int id) {
        this.id = id;
    }
    int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Vertex{" + "id=" + id + "}";
    }
}
