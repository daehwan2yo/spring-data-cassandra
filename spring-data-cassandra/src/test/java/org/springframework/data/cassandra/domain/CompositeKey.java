/*
 * Copyright 2016-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.cassandra.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

/**
 * @author Mark Paluch
 */
@PrimaryKeyClass
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompositeKey implements Serializable {

	@PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED, ordinal = 1, name = "first_name") private String firstname;
	@PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED, ordinal = 2) private String lastname;
}
