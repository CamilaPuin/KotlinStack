fun main() {
    val stack = Stack<Double>()
    try{
        println(stack.peek())
    }
    catch (e : IllegalStateException){
        print("Lista vacía")
    }
    stack.push(10.7)
    stack.push(20.9)
    stack.push(30.5)
    println("DoubleStack: " + stack)
    println("Top: " + stack.peek())
    println("Popped: " + stack.pop())
    println("DoubleStack after pop: " + stack)
    println("Is empty: " + stack.isEmpty() + "\n")

    val stringStack = Stack<String>()
    stringStack.push("Hola")
    stringStack.push("Soy")
    stringStack.push("Pila")
    println("StringStack: " + stack)
    println("Top: " + stack.peek())
    println("Popped: " + stack.pop())
    println("StringStack after pop: " + stack + "\n")

    val bookStack = Stack<Book>()
    bookStack.push(Book("1984", "George Orwell", 1949))
    bookStack.push(Book("The Little Prince", "Antoine de Saint-Exupery", 1943))
    bookStack.push(Book("Clean Code", "Robert C. Martin", 2008))
    println("Books Stack" + bookStack)
    println("Top: " + bookStack.peek())
    println("Popped: " + bookStack.pop())
    println("BookStack after: " + bookStack + "\n")
}
