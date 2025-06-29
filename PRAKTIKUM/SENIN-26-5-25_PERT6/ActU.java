class Mahasiswa {

    String name, kelas, npm, umur;
    int uts, uas, akhir;

    public Mahasiswa(String name, String kelas, String npm, String umur, int uts, int uas, int akhir) {
        this.name = name;
        this.kelas = kelas;
        this.npm = npm;
        this.umur = umur;
        this.uts = uts;
        this.uas = uas;
        this.akhir = akhir;
    }

    public void iniPerkenalan() {
        System.out.println("Nama :" + name);
        System.out.println("Kelas :" + kelas);
        System.out.println("NPM :" + npm);
        System.out.println("Umur :" + umur);
    }

    public void iniNilai() {
        System.out.println("Nilai UTS :" + uts );
        System.out.println("Nilai UAS :" + uas );
        System.out.println("Nilai Akhir :" + akhir );
    }
}

public class ActU {
    public static void main(String[] args) {
        Mahasiswa person1 = new Mahasiswa("Sheva", "1IA16", "50424947","20", 80, 85, 90);
        Mahasiswa person2 = new Mahasiswa("Shane", "1IA19", "51467712","19", 75, 90, 82);
        Mahasiswa person3 = new Mahasiswa("Luffy", "1IA18", "51468012","21", 70, 90, 82);
                
        person1.iniPerkenalan();
        person1.iniNilai();

        person2.iniPerkenalan();
        person2.iniNilai();
        
        person3.iniPerkenalan();
        person3.iniNilai();
    }
}