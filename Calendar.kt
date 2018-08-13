package Extensions

import java.util.*

fun main(args: Array<String>) {

    val months = arrayOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")

    val current_date = Date((2018-1900), 7, 2)
    val current_month = current_date.month + 1
    val current_month_text = months[current_month - 1]

    println()
    val c_year = current_date.year + 1900
    val date = Date(current_date.year, current_date.month, 1)

    val days = " Sun  Mon  Tue  Web  Thu  Fri  Sat "
    var count = 0


    print(current_month_text)
    for (t in 1..(days.length - current_month_text.length - c_year.toString().length)) {
        print(" ")
    }
    print(c_year)
    println()

    for (t in 1..days.length)
        print("-")
    println()
    println(days)
    for (t in 1..days.length)
        print("-")
    println()

    val endDate = when (current_month) {
        4, 6, 11, 9 -> 30
        2 -> if (current_date.year.isLeapYear()) 29 else 28
        else -> 31
    }

    for (i in 1..endDate) {
        if (i == 1) {
            for (k in 1..date.day) {
                print("     ")
                count++
            }
        }
        if (i < 10) {
            if (current_date.date == i) {
                print("  ($i)")
                count++
            } else {
                print("   $i ")
                count++
            }

        } else {
            if (current_date.date == i) {
                print(" ($i)")
                count++
            } else {
                print("  $i ")
                count++
            }
        }
        if (count % 7 == 0) {
            println()
        }

    }
    println()
    println()
}

private fun Int.isLeapYear(): Boolean {
    if ((this + 1990) % 4 == 0) {
        if ((this + 1990) % 100 == 0) {
            return (this + 1990) % 400 == 0
        }
        return true
    }
    return false
}
