/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.taller.social;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.connect.UserProfile;

/**
 * Simple little {@link ConnectionSignUp} command that allocates new userIds in
 * memory. Doesn't bother storing a user record in any local database, since
 * this quickstart just stores the user id in a cookie.
 * 
 * @author Keith Donald
 */
public final class SimpleConnectionSignUp implements ConnectionSignUp {
	@Autowired
	@Qualifier(value = "listaDeUsuarios")
	private ArrayList<String> arrayList;

	public String execute(Connection<?> connection) {
		UserProfile userProfile = connection.fetchUserProfile();

		System.out.println("Tamaño de la lista: " + arrayList.size());

		if (arrayList.size() == 0) {
			arrayList.add(userProfile.getUsername());
			return null;
		}

		if (arrayList.contains(userProfile.getUsername())) {
			return userProfile.getUsername();
		} else {
			arrayList.add(userProfile.getUsername());
			return null;
		}

		// if (userProfile.getUsername().equals("epestevez")) {
		// return null;
		// }

	}
}
