package org.mcd;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> ListaNumeros = new ArrayList<>();

        System.out.println("Ingrse la cantidad de numeros: ");
        int num = in.nextInt();

        int mcd = 0;

        for (int i = 0; i < num; i++){
            System.out.println("Ingrse el numero:");
            ListaNumeros.add(in.nextInt());
        }

        System.out.println("mcd es " + MCD_N(ListaNumeros));
    }


    public static int maximoComunDivisor(int a, int b) {
        int temporal;//Para no perder b
        while (b != 0) {
            temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }

    public static int MCD_N (ArrayList<Integer> lista){
        Enumeration<Integer> e = Collections.enumeration(lista);
        int mcd = 0;
        int i = 1;
        while(e.hasMoreElements()){
            if (i == 1){
                mcd = e.nextElement();
            } else {
                mcd = maximoComunDivisor(mcd, e.nextElement());
            }
            i++;
        }
        return mcd;
    }

}