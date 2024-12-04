
public class Wann {

    public static void main(String[] args) {
        var nilaiUjian = 75;
        var persentaseKehadiran = 85;

        if (nilaiUjian < 0 || nilaiUjian > 100 || persentaseKehadiran < 0 || persentaseKehadiran > 100) {
            System.out.println("Error: Nilai atau kehadiran tidak valid! Pastikan berada di antara 0 dan 100.");
            return;
        }

        if (nilaiUjian >= 75 && persentaseKehadiran >= 80) {
            System.out.println("Anda mendapat nilai A");
        } else if (nilaiUjian >= 70 && persentaseKehadiran >= 75) {
            System.out.println("Anda mendapat nilai B");
        } else if (nilaiUjian >= 60 && persentaseKehadiran >= 65) {
            System.out.println("Anda mendapat nilai C");
        } else {
            System.out.println("Anda harus ikut semester antara!");
        }
    }
}
