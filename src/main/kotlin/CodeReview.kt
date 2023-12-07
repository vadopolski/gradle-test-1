class CodeReview {

    /**
     * Rules:
     * 1) Attach link from jira and jenkins
     * 2) Jira links in commit messages
     * 3) Attach link with test environment or integration test - ????
     * 4) Check readability of code: todo, naming of variables, functions, classes, packages, etc.
     * 5) Check code Patterns: CQS - Command Query Separation, SOLID, KISS, DRY, YAGNI, Decorator, etc.
     * 6) Check code style: formatting - Ctrl + Alt + L, imports - Ctrl + Alt + O, etc.
     * 7) Adding dependencies - check if it is necessary (for JSON parsing - Jackson, not nessessary to add Gson, Jsoniter, Circie, etc.)
     * 8) CHeck 300 rules of static code analysis from SonarQube
     * Commit => Git clone project => sonar qube => build => run test => jar => deploy

    CQS - Command Query Separation
    1) If a method returns a value, it should not have any side effects
    2) If a method changes the state of an object, it should return Unit
     * */
//    Correct
    fun getUserName(): String {
        return "John"
    }

    //    Incorrect
    var user = "John"

    fun checkUserName(): Boolean {
        if (user == "John") {
            user = "John Doe"  // Side effect
        }
        return true
    }

    //    Correct
    fun makeUpperCase(): Unit {
        user = user.toUpperCase()
    }


    //     Unused Variables
    fun exampleFunction() {
        val unusedVariable = "This is not used anywhere"
        println("Hello, World!")
    }

    //    Magic Numbers:
    fun calculateArea(radius: Double): Double {
        return 3.14 * radius * radius
    }

    //    Inefficient use of Data Types:
    fun inefficientUse(list: List<Int>): List<Int> {
        return list.filter { it % 2 == 0 }.toList()
    }

    //    Nullable Types without Null Safety Checks
    fun printLength(str: String?) {
        println("The length of the string is: ${str.length}")
    }

    //    Inappropriate Use of Visibility Modifiers:
    public var internalData = "Some internal data"


    //    Inefficient String Concatenation in Loops:
    fun concatenate(items: List<String>): String {
        var result = ""
        for (item in items) {
            result += item
        }
        return result
    }

    // Comparing Incompatible Types:
    fun compare(a: Int, b: Any) {
        if (a == b) {
            println("Equal")
        }
    }

    // Improper Exception Handling:
    fun riskyOperation() {
        try {
            // Some code that might throw an exception
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    //    Inappropriate use of lateinit:
    lateinit var data: String

    fun setup() {
        // Forgot to initialize 'data'
    }


//    Using '!!' Operator Unnecessarily:

    fun printNonNullString(str: String?) {
        println(str!!)
    }

    //  Hardcoding File Paths or URLs:
    fun readFile() {
        val filePath = "/home/user/documents/file.txt"
        // Read file logic
    }

    //    Inefficient Collection Processing
    fun findFirstEvenNumber(numbers: List<Int>): Int? {
        return numbers.filter { it % 2 == 0 }.firstOrNull()
    }


}