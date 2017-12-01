/*
 *  Copyright 2017 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 *  or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 */

package example.chat.util;

import java.util.HashMap;
import java.util.Map;

/**
 * The {@link MapBuilder} class builds a {@link Map} using the Builder Software Design Pattern.
 *
 * @author John Blum
 * @see java.util.Map
 * @since 1.0.0
 */
@SuppressWarnings("unused")
public class MapBuilder<KEY, VALUE> {

	public static <K, V> MapBuilder<K, V> create() {
		return new MapBuilder<>();
	}

	private final Map<KEY, VALUE> map = new HashMap<>();

	public MapBuilder<KEY, VALUE> put(KEY key, VALUE value) {
		this.map.put(key, value);
		return this;
	}

	public Map<KEY, VALUE> build() {
		return this.map;
	}
}