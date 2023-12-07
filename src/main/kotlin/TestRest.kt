import org.springframework.util.Assert
import kotlinx.cli.*


object TestRest {

    @JvmStatic
    fun main(args: Array<String>) {
        val parser = ArgParser("myprogram")

        val input by parser.option(ArgType.String, shortName = "i", description = "Input file").required()
        val stringFormat by parser.option(ArgType.Choice(listOf("html", "csv", "pdf"), { it }), shortName = "sf",
            description = "Format as string for output file").default("csv").multiple()

        var test = "test"

        try {

        } catch (e: Exception) {
            println(e.message)
        }

//        val verbose by parser.option(ArgType.Boolean, shortName = "v", description = "Enable verbose mode")
//        val name by parser.argument(ArgType.String, description = "Name of the user")


//      java -jar gradle-test-1-1.0-SNAPSHOT.jar 5430 10.0.0.1 postgres 123123123
//                                      ||
//      java -jar gradle-test-1-1.0-SNAPSHOT.jar -port 5430 --host 10.0.0.1 -user postgres --passw 123123123


        parser.parse(args)

//        if (verbose == true) {
//            println("Verbose mode enabled")
//        }
        println("Hello, $input!")
        println("Hello, $stringFormat!")



//        SpringUtils capitalize

        Assert.isTrue(true, "true is true")
    }
}