//Memasukkan perintah fungsi Scanner
import java.util.Scanner;
/**
 * @(#)Project.java
 *
 *
 * @author Muhamad Hadi
 * @version 1.00 2021/6/1
 */

//Membuat  nama class
public class Program_struk_sederhana {
	//Methode Utama
	public static void main (String[] args) {
		
		//deklarasikan variabel dan tipe data 
		String nama_kasir, tanggal, waktu, jenis_order;
		String nomor_meja, jenis_pembayaran;
		int i, n, tot_semua=0, bayar;
		//Pendeklarasian variabel Array 1 dimensi 
		String nama_menu[]=new String[10];
		String kode_menu []=new String[10];
		int jmlh_menu[]=new int[10];
		int harga[]=new int[10];
		int tot_harga[]=new int[10];
		//Deklarasikan variabel untuk menyimpan sementara inputan keyboard dari user
		Scanner input=new Scanner(System.in);
	
		//output Label Nama usaha di struk & program kasir	
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("                         Bebek Goreng H. Slamet, Bukit           ");
		System.out.println("                         Jl.Diponegoro Jl. Baru No.250           ");
		System.out.println("                   Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan           ");
		System.out.println("-----------------------------------------------------------------------------------");
		
		//Inputan keyboard dari user
		System.out.print ("Masukkan Nama Kasir					    : ");
		nama_kasir=input.nextLine();
		System.out.print ("Tanggal                                 : ");
		tanggal=input.nextLine();
		System.out.print ("Waktu                                   : ");
		waktu=input.nextLine();
		System.out.print ("Jenis Order                             : ");
		jenis_order=input.nextLine();
		System.out.print ("No.Meja                                 : ");
		nomor_meja=input.nextLine();
		System.out.print ("Jenis Pembayaran                        : ");
		jenis_pembayaran=input.nextLine();
		System.out.print ("Jumlah pembayaran                       : ");
		bayar=input.nextInt();
		System.out.print ("\n");
		System.out.print ("Jumlah Data Menu yang akan dimasukkan   : ");
		n=input.nextInt();
		
		//Struktur Perulangan
			for (i=0; i<n; i++){
			//Deklarasikan variabel & tipe data untuk number
			int Number = i+1;
			System.out.print ("Menu Ke-"+Number+"\n");
			//Output kode kode menu yang akan tampil di inputan user
			System.out.println ("Kode menu                          : \n\n Bebek Goreng  \n 1.BU\n 2.DS\n 3.DB\n 4.PS\n 5.PB\n 6.RMK\n 7.KP\n\n Ayam  \n 8.DD\n 9.PH \n\n Tambahan  \n 10.NP\n 11.AR\n 12.LLP\n 13.SM\n 14.TU\n 15.TE\n 16.SA\n\n Minuman  \n 17.TT\n 18.TM\n 19.ETT\n 20.ETM\n 21.EJP\n 22.EJ\n 23.JP\n 24.AB\n 25.AMG\n 26.CPCN\n 27.JJ\n 28.JT\n 29.JA\n 27.JW\n 30.JM\n 32.JAP\n 32.JMM\n 33.JS\n 34.JJU\n 35.JSK\n 36.ET ");
			//Masukkan perintah inputan oleh user berupa kode menu dan jumlah menu yang di pesan
			System.out.print ("Masukkan Kode Menu diatas yang dipesan         : ");
			kode_menu[i]=input.next();
			System.out.print ("Masukkan Jumlah Menu yang dipesan              : ");
			jmlh_menu[i]=input.nextInt();
			
			/*
			 *Membandingkan kode menu yang telah diinputkan tadi menggunakan Struktur kontrol IF ELSE majemuk
			 *dan metode equals  */
			if (kode_menu[i].equals("BU")){
			harga[i]=100000;
			nama_menu[i]="\t\t\t  Bebek Utuh \t";
		}
			else if (kode_menu[i].equals("DS")){
			harga[i]=28000;
			nama_menu[i]="\t\t\tBebek Dada Super";
		}
			else if (kode_menu[i].equals("DB")){
			harga[i]=20000;
			nama_menu[i]="\t\t\tBebek Dada Biasa";
		}
			else if (kode_menu[i].equals("PS")){
			harga[i]=24000;
			nama_menu[i]="Bebek Paha Super";
		}
			else if (kode_menu[i].equals("PB")){
			harga[i]=19000;
			nama_menu[i]="Bebek Paha Biasa";
		}
			else if (kode_menu[i].equals("RMK")){
			harga[i]=21000;
			nama_menu[i]="Remukan Dada/Paha";
		}
			else if (kode_menu[i].equals("KP")){
			harga[i]=5000;
			nama_menu[i]="Kepala Bebek";
		}
			else if (kode_menu[i].equals("DD")){
			harga[i]=19000;
			nama_menu[i]="Ayam Goreng Dada";
		}
			else if (kode_menu[i].equals("PH")){
			harga[i]=19000;
			nama_menu[i]="\t\t\tAyam Goreng Paha";
		}
			else if (kode_menu[i].equals("NP")){
			harga[i]=5000;
			nama_menu[i]="\t\t\t\tNasi Putih \t";
		}
			else if (kode_menu[i].equals("AR")){
			harga[i]=6000;
			nama_menu[i]="Ati Rempela";
		}
			else if (kode_menu[i].equals("LLP")){
			harga[i]=2000;
			nama_menu[i]="Lalapan";
		}
			else if (kode_menu[i].equals("SM")){
			harga[i]=2500;
			nama_menu[i]="Sambal";
		}
			else if (kode_menu[i].equals("TU")){
			harga[i]=2000;
			nama_menu[i]="\t\t\t   Tahu Goreng \t";
		}
			else if (kode_menu[i].equals("TE")){
			harga[i]=2000;
			nama_menu[i]="Tempe Goreng";
		}
			else if (kode_menu[i].equals("SA")){
			harga[i]=3000;
			nama_menu[i]="\t\t\t   Sayur Asem \t ";
		}
			else if (kode_menu[i].equals("TT")){
			harga[i]=2000;
			nama_menu[i]="Teh Tawar";
		}
			else if (kode_menu[i].equals("TM")){
			harga[i]=3500;
			nama_menu[i]="Teh Manis";
		}
			else if (kode_menu[i].equals("ETT")){
			harga[i]=2500;
			nama_menu[i]="Es Teh Tawar";
			
		}
			else if (kode_menu[i].equals("ETM")){
			harga[i]=4500;
			nama_menu[i]="Es Teh Manis";
		}
			else if (kode_menu[i].equals("EJ")){
			harga[i]=7000;
			nama_menu[i]="\t\t\t\tEs Jeruk \t";
		}
			else if (kode_menu[i].equals("AB")){
			harga[i]=3000;
			nama_menu[i]="Aqua Botol";
		}
			else if (kode_menu[i].equals("JP")){
			harga[i]=6000;
			nama_menu[i]="Jeruk Panas";
		}
			else if (kode_menu[i].equals("AMG")){
			harga[i]=500;
			nama_menu[i]="Air Mineral Gelas";
		}
			else if (kode_menu[i].equals("CPCN")){
			harga[i]=6000;
			nama_menu[i]="Cappucino";
		}
			else if (kode_menu[i].equals("JJ")){
			harga[i]=11000;
			nama_menu[i]="Jus Jagung";
			
		}
			else if (kode_menu[i].equals("JT")){
			harga[i]=8000;
			nama_menu[i]="Jus Tomat";
		}
			else if (kode_menu[i].equals("JA")){
			harga[i]=8000;
			nama_menu[i]="Jus Apel";
		}
			else if (kode_menu[i].equals("JW")){
			harga[i]=9000;
			nama_menu[i]="Jus Wortel";
		}
			else if (kode_menu[i].equals("JM")){
			harga[i]=9000;
			nama_menu[i]="Jus Melon ";
		}
			else if (kode_menu[i].equals("JMM")){
			harga[i]=10000;
			nama_menu[i]="Jus Mangga";
		}
			else if (kode_menu[i].equals("JAP")){
			harga[i]=9000;
			nama_menu[i]="Jus Alpukat";
		}
			else if (kode_menu[i].equals("JS")){
			harga[i]=12000;
			nama_menu[i]="Jus Strawberry";
			
		}
			else if (kode_menu[i].equals("JJU")){
			harga[i]=10000;
			nama_menu[i]="Jus Jambu";
		}
			else if (kode_menu[i].equals("JSK")){
			harga[i]=10000;
			nama_menu[i]="Jus Sirsak";
		}
			else if (kode_menu[i].equals("ET")){
			harga[i]=1000;
			nama_menu[i]="ES Tawar";
		}
			else {
			nama_menu[i] = "-";
			harga[i] = 0;
		}
		
		//Perhitungan aritmatika untuk total harga satu menu dan total semua pesanan
		tot_harga[i]=harga[i]*jmlh_menu[i];
		tot_semua=tot_semua+tot_harga[i];
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("\n");
		System.out.println("\n");
		
			
		}
		//Cetak Struk/Hasil Output
		//Cetak Hasil struk/Hasil Output
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("                   Spesial Bebek Goreng Sambel Korek H. Slamet, Bukit           ");
		System.out.println("                         Jl.Diponegoro Jl. Baru No.250           ");
		System.out.println("                   Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan           ");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println ("Nama Kasir \t\t : "+nama_kasir+"\n"+"Tanggal \t\t : "+tanggal+"\n"+"Waktu \t\t\t : "+waktu+"\n"+"Jenis Order \t : "+jenis_order+"\n"+"No.Meja \t\t : "+nomor_meja);
		System.out.println ("Jumlah Data Menu : "+n);
		//
		
		//Judul list pesanan 
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println("No\t\t\tKode Menu\t\t\tNama Menu\t\t\t\t\t  Harga Menu\tJumlah Menu \tTotal Harga");
		System.out.println("----------------------------------------------------------------------------------------------------------");
		
		for (i=0; i<n; i++){
			int Number = i+1;
			System.out.println (+Number+"\t\t\t\t"+kode_menu[i]+" "+nama_menu[i]+"\t\t\t\t\t"+harga[i]+"\t\t\t"+jmlh_menu[i]+"\t\t\t"+tot_harga[i]);
			
		}
		
		//cetak subtotal dan perhitungan pembayaran
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println("Subtotal          : Rp. "+tot_semua);
		System.out.println("Jumlah Pembayaran : Rp. "+bayar);
		System.out.println("Kembalian         : Rp. " +(bayar - tot_semua));
		System.out.println("Jenis Pembayaran  : "+jenis_pembayaran);
		System.out.println("\n");
		
		System.out.println("                                             Terima kasih \n                                           ");
		System.out.println("                             Jl.Diponogoro Baru No.250 Palembang         Telp. : 0711-7443189           ");
		System.out.println("                             Jl.Mp.Mangkunegara No.25  Palembang         Telp. : 0711-812477           ");
		System.out.println("              Jl.A.Yani Tg.Takat Dpn. Perum permata biru Plaju Palembang Telp. : 0711-5743733           ");
		System.out.println("                          SPESIAL BEBEK GORENG SAMBEL KOREK PERTAMA 1986          ");
		

		
		
	} 
}
