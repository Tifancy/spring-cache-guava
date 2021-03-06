/*
 * Copyright 2013 the original author or authors.
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
package org.springmodules.samples.cache.guava.service;

import org.springmodules.samples.cache.guava.domain.Post;
import org.springmodules.samples.cache.guava.domain.User;

import java.util.Collection;

/**
 * @author Omar Irbouh
 * @since 1.0.0
 */
public interface SocialService {

	Collection<User> findAllUsers();

	User findUserByUserName(String userName);

	Collection<Post> findPostsByUserName(String userName);

	void createPost(Post post);

	void updatePost(Post post);

	void deletePost(String userName, int id);

}