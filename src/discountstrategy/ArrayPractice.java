/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author mcendrowski
 */
public class ArrayPractice {
//private static String[] names = new String[0];

    public static void main(String[] args) {
//        String[] names = new String[0];
//        String[] names = {"Hello"};
//        String[] temp = new String[names.length + 1];
//        for (int i = 0; i < names.length; i++) {
//            temp[i] = names[i];
//        }
//        temp[temp.length - 1] = "Hello";
//        names = temp;
//        temp = null;
        
        String[] names = new String[0];
        
        for(int i=0;i<10;i++){
        String[] temp = new String[names.length+1];
        for (int index = 0; index < names.length; index++) {
            temp[index] = names[index];
        }
        temp[temp.length - 1] = "Hello";
        names = temp;
        temp = null;
        }
         
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        System.out.println(names.length);
    }
    
    public static void addName(String[] names,String name){
        String[] temp = new String[names.length+1];
        for (int i = 0; i < names.length; i++) {
            temp[i] = names[i];
        }
        temp[temp.length - 1] = name;
        names = temp;
        temp = null;
    }
    
}
