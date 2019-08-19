/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harisyanda
 */
class SocialStudent extends StudentClass {

       String Mapel2;
       int num;
       public SocialStudent (String NM, int Nilai){
           super (NM,Nilai);
           num = Nilai;
       }

    public String getMapel2() {
        return Mapel2;
    }

    public void setMapel2(String Mapel2) {
        this.Mapel2 = Mapel2;
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
