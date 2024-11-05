
class Math {

    public int add(int x, int y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }

    public int add(double x, int y) {
        return (int) x + y;
    }

    public int add(int x, double y) {
        return x + (int) y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public void add(double x, double y, double z) {
        System.out.println(x + y + z);
    }

    public void add(double x, double y, double z, double w) {
        System.out.println(x + y + z + w);
    }

    public void add(double x) {
        System.out.println(x + (double) 10);
    }

    public void add(double x, float y) {
        System.out.println(x + y);
    }

    public void add(float x, float y) {
        System.out.println(x + y);
    }
}

class Test {

    public static void main(String[] args) {
        Math a = new Math();
        System.out.println(a.add(2, 3));
        System.out.println(a.add(2, 3, 4));
        System.out.println(a.add(2, 3.4));
        System.out.println(a.add(2.5, 3));
        System.out.println(a.add(3.4, 3.5));
        a.add(3.4, 3.5, 3.6);
        a.add(3.4, 3.5, 3.6, 3.7);
        a.add(10.6);
        a.add(10.6, 3.4f);
        a.add(1.6f, 3.2f);
    }
}
