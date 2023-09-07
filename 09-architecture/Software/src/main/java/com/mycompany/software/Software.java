/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.software;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author UTFPR
 */
public class Software {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream  
        ArrayList<String> lista_texto = new ArrayList();
        ArrayList<String> lista_hash = new ArrayList<>();
        ArrayList<String> listai_hash = new ArrayList<>();

        try {
            FileInputStream fileIn = new FileInputStream("save.obj");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            ArrayList<Object> obj = (ArrayList<Object>) objectIn.readObject();
            objectIn.close();
            lista_texto = (ArrayList<String>) obj.get(0);
            lista_hash = (ArrayList<String>) obj.get(1);
            listai_hash = (ArrayList<String>) obj.get(2);
            
        } catch (Exception e) {
        }

        String str;
        do {
            str = sc.nextLine();
            if (str.length() <= 0) {
                break;
            }
            lista_texto.add(str);
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(str.getBytes(), 0, str.length());
            lista_hash.add(new BigInteger(1, m.digest()).toString(16));
            StringBuilder input1 = new StringBuilder();
            input1.append(str);
            str = input1.reverse().toString();
            m.update(str.getBytes(), 0, str.length());
            listai_hash.add(new BigInteger(1, m.digest()).toString(16));
        } while (str.length() > 0);

        for (int i = 0; i < lista_texto.size(); i++) {
            System.out.print(lista_texto.get(i));
            System.out.print(" : ");
            System.out.print(lista_hash.get(i));
            System.out.print(" : ");
            System.out.print(listai_hash.get(i));
            System.out.println(" == ");
        }
        ArrayList<Object> objetos = new ArrayList<>();
        objetos.add(lista_texto);
        objetos.add(lista_hash);
        objetos.add(listai_hash);

        FileOutputStream fileOut = new FileOutputStream("save.obj");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(objetos);
        objectOut.close();

    }
}
