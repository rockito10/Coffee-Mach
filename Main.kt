package machine

import kotlin.system.exitProcess

fun main() {

    val totwater = 400
    val totmilk = 540
    val totcoffee = 120
    val totcups = 9
    val totmoney = 550

    //menu(totwater, totmilk, totcoffee, totcups, totmoney)

    menufuera(totwater,totmilk,totcoffee,totcups,totmoney)

}

fun fillear1(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {
    println("Write how many ml of water you want to add:")
    var entra = cafecafe(readln().toString(), water, milk, coffee, cups, money, machstate = 2)
}
fun fillear2(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {
    println("Write how many ml of milk you want to add:")
    var entra2 = cafecafe(readln().toString(), water, milk, coffee, cups, money, machstate = 3)
}
fun fillear3(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {
    println("Write how many grams of coffee beans you want to add:")
    var entra3 = cafecafe(readln().toString(), water, milk, coffee, cups, money, machstate = 4)
}
fun fillear4(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {
    println("Write how many disposable cups you want to add:")
    var entra4 = cafecafe(readln().toString(), water, milk, coffee, cups, money, machstate = 5)
}

    //menu(totwater,totmilk,totcoffee,totcups,money)

class cafecafe (var cafinput: String, water: Int, milk: Int, coffee: Int, cups: Int, money: Int, var machstate: Int = 0) {


    fun menudentro(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {

        when (cafinput) {
            "buy" -> tiposcoffeefuera(water, milk, coffee, cups, money)
            "fill" -> fillear1(water, milk, coffee, cups, money)
            "take" -> takear(water, milk, coffee, cups, money)
            "remaining" -> rem(water, milk, coffee, cups, money)
            "exit" -> exitProcess(1)
        }
    }

    fun tiposcoffeedentro(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {
        when (cafinput) {
            "1" -> espresso(water, milk, coffee, cups, money)
            "2" -> latte(water, milk, coffee, cups, money)
            "3" -> cappuccino(water, milk, coffee, cups, money)
            "back" -> menufuera(water, milk, coffee, cups, money)
        }
    }
    init {
        if(machstate == 0) {
            menudentro(water, milk, coffee, cups, money)
        } else if (machstate == 1) {
            tiposcoffeedentro(water,milk,coffee,cups,money)
        } else if (machstate == 2) {
            fillear2(water + cafinput.toInt(), milk, coffee, cups, money)
        } else if (machstate == 3) {
            fillear3(water, milk + cafinput.toInt(), coffee, cups, money)
        } else if (machstate == 4) {
            fillear4(water, milk,coffee + cafinput.toInt(), cups, money)
        } else if (machstate == 5) {
            menufuera(water, milk,coffee, cups + cafinput.toInt(), money)
        }

    }

}

fun menufuera(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {

    println("")
    println("Write action (buy, fill, take, remaining, exit):" )

    var entra = cafecafe(readln().toString(),water,milk,coffee,cups,money, machstate = 0)

}
fun tiposcoffeefuera(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
    var entra = cafecafe(readln().toString(),water,milk,coffee,cups,money, machstate = 1)
}

fun espresso(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {

    if (water - 250 >= 0) {

    } else {
        println("Sorry, not enough water!")
        menufuera(water, milk, coffee, cups, money)
    }

    if (coffee - 16 >= 0) {

    } else {
        println("Sorry, not enough coffee!")
        menufuera(water, milk, coffee, cups, money)
    }

    if (cups - 1 >= 0 ) {

    } else {
        println("Sorry, not enough cups!")
        menufuera(water, milk, coffee, cups, money)
    }

    println("I have enough resources, making you a coffee!")
    val totwater = water - 250
    val totmilk = milk - 0
    val totcoffee = coffee - 16
    val totcups = cups - 1
    val totmoney = money + 4

    /*println("The coffee machine has:")
    // println(" ml of water")
    print(water - 250)
    print(" ml of water")
    println("")
    //println("Write how many ml of milk the coffee machine has:")
    print(milk - 0)
    print(" ml of milk")
    println("")
    // println("Write how many grams of coffee beans the coffee machine has:")
    print(coffee - 16)
    print(" g of coffee beans")
    println("")
    // println("Write how many cups of coffee you will need:")
    print(cups - 1)
    print(" disposable cups")
    println("")
    print('$')
    print(money + 4)
    print(" of money")
     */

  menufuera(totwater,totmilk,totcoffee,totcups,totmoney)
}

fun latte(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {


    if (water - 350 >= 0) {

    } else {
        println("Sorry, not enough water!")
     //   menu(water, milk, coffee, cups, money)
        menufuera(water, milk, coffee, cups, money)
    }

    if (milk - 75 >= 0) {

    } else {
        println("Sorry, not enough milk!")
     //   menu(water, milk, coffee, cups, money)
        menufuera(water, milk, coffee, cups, money)
    }

    if (coffee - 20 >= 0) {

    } else {
        println("Sorry, not enough coffee!")
      //  menu(water, milk, coffee, cups, money)
        menufuera(water, milk, coffee, cups, money)
    }

    if (cups - 1 >= 0 ) {

    } else {
        println("Sorry, not enough cups!")
       // menu(water, milk, coffee, cups, money)
        menufuera(water, milk, coffee, cups, money)
    }

    println("I have enough resources, making you a coffee!")
    val totwater = water - 350
    val totmilk = milk - 75
    val totcoffee = coffee - 20
    val totcups = cups - 1
    val totmoney = money + 7

   /*
    println("The coffee machine has:")
    // println(" ml of water")
    print(water - 350)
    print(" ml of water")
    println("")
    //println("Write how many ml of milk the coffee machine has:")
    print(milk - 75)
    print(" ml of milk")
    println("")
    // println("Write how many grams of coffee beans the coffee machine has:")
    print(coffee - 20)
    print(" g of coffee beans")
    println("")
    // println("Write how many cups of coffee you will need:")
    print(cups - 1)
    print(" disposable cups")
    println("")
    print('$')
    print(money + 7)
    print(" of money")
    */

   menufuera(totwater,totmilk,totcoffee,totcups,totmoney)
}

fun cappuccino(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {

    if (water - 200 >= 0) {

    } else {
        println("Sorry, not enough water!")
        menufuera(water, milk, coffee, cups, money)
    }

    if (milk - 100 >= 0) {

    } else {
        println("Sorry, not enough milk!")
        menufuera(water, milk, coffee, cups, money)
    }

    if (coffee - 12 >= 0) {

    } else {
        println("Sorry, not enough coffee!")
        menufuera(water, milk, coffee, cups, money)
    }

    if (cups - 1 >= 0 ) {

    } else {
        println("Sorry, not enough cups!")
        menufuera(water, milk, coffee, cups, money)
    }

    println("I have enough resources, making you a coffee!")
    val totwater = water - 200
    val totmilk = milk - 100
    val totcoffee = coffee - 12
    val totcups = cups - 1
    val totmoney = money + 6


    /*
    println("The coffee machine has:")
    // println(" ml of water")
    print(water - 200)
    print(" ml of water")
    println("")
    //println("Write how many ml of milk the coffee machine has:")
    print(milk - 100)
    print(" ml of milk")
    println("")
    // println("Write how many grams of coffee beans the coffee machine has:")
    print(coffee - 12)
    print(" g of coffee beans")
    println("")
    // println("Write how many cups of coffee you will need:")
    print(cups - 1)
    print(" disposable cups")
    println("")
    print('$')
    print(money + 6)
    print(" of money")
     */

    menufuera(totwater,totmilk,totcoffee,totcups,totmoney)
}
/*
fun fillear(water: Int, milk: Int, coffee: Int, cups: Int, money: Int){
    println("Write how many ml of water you want to add:")
    val totwater = water + readln().toInt()
    println("Write how many ml of milk you want to add:")
    val totmilk = milk + readln().toInt()
    println("Write how many grams of coffee beans you want to add:")
    val totcoffee = coffee + readln().toInt()
    println("Write how many disposable cups you want to add:")
    val totcups = cups + readln().toInt()

    //menu(totwater,totmilk,totcoffee,totcups,money)
}

 */

fun takear(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {
    println("I gave you $${money}")
    val totmoney = 0

    /*
    println("")
    println("The coffee machine has:")
    // println(" ml of water")
    print(water)
    print(" ml of water")
    println("")
    //println("Write how many ml of milk the coffee machine has:")
    print(milk)
    print(" ml of milk")
    println("")
    // println("Write how many grams of coffee beans the coffee machine has:")
    print(coffee)
    print(" g of coffee beans")
    println("")
    // println("Write how many cups of coffee you will need:")
    print(cups)
    print(" disposable cups")
    println("")
    print('$')
    print(totmoney)
    print(" of money")
    */

    menufuera(water,milk,coffee,cups,totmoney)
}

fun rem(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {
    println("The coffee machine has:")
    print(water)
    print(" ml of water")
    println("")
    print(milk)
    print(" ml of milk")
    println("")
    print(coffee)
    print(" g of coffee beans")
    println("")
    print(cups)
    print(" disposable cups")
    println("")
    print('$')
    print(money)
    print(" of money")
    println("")

    menufuera(water,milk,coffee,cups,money)
}
/*
fun menu(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {

    println("")
    println("Write action (buy, fill, take, remaining, exit):" )

    when (readln().toString()) {
        "buy" -> tiposcoffee(water, milk, coffee, cups, money)
        "fill" -> fillear(water, milk, coffee, cups, money)
        "take" -> takear(water, milk, coffee, cups, money)
        "remaining" -> rem(water, milk, coffee, cups, money)
        "exit" -> exitProcess(1)
    }
}
*/

/*
fun main() {



    val totwater = 400
    val totmilk = 540
    val totcoffee = 120
    val totcups = 9
    val totmoney = 550

    //menu(totwater, totmilk, totcoffee, totcups, totmoney)

    println("")
    println("Write action (buy, fill, take, remaining, exit):" )

    var entra = cafecafe(readln().toString(),totwater,totmilk,totcoffee,totcups,totmoney)

}
 */


    /*println("Write action (buy, fill, take, remaining, exit):" )

    when (readln().toString()) {
        "buy" -> tiposcoffee(totwater, totmilk, totcoffee, totcups, totmoney)
        "fill" -> fillear(totwater, totmilk, totcoffee, totcups, totmoney)
        "take" -> takear(totwater, totmilk, totcoffee, totcups, totmoney)
        "remaining" -> rem(totwater, totmilk, totcoffee, totcups, totmoney)
        "exit" -> ""
    }

     */

    /*println("The coffee machine has:")
    // println(" ml of water")
    val totwater = 400
    print(totwater)
    print(" ml of water")
    println("")
    //println("Write how many ml of milk the coffee machine has:")
    val totmilk = 540
    print(totmilk)
    print(" ml of milk")
    println("")
    // println("Write how many grams of coffee beans the coffee machine has:")
    val totcoffee = 120
    print(totcoffee)
    print(" g of coffee beans")
    println("")
    // println("Write how many cups of coffee you will need:")
    val totcups = 9
    print(totcups)
    print(" disposable cups")
    println("")
    val totmoney = 550
    print('$')
    print(totmoney)
    print(" of money")

    println("")

    println("Write action (buy, fill, take):")
    */
    /*
    val command = readln().toString()

    when (command) {
        "buy" -> tiposcoffee(totwater, totmilk, totcoffee, totcups, totmoney)
        "fill" -> fillear(totwater, totmilk, totcoffee, totcups, totmoney)
        "take" -> takear(totwater, totmilk, totcoffee, totcups, totmoney)
    }
    */

    //val rqcups = readln().toInt()

    /*println("Starting to make a coffee")
    println("Grinding coffee beans")
    println("Boiling water")
    println("Mixing boiled water with crushed coffee beans")
    println("Pouring coffee into the cup")
    println("Pouring some milk into the cup")
    println("Coffee is ready!")
    */
    


/*
    val water : Int = rqcups * 200
    val milk : Int = rqcups * 50
    val coffee : Int = rqcups * 15

    print(milk)
    print(" ml of milk")
    println("")
    print(water)
    print(" ml of water")
    println("")
    print(coffee)
    print(" g of coffee beans")

    val rewater = totwater / 200
    val remilk = totmilk / 50
    val recoffee = totcoffee / 15
    
    //puede que falte <=
    
    /*val recupsmax =
    if (rewater < remilk && rewater < recoffee) {
    rewater
    } else if (remilk < rewater && remilk < recoffee) {
    remilk
    } else {
    recoffee
    }
 */

    val recupstot = recupsmax - rqcups
    
    println(
        if (totwater == water && totmilk == milk && totcoffee == coffee) {
            "Yes, I can make that amount of coffee" 
        } else if ( totwater >= water && totmilk >= milk && totcoffee >= coffee ) {
            "Yes, I can make that amount of coffee (and even $recupstot more than that)"
        } else {
            "No, I can make only $recupsmax cups of coffee"
        }
    )
*/


