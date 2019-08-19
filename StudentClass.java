 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Harisyanda
 */
abstract class StudentClass implements Activity{
    
        String NamaMurid;
        int NISMurid;
        int NilaiMurid;
        
            StudentClass ( String NM, int Nilai){
            NamaMurid = NM;
            NilaiMurid = Nilai;
            }

    public int getNISMurid() {
        return NISMurid;
    }

    public void setNISMurid(int NISMurid) {
        this.NISMurid = NISMurid;
    }
            
            
            
}
