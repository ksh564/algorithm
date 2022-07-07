package exam.bfsdfs
import java.util.*

object BaekJoon1260 {
    lateinit var visited: BooleanArray
    lateinit var maps: Array<IntArray>
    var N = 0
    var M = 0
    var V = 0
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        N = scanner.nextInt()
        M = scanner.nextInt()
        V = scanner.nextInt()
        visited = BooleanArray(N + 1)
        maps = Array(N + 1) { IntArray(N + 1) }
        for (i in 1..M) {
            val start = scanner.nextInt()
            val arrived = scanner.nextInt()
            maps[start][arrived] = 1
            maps[arrived][start] = 1
        }

        dfs(V)
        println()
        visited = BooleanArray(N + 1)
        bfs(V)
    }

    private fun dfs(point: Int) {
        val stack: Stack<Int> = Stack<Int>()
        stack.push(point)
        while (!stack.isEmpty()) {
            val index = stack.pop() as Int
            if (visited[index]) continue
            visited[index] = true
            print("$index ")
            for (i in N downTo 1) {
                if (maps[index][i] == 1 && !visited[i]) {
                    stack.push(i)
                }
            }
        }
    }

    private fun bfs(point: Int) {
        val queue: Queue<Int> = LinkedList()
        queue.offer(point)
        while (!queue.isEmpty()) {
            val index = queue.poll()
            visited[index] = true
            print("$index ")
            for (i in 1..N) {
                if (maps[index][i] == 1 && !visited[i]) {
                    queue.offer(i)
                    visited[i] = true
                }
            }
        }
    }
}