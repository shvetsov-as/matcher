/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchertest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class MatcherTest {

    boolean b = false;
    boolean b2 = false;
    
    
    Pattern patternName = Pattern.compile("^[a-zA-Zа-яёА-ЯЁ]+$");
    Pattern patternMail = Pattern.compile("\\A[^@]+@([^@\\.]+\\.)+[^@\\.]+\\z");
    
    
    
    
    
    

    public boolean nameCheck(String userName) {
        if (userName.trim() != null & userName.trim().length() <= 30 & userName.trim().length() >= 1) {
            Matcher matcher = patternName.matcher(userName);
            return matcher.find();
        } else {
            return false;
        }
    }

    public boolean emailCheck(String emailAddr) {
        if (emailAddr.trim() != null & emailAddr.trim().length() <= 50 & emailAddr.trim().length() >= 6) {
            Matcher matcher = patternMail.matcher(emailAddr);
            return matcher.find();
        } else {
            return false;
        }
    }

    
    public static void main(String[] args) {
        
        MatcherTest test = new MatcherTest();
        
        
        
        test.b = test.nameCheck("");
        test.b2 = test.emailCheck("a@s.td");
        
        
        
        System.out.println("nameCheck " + test.b);
        System.out.println("emailCheck " + test.b2);
        
    }
    
    
    
}
