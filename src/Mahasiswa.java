public class Mahasiswa<A, B> {
    A name;
    A alamat;
    B nim;

    public Mahasiswa(A name, A alamat, B nim) {
        this.name = name;
        this.alamat = alamat;
        this.nim = nim;
    }

    public void print() {
        System.out.println("Nama: " + name);
        System.out.println("Alamat: " + alamat);
        System.out.println("nime: " + nim);
    }

}