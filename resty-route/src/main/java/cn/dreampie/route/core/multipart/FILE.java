/*
 * Copyright 2010 Eduardo Yáñez Parareda
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.dreampie.route.core.multipart;

import java.lang.annotation.*;

/**
 *  上传文件时使用改方法 设置文件相关参数
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface FILE {
  String dir() default "";

  int max() default -1;//10 Meg

  String encoding() default "";

  String[] allows() default {}; //file content type eg. text/xml
}
