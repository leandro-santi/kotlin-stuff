fun describeString(maybeString: String?): String {              // 1
    if (maybeString != null && maybeString.length > 0) {        // 2
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"                           // 3
    }
}

fun main(args: Array<String>) {

    // NullSafety: Uma variável só pode ser nula se adicionarmos o ? no fim da mesma
    var neverNullString: String = "This can't be null"
    println(neverNullString)

    var nullString: String? = "This can be null"
    println(nullString)

    nullString = null
    println(nullString)

    var inferredNonNull = "The compiler assumes non-null"
    // inferredNonNull = null
    println(inferredNonNull)


    fun strLength(notNull: String): Int {
        return notNull.length
    }
    println(strLength(neverNullString))
    // println(strLength(nullString)) Cannot be called


    fun strLengthNull(canBeNull: String?): Int { // 1 - Int?, 2 - Int
        // return canBeNull?.length // 1
        return canBeNull?.length ?: 0 // 2
    }
    println(strLengthNull(neverNullString))
    println(strLengthNull(nullString))

    println(describeString(maybeString = "Hello there"))
    println(describeString(maybeString = ""))
    println(describeString(nullString))

}