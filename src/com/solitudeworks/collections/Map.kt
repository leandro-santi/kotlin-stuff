package com.solitudeworks.collections
// Pares de chave/valor (Dicionário)
// mapOf(): Imutável (read-only)
// mutableMapOf(): Mutável

const val POINTS_X_PASS: Int = 15 // CONSTANTE IMUTÁVEL

val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100) // Par de key -> value (1 -> 100)

val EZPassReport: Map<Int, Int> = EZPassAccounts // Cópia read-only

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach {
        (k, v) -> println("ID $k: credit $v")
    }
}

fun main() {

    accountsReport()

    println()

    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)

    println()

    accountsReport()

}