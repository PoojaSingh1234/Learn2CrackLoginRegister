package com.learn2crack.utils;

import android.text.TextUtils;
import android.util.Patterns;

public class Validation {

    public static boolean validateName(String name){

        if (TextUtils.isEmpty(name)) {

            return false;

        } else {

            return true;
        }
    }

    public static boolean validateEmail(String email) {

        if (TextUtils.isEmpty(email) || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {

            return false;

        } else {

            return  true;
        }
    }

    public static boolean validatePhone(String phone) {

        if (TextUtils.isEmpty(phone) || !Patterns.PHONE.matcher(phone).matches()) {

            return false;

        } else {

            return true;
        }
    }

    public static boolean validatePassword(String password){

        if (TextUtils.isEmpty(password) || (password.length()<3)) {

            return false;

        } else {

            return true;
        }
    }



    public static boolean validateCity(String city){

        if (TextUtils.isEmpty(city)) {

            return false;

        } else {

            return true;
        }
    }

    public static boolean validateAdhar(String adhar) {

        if (TextUtils.isEmpty(adhar) || (adhar.length()<12) || (adhar.length()>12)) {

            return false;

        } else {

            return true;
        }
    }

}
