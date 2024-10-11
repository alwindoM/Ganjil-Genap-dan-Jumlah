package outputjumlah;

public class Outputjumlah 
{
    //Pemanggilan ganjil dan genap melalui fungsi buatan
    public static void main(String[] args) 
    {
        int awal  = 1;
        int akhir = 10;
                
        tampilkanganjil(awal,akhir);
        tampilkangenap(awal,akhir);
    }
    
    //Fungsi buatan untuk ganjil
    public static void tampilkanganjil(int nim1,int nim2)
    {
        int jumlah = 0;
        for (int start = nim1; start <= nim2; start++)
        {
            if (start % 2 != 0) //Memeriksa apakah angka tersebut tidak habis dibagi 2 (Ganjil)
            {
                //menambahkan angka yang terdeteksi ganjil kedalam variabel jumlah
                jumlah += start;
                System.out.print(" "+start);
            }
        }
        //tampilkan jumlah angka ganjil keseluruhan
        System.out.print(" = " + jumlah +"\n");
    }
    
    //Fungsi buatan untuk genap
    public static void tampilkangenap(int nim1,int nim2)
    {
        int jumlah = 0;
        for (int start = nim1; start <= nim2; start++)
        {
            if (start % 2 == 0) //Memeriksa apakah angka tersebut habis dibagi 2 (Genap)
            {
                //menambahkan angka yang terdeteksi genap kedalam variabel jumlah
                jumlah += start;
                System.out.print(" "+start);
            }
        }
        //tampilkan jumlah angka genap keseluruhan
        System.out.print(" = " + jumlah +"\n");
    }
}
