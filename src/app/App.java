package app;

import app.redt.Simple;

public class App {
    public static void main(String[] args) throws Exception {
        Simple obj = new Simple(); // Compile Time Error  
        obj.msg();                 // Compile Time Error
    }
}
