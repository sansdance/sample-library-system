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
public class Magazines extends Library{
    private String edition;
private int issue_date;

public void setEdition(String temp){
edition=temp;
}

public void setIssueDate(int temp){
issue_date=temp;
}

public String getEdition(){
return edition;
}

public int getIssueDate(){
return issue_date;
}

}

