package academy.learnprogramming.binaryio

import java.io.FileInputStream
import java.io.DataInputStream
import java.io.EOFException


fun main(args: Array<String>) {

//    Java
//    try (fr: FileReader = new FileReader("testfile.bin");

    val di = DataInputStream(FileInputStream("testfile.bin"))
    var si: String

    try {
        while (true) {
            si = di.readUTF()
            println(si)
        }
    }
    catch (e: EOFException) {

    } finally {
        di.close()
    }



    FileInputStream("testfile.bin").use { fis ->
        throw Exception("Error") // Kotlin doesn't require a catch block

        DataInputStream(fis).use { di ->
            var si: String
            while (true) {
                si = di.readUTF()
                println(si)
            }

        }
    }

}