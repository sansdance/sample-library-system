/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplelibrarysystem;

/**
 *
 * @author Gelie
 */
public class Books extends Library{
    //data members
private String author;
private String publisher;
private int isbn;

//methods of the class books

public void setAuthorName(String temp){
author=temp;
}

public void setPublisherName(String temp){
publisher=temp;
}

public void setIsbnNumber(int temp){
isbn=temp;
}

public String getAuthorName(){
return author;
}

public String getPublisherName(){
return publisher;
}

public int getIsbnNumber(){
return isbn;
}

}

