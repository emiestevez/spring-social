/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taller.social;

import org.springframework.social.connect.Connection;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.web.context.request.NativeWebRequest;

/**
 *
 * @author Emiliano
 */
public class UserSignInAdapter implements SignInAdapter {

    public String signIn(String userId, Connection<?> connection, NativeWebRequest request) {
        return null;
    }
}
