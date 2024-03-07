
package com.mycompany.books;
import java.util.Scanner;

public class LoanBooks {
    String title;
        String author;
        String gener;
        String datePub;
        boolean available;
        int quantity;
        int loadTime;
        String user;
        String loanDate;
        String returnDate;

    public LoanBooks(String title, String author, String gener, String datePub, boolean available, int quantity, int loadTime, String user, String loanDate, String returnDate) {
        this.title = title;
        this.author = author;
        this.gener = gener;
        this.datePub = datePub;
        this.available = available;
        this.quantity = quantity;
        this.loadTime = loadTime;
        this.user = user;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }
       
    public void lendBooks(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro");
        String name = read.nextLine();
        if (this.title.equalsIgnoreCase(name)) {
            if (this.quantity >= 1) {
                this.quantity--;
                if (this.quantity == 0) {
                    this.available = false;
                }
                System.out.println("Ingrese su nombre:");
                String user = read.nextLine();
                this.user = user;
                System.out.println("Libro prestado con éxito a " + this.user);
                System.out.println("Cantidad restante: " + this.quantity);
                System.out.println("Fecha de devolución: " + this.returnDate);
            } else {
                System.out.println("Cantidad insuficiente");
            }
        } else {
            System.out.println("Libro no encontrado");
        }
    }

    public void returnBooks(){
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese el nombre del libro que va a entregar");
        String name = read.nextLine();
        if(name.equalsIgnoreCase(this.title)){
            this.quantity++;
            this.available = true;
            System.out.println("Libro entregado con éxito");
            System.out.println("Cantidad actual: " + this.quantity);
        } else {
            System.out.println("Libro no encontrado");
        }
    }
}

