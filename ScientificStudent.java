/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harisyanda
 */
class ScientificStudent extends StudentClass{
       
       String Mapel1;
       int num;
       String AlamatMurid;
       
       public ScientificStudent (String NM, int Nilai){
           super (NM,Nilai);
           num = Nilai;
           
       }

    public String getMapel1() {
        return Mapel1;
    }

    public void setMapel1(String Mapel1) {
        this.Mapel1 = Mapel1;
    }

    public String getAlamatMurid() {
        return AlamatMurid;
    }

    public void setAlamatMurid(String AlamatMurid) {
        this.AlamatMurid = AlamatMurid;
    }

       
    
    public static String muridipa(){
    
    return "Deskripsi Murid Ipa";
    } 
       
    @Override   
    public void exam(){
            System.out.println("Selamat Anda Lulus Ujian");
    }
    @Override
    public void exercises(){
            System.out.println("Selamat Anda Lulus Latihan");
    }  
    @Override
    public void interview(){
            System.out.println("Selamat Anda Lulus Wawancara");
    }
    @Override
    public void presentation(){
            System.out.println("Selamat Anda Lulus Presentasi");
    }

    
    boolean charAt(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    public void execises() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
    

