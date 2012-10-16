/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taller.social;

import org.springframework.social.connect.Connection;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

/**
 *
 * @author Emiliano
 */
@Service
public class UserSignInAdapter implements SignInAdapter {
    
    public String signIn(String userId, Connection<?> connection, NativeWebRequest request) {
        
        System.out.println("El userId es " + userId);
        
        return null;
    }

}