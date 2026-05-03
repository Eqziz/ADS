import java.util.Random;

public class MyTestingClass {
    private int id;
    private String name;

    public MyTestingClass(int id, String name) {
        this.id = id;
        this.name = name; 
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + id;
        if (name != null) {
            for (int i = 0; i < name.length(); i++) {
                hash = 31 * hash + name.charAt(i);
            }
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        MyTestingClass that = (MyTestingClass) obj;
        return id == that.id && (name != null ? name.equals(that.name) : that.name == null);
    }

    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>(997); // Используем простое число для лучшего распределения
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(random.nextInt(100000), "User" + random.nextInt(500));
            table.put(key, "Data_" + i);
        }

        table.printBucketSizes();
    }
}
