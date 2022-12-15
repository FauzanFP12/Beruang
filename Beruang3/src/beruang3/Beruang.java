
package beruang3;


public class Beruang  {
    private int statusTumbuh;//0-4 
    private int jumlahMinum; 
    private int jumlahMakanan;
    public Beruang() { 
        statusTumbuh = 0; 
        jumlahMinum = 0; 
        jumlahMakanan = 0;
    }
    public int getJumlahMinum(){ 
        return jumlahMinum;
    }
    public void setJumlahMinum(int n){ 
        jumlahMinum = n;
    }
    public int getJumlahMakanan(){ 
        return jumlahMakanan;
    }
    public void setJumlahMakanan(int n){ 
        jumlahMakanan = n;
    }

    public void setStatusTumbuh(int n){ 
        statusTumbuh = n;
    }
    public void beriMinum() { 
        jumlahMinum++; 
        cekKondisiTumbuh();
    }
    public void beriMakanan() { 
        jumlahMakanan++; 
        cekKondisiTumbuh();
    }
    public void cekKondisiTumbuh() { 
    //cek kecukupan air dan Ikan
    if(jumlahMinum >=2 && jumlahMakanan >=3) { 
        tumbuh();
        } 
    }
    public void tumbuh() { 
        if(statusTumbuh <4) { 
            jumlahMinum = jumlahMinum - 2; 
            jumlahMakanan = jumlahMakanan - 3; 
            statusTumbuh++;}}
    public void displayBeruang() {
    System.out.println(getStatusTumbuhText());
    System.out.println("Jumlah Minum:" + jumlahMinum);
    System.out.println("Jumlah Makanan:" + jumlahMakanan);}

    public String getStatusTumbuhText() { 
    switch(statusTumbuh) {  
        case 0: return "Bayi Beruang"; 
        case 1: return "Beruang"; 
        case 2: return "Beruang Dewasa";
    } return "Telah Berkembang";
    }
    
    public int getStatusTumbuh() { 
        return statusTumbuh;
    }
    public String getImagePath() {
    String tImagePath = "img/bayi.png"; 
    switch(statusTumbuh) { 
        case 0: tImagePath = "img/bayi.png"; break; 
        case 1: tImagePath = "img/remaja.png"; break;
        case 2: tImagePath = "img/dewasa.png"; break; 
        case 3: tImagePath = "img/telahberkembang.png"; break; 
        case 4: tImagePath = "img/telahberkembang.png"; break; 
    } return
      tImagePath;
    }
}

