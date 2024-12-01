package com.mycompany.pert2;

/**
 *
 * @author hadin
 */

class Hewan {
    private String nama;
    private int energi;
    
    public Hewan(String nama, int energi) {
        this.nama = nama;
        this.energi = energi;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @return the energi
     */
    public int getEnergi() {
        return energi;
    }

    /**
     * @param energi the energi to set
     */
    public void setEnergi(int energi) {
        this.energi = energi;
    }
    
    public void bersuara() {
        System.out.println("Hewan ini bersuara.");
    }
    
    public void berjalan() {
        if (energi >= 5) {
            energi -= 5;
            System.out.println(getNama() + " sedang berjalan. Energi sekarang: " + energi);
        } else {
            System.out.println(getNama() + " tidak memiliki cukup energi untuk berjalan.");
        }
    }
    
    public void makan() {
        energi += 4;
        System.out.println(getNama() + " sedang makan. Energi sekarang: " + energi);
    }
}


class Kucing extends Hewan {
    
    public Kucing(String nama, int energi) {
        super(nama, energi);
    }
    
    @Override
    public void bersuara() {
        System.out.println(getNama() + " berkata: Meow!");
    }
}

class Anjing extends Hewan {
    public Anjing(String nama, int energi) {
        super(nama, energi);
    }
    
    @Override
    public void bersuara() {
        System.out.println(getNama() + " berkata: Bark!");
    }
}

public class Pert2 {

    public static void main(String[] args) {
        Hewan kucing = new Kucing("Kitty", 10);
        Hewan anjing = new Anjing("Buddy", 8);
        
        kucing.bersuara();
        kucing.berjalan();
        kucing.makan();
        kucing.berjalan();
        
        anjing.bersuara();
        anjing.berjalan();
        anjing.makan();
        anjing.berjalan();
    }
}
