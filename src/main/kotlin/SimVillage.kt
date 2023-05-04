fun main() {
    runSimulation()
}
fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
    println(greetingFunction("Guyal"))
}
fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2023
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}
fun printConstructionCost(numBuldings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuldings}")
}