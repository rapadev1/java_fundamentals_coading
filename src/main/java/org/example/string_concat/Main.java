package org.example.string_concat;

public class Main {
    public static void main(String[] args) {
        String pay = "Python 3.0";
        String tutorial = "Tutorial ";
        String myCompletString = "";
        int half = pay.length()/2 + 1;

        for (int i = 0; i< pay.length(); i++ ){
            if(i<half){
                myCompletString += String.valueOf(pay.charAt(i));
            }
            else if(i==half){
                myCompletString += " " + tutorial;
            }
            else{
                myCompletString += String.valueOf(pay.charAt(i));
            }


        }

        System.out.println(myCompletString);


    }

}
