/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.authorandbooksln;

/**
 *
 * @author taqua
 */
public class AuthorAndBookSln {

    public static void main(String[] args) {
        Author anAuthor = new Author("Kim Lan", "kimlan@gmail.com", 'm'); 
        System.out.println(anAuthor);
        anAuthor.setEmail("kimlan@youtube.com");
        System.out.println(anAuthor);
        Book aBook = new Book("Lao Hac", anAuthor, 19.95, 1000);
        System.out.println(aBook);
        Book anotherBook = new Book("Lap trinh Java", new Author("Ta Minh Quang", "taquang0211@gmail.com", 'm'), 29.95, 888);
        System.out.println(anotherBook);
        System.out.println(anotherBook.getAuthor().getName());
        System.out.println(anotherBook.getAuthor().getEmail());
        System.out.println(anotherBook.getAuthorName() + " at " + anotherBook.getAuthorEmail());
        
    }
}
