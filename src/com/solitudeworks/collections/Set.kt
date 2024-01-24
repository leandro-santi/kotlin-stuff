package com.solitudeworks.collections
// Set é uma estrutura não ordenada que não aceita elementos duplicados
// setOf(): Imutável (read-only)
// mutableSetOf(): Mutável

val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

val closedIssues: Set<String> = openIssues // Cópia read-only

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."
}

fun returnClosedIssues(): Set<String> {
    return closedIssues
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")

    println()

    returnClosedIssues().forEach{
            i -> println("Issues: $i")
    }
}