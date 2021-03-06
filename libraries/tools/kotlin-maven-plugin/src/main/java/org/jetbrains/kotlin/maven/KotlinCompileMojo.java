/*
 * Copyright 2010-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.maven;

import org.apache.maven.plugin.MojoExecutionException;
import org.jetbrains.jet.cli.jvm.K2JVMCompilerArguments;

/**
 * Compiles kotlin sources
 *
 * @goal compile
 * @phase compile
 * @requiresDependencyResolution compile
 * @noinspection UnusedDeclaration
 */
public class KotlinCompileMojo extends KotlinCompileMojoBase {
    @Override
    protected void configureCompilerArguments(K2JVMCompilerArguments arguments) throws MojoExecutionException {
        configureBaseCompilerArguments(getLog(), arguments, module, sources, classpath, output);
    }
}

