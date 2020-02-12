package com.daniel.codingexercises.challenges.OneAway;

public class OneAway {
    public OneAway(){}

    public boolean isOneAway(String str1, String str2){
        if(Math.abs(str1.length()-str2.length()) > 1){
            return false;
        }
        int count = 0;
        if(str1.length() == str2.length()){
            for(int i=0; i<str1.length(); i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    count += 1;
                }
            }
        }
        if((Math.abs(str1.length() - str2.length()) > 0)){
            int size = 0;
            if(str1.length() > str2.length()){
                for(int j=0; j<str2.length(); j++){
                    if(str1.charAt(j) != str2.charAt(j)){
                        str1.replace(str1.charAt(j), ' ');
                        count += 1;
                    }
                }
            }else{
                for(int j=0; j<str1.length(); j++){
                    if(str1.charAt(j) != str2.charAt(j)){
                        str2 = str2.replace((Character.toString(str2.charAt(j))), "");
                        count += 1;
                    }
                }

            }

        }
        if(count <= 1){
            return true;
        }
        return false;
    }
}
