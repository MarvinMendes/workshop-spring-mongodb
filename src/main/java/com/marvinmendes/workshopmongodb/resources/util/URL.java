package com.marvinmendes.workshopmongodb.resources.util;

import com.marvinmendes.workshopmongodb.resources.exceptions.StandardError;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {

    public static String decodeParam(String text) {
        try{
            return URLDecoder.decode(text, "UTF-8");
        } catch (UnsupportedEncodingException exception) {
            return "";
        }
    }
}
