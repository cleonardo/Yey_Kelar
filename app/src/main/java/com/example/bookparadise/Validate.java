package com.example.bookparadise;

public class Validate {


    public boolean isNumber(String a){
        for (int i = 0; i < a.length(); i++){
            char b = a.charAt(i);
            if (!(b >= '0' && b<= '9')){
                return false;
            }
        }
        return true;
    }

    public boolean isAlphabet(String b){
        for (int i = 0; i < b.length(); i++){
            char a = b.charAt(i);
            if (!(a >= 'A' && a<= 'Z') && !(a >= 'a' && a<= 'z')){
                return false;
            }
        }
        return true;
    }

    public boolean count(String c, char character){
        int count = 0;
        for(int i=0; i < c.length(); i++) {
            if(c.charAt(i) == character) {
                count++;
            }

            if(count > 1) {
                return false;
            }
        }
        return true;
    }
}
