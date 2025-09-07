class Stack<T> {

    private var top: Node<T>? = null

    fun push(value: T) {
        val newNode = Node(value)
        if (top == null) {
            top = newNode
        } else {
            newNode.next = top
            top = newNode
        }
    }

    fun peek(): T {
        if (isEmpty()) {
            throw IllegalStateException("Stack is empty")
        }
        return top!!.value
    }
}
