package NumberPlayground

fun main() {
    // part 1
    println("Part 1");
    countUpwards(1, 10);

    // part 2
    println("\n\nPart 2");
    countDownwards(1, 10);
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

