package org.mcd;

import java.util.ArrayList;
import java.util.Iterator;

public class mcd {
    private ArrayList<Integer> lista;

    public mcd(ArrayList<Integer> lista) {
        this.lista = lista;
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Integer> lista) {
        this.lista = lista;
    }

    public int maximoComunDivisor(int a, int b) {
        int temporal;//Para no perder b
        while (b != 0) {
            temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }

    public int MCD_N(){
        Iterator<Integer> e = getLista().iterator();
        int mcd = 0;
        int i = 1;
        while(e.hasNext()){
            if (i == 1){
                mcd = e.next();
            } else {
                mcd = maximoComunDivisor(mcd, e.next());
            }
            i++;
        }
        return mcd;
    }

}
