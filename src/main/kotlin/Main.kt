/*Imagine we want to implement the City class which stores the name of the city and its population.
There are some restrictions. If the number is out of range, the population is corrected like this:
zero for negative values and 50 million for greater than 50_000_000.
Finish the implementation of the City class following this logic.
*/

class City(val name: String) {
    var population: Int = 0
        set(value) {
            field = if (value < 0) 0
            else if (value > 50000000) { 50000000 } else { value }

        }
}