// Example of abstract class in Kotlin
abstract class Animal(val name: String) {
    abstract fun makeSound()
    fun eat() {
        println("$name is eating")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name is barking")
    }
}

class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name is meowing")
    }
}

fun main() {
    val dog = Dog("Fido")
    dog.makeSound()
    dog.eat()

    val cat = Cat("Whiskers")
    cat.makeSound()
    cat.eat()
}
