/*
 * Copyright 2012-2019 the original author or authors.
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

package org.ylzl.eden.idempotent.spring.boot.autoconfigure;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.ylzl.eden.idempotent.aop.TimeToLiveIdempotentAspect;

/**
 * IdempotentAspect 注册器
 *
 * @author <a href="mailto:shiyindaxiaojie@gmail.com">gyl</a>
 * @since 2.4.13
 */
@Slf4j
public class TimeToLiveIdempotentAspectRegistrar implements ImportBeanDefinitionRegistrar {

	private static final String AUTOWIRED_IDEMPOTENT_TTL_ASPECT = "Autowired TimeToLiveIdempotentAspect";

	@Override
	public void registerBeanDefinitions(@NotNull AnnotationMetadata annotationMetadata,
										@NotNull BeanDefinitionRegistry beanDefinitionRegistry) {
		log.debug(AUTOWIRED_IDEMPOTENT_TTL_ASPECT);
		BeanDefinitionBuilder.rootBeanDefinition(TimeToLiveIdempotentAspect.class);
	}
}
