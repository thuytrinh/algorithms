package hackerrank.strongpassword

val numbers = "0123456789".mapTo(hashSetOf()) { it }
val lowercase = "abcdefghijklmnopqrstuvwxyz".mapTo(hashSetOf()) { it }
val uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".mapTo(hashSetOf()) { it }
val specials = "!@#$%^&*()-+".mapTo(hashSetOf()) { it }

/**
 * "Strong Password"
 *
 * https://www.hackerrank.com/contests/hourrank-24/challenges/strong-password
 */
fun main(args: Array<String>) {
  readLine()
  val password = readLine()!!

  fun String.isStrong(): Boolean {
    return this.length >= 6 && !this.any {
      !numbers.contains(it) ||
          !lowercase.contains(it) ||
          !uppercase.contains(it) ||
          !specials.contains(it)
    }
  }

  fun Boolean.toInt() = if (this) 1 else 0

  fun String.getStrongCharCount(): Int =
      setOf(numbers, lowercase, uppercase, specials)
          .map { x -> this.none { x.contains(it) } }
          .map { it.toInt() }
          .sum()

  when {
    password.isStrong() -> println(0)
    else -> println(Math.max(
        password.getStrongCharCount(),
        6 - password.length
    ))
  }
}
