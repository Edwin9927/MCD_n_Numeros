package org.mcd;

import java.util.*;

import static java.lang.Integer.MAX_VALUE;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ListaNumeros = new ArrayList<>();
        String barra = "-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-";

        System.out.println(barra);
        System.out.print("Ingrese la cantidad de numeros: ");
        int num = limitesNum(2, Integer.MAX_VALUE);
        System.out.println(barra);
        System.out.println(barra);

        for (int i = 1; i <= num; i++){
            System.out.print("Ingrese el numero ("+i+"): ");
            ListaNumeros.add(limitesNum(0, MAX_VALUE));
        }

        mcd obj = new mcd(ListaNumeros);

        System.out.println(barra);
        System.out.println("El MCD de " + obj.getLista() + " es: " + obj.MCD_N());
        System.out.println(barra);
    }


    public static int limitesNum(int a, int b){
        Scanner in = new Scanner(System.in);
        int num = 0;
        boolean sw = true;
        do{
            try{
                num = in.nextInt();
                if (limiteCoorecto(num, a, b))
                    sw = false;
                else
                    throw new Exception("Numero no valido");
            }catch (Exception e){
                System.out.print(e.getMessage()+"\nIngrese nuevamente: ");
            }
            in.nextLine();
        }while (sw);
        return num;
    }

    public static boolean limiteCoorecto(int num,int a, int b){
        return num >= a && num <= b;
    }
}