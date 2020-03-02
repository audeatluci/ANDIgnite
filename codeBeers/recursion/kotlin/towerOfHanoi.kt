internal object GFG {
    // Java recursive function to solve tower of hanoi puzzle 
    fun towerOfHanoi(n: Int, from_rod: Char, to_rod: Char, aux_rod: Char) {
        if (n == 1) {
            println("Move disk 1 from rod $from_rod to rod $to_rod")
            return
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod)
        println("Move disk $n from rod $from_rod to rod $to_rod")
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod)
    }

    //  Driver method 
    @JvmStatic
    fun main(args: Array<String>) {
        val n = 4 // Number of disks 
        towerOfHanoi(n, 'A', 'C', 'B')  // A, B and C are names of rods 
    }
}