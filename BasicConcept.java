public class BasicConcept {
    int i;

    BasicConcept(int i) {
        this.i = i;
    }

    public int hashCode() {
        return i;
    }
    public String toString(){
        return i+"";
    }
    public static void main(String[] args) {
        BasicConcept b = new BasicConcept(45);
        System.out.println(b);
    }
}
