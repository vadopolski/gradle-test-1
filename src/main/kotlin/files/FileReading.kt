package academy.learnprogramming.iokotlin

import java.io.File


fun main(args: Array<String>) {
// Java
//    new InputStreamReader(new FileInputStreamReader(new File("testfile.txt")), "UTF-8")

// Kotlin
    val reader = File("testfile.txt").reader()
    reader.forEachLine { println(it) }

}