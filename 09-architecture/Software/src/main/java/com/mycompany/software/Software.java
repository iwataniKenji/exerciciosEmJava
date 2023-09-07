/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.software;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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

    private static String FILENAME = "save.obj";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 

        ArrayList<String> lista_texto = new ArrayList<>();
        ArrayList<String> lista_hash_md5 = new ArrayList<>();
        ArrayList<String> lista_invertida_hash_md5 = new ArrayList<>();

        try {
            // tenta abrir arquivo existente para carregar dados salvos anteriormente
            FileInputStream fileIn = new FileInputStream(FILENAME);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            ArrayList<Object> obj = (ArrayList<Object>) objectIn.readObject();
            objectIn.close();

            // carrega os dados do arquivo nas listas
            lista_texto = (ArrayList<String>) obj.get(0);
            lista_hash_md5 = (ArrayList<String>) obj.get(1);
            lista_invertida_hash_md5 = (ArrayList<String>) obj.get(2);
        } catch (Exception e) {
            // tratativa, caso não consiga abrir o arquivo
            // tratativa caso ocorra algum erro ao carregar os dados do arquivo
        }

        String str;

        System.out.print("Gerador de hash md5 e hash md5 invertido\n");
        System.out.print("Para sair da aplicação e listar os resultados, digite um texto vazio\n\n");

        do {
            System.out.print("Digite um texto: ");
            str = scanner.nextLine();

            if (str.length() <= 0) {
                break;
            }

            MessageDigest m = MessageDigest.getInstance("MD5");

            lista_texto.add(str);

            str = calculateHash(m, str);
            lista_hash_md5.add(str);

            str = reverseString(str);
            str = calculateHash(m, str);
            lista_invertida_hash_md5.add(str);
        } while (str.length() > 0);

        System.out.println();

        printLists(lista_texto, lista_hash_md5, lista_invertida_hash_md5);
        
        try {
            saveListsToFile(lista_texto, lista_hash_md5, lista_invertida_hash_md5);
        } catch (Exception e) {
            // tratativa caso ocorra algum erro ao salvar os dados em arquivo
        }
    }

    // gera o hash md5
    private static String calculateHash(MessageDigest m, String string) {
        m.update(string.getBytes(), 0, string.length());
        return new BigInteger(1, m.digest()).toString(16);
    }

    // inverte a string
    private static String reverseString(String str) {
        StringBuilder input = new StringBuilder();
        input.append(str);
        return input.reverse().toString();
    }

    // exibe os resultados para o usuário
    private static void printLists(ArrayList<String> lista_texto, ArrayList<String> lista_hash_md5, ArrayList<String> lista_invertida_hash_md5) {
        System.out.print("Texto inserido | Texto em hash MD5 | Texto invertido em hash MD5\n");

        for (int i = 0; i < lista_texto.size(); i++) {
            System.out.print(lista_texto.get(i));
            System.out.print(" | ");
            System.out.print(lista_hash_md5.get(i));
            System.out.print(" | ");
            System.out.print(lista_invertida_hash_md5.get(i));
            System.out.println();
        }
    }

    // salva os dados em arquivo
    private static void saveListsToFile(ArrayList<String> lista_texto, ArrayList<String> lista_hash_md5, ArrayList<String> lista_invertida_hash_md5) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(FILENAME);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        ArrayList<Object> objetos = new ArrayList<>();

        // prepara os dados para serem salvos em arquivo
        objetos.add(lista_texto);
        objetos.add(lista_hash_md5);
        objetos.add(lista_invertida_hash_md5);

        // salva os dados
        objectOut.writeObject(objetos);
        objectOut.close();
    }
}