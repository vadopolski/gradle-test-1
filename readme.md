gradle tasks
2. gradle assemble - Assemble the outputs of this project.
3. gradle build - Assembles and tests this project. Compiling testing and packaging.
4. gradle jar (3) - Assembles a jar archive containing the main classes.
5. testClasses (2) - Assembles test classes.
6. gradle clean (0) - Deletes the build directory.
7. gradle classes (1) - Assembles main classes.

Difference between assemble and jar: assemble is a task that depends on jar. So when you run assemble, it will run jar as well. But jar can be run independently.


assemble
> Task :compileKotlin
> Task :compileJava NO-SOURCE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE
> Task :inspectClassesForKotlinIC
> Task :jar
> Task :assemble
> 
jar
> Task :compileKotlin UP-TO-DATE
> Task :compileJava NO-SOURCE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE
> Task :inspectClassesForKotlinIC UP-TO-DATE
> Task :jar UP-TO-DATE 