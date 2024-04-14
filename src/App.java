public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa<String, Integer>mhs = new Mahasiswa<String,Integer>("Rahul", "Cibaraja", 2022004005);
        mhs.print();

        Libmath<Integer, Double>math = new Libmath<Integer,Double>(20, 20.0);
        System.out.println("Hasil pengurangan: " + math.sub());

        Libmath<Integer, Double>math2 = new Libmath<Integer,Double>( 20, 20.0);
        System.out.println("Hasil pengurangan: " + math2.sub());

        System.out.println();

        Triangle.hitungLuas(10,10);
        System.out.println(Triangle.hitungKeliling(3,4));
        System.out.println();

        Iterations.Iterable();
        Iterations.iterator();
        Collections.addCollections();
        Collections.removeCollection();
        Collections.checkCollection();
        Lists.list();
        Sets.hashSet();
    }
}