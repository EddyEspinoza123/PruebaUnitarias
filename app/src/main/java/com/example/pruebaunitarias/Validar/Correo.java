package com.example.pruebaunitarias.Validar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Correo {
//    correo
    public static boolean correo(String textField){
        Pattern pattern = Pattern.compile("/[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}/g", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(textField);

        return textField.isEmpty() || matcher.find();
    }
   // usuario
    public static boolean CamposSinLLenar(String usuario){
        if(usuario.length()>0){
            return false;
        }else {
            return true;
        }
    }
}
