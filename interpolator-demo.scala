/* No interpolator */

val color = "White"
val price = 10.23

print("The price for the " + color + " poster is " + price)

/* String interpolator */
println(s"The price for the $color poster is $price")

/* String interpolator with object properties */
class poster(val width: Int, val height: Int, val color: String, val price: Double)
val p = new Poster(width = 8, height = 11, color = "blue", price = 99.99)

println(s"$p.price")                        /* This will print <object>.price */
println(s"The price is ${p.price}")         /* This will print the value of price */
println(s"The price of ${p.width}x${p.height} ${p.color} poster is ${p.price}")

/* Raw interpolator */
println("I treat escape literals (\\ \\ \\ -> print 3) differently")
println(raw"I DO NOT treat escape literals (\\ \\ \\ -> print 6) differently")

/* f-string interpolator -- Java style*/
println(math.E)
println(f"${math.E}%.5f")
