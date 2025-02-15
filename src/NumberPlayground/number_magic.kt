package NumberPlayground

fun main() {
    // part 1
    println("Part 1");
    countUpwards(1, 10);

    // part 2
    println("\n\nPart 2");
    countDownwards(1, 10);

    // part 3
    println("\n\nPart 3");
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    println("[*] sum of 1 through 10: ${calculateSum(numbers)}");

    // part 4
    println("\nPart 4");
    checkEvenOdd(10);

    // part 5
    println("\nPart 5");
    val num = 5
    println("[*] $num! = ${calculateFactorial(num)}");

}

fun countUpwards(start: Int, end: Int) {
    print("[*] ");
    for (i in start..end) {
        if(i != 1) {
            print(", $i");
        } else {
            print(i);
        }
    }
}

fun countDownwards(start: Int, end: Int) {
    print("[*] ");
    for (i in end downTo start) {
        if(i != 10) {
            print(", $i");
        } else {
            print(i);
        }
    }
}


fun calculateSum(numbers: IntArray): Int {
    var sum: Int = 0;
    for(number in numbers) {
        var temp: Int = numbers[number-1];
        sum += temp;
    }
    return sum;
}

fun checkEvenOdd(number: Int) {
    for(i in 1..number) {
        if(i % 2 == 0) {
            println("even number: ${i}");
        } else {
            println("odd number: ${i}")
        }
    }
}

fun calculateFactorial(number: Int): Int {
    if(number == 1) {
        return 1;
    }
    return number * calculateFactorial(number-1);
}
