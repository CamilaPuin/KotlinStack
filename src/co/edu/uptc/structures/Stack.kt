class Stack<T> {
    private var top: Node<T>? = null
    fun push(value: T) {
        val newNode = Node(value)
        if (top == null) 
            top = newNode
         else {
            newNode.next = top
            top = newNode
        }
    }
    fun pop(): T? {
        if (isEmpty()) return null
        val poppedValue = top?.value
        top = top?.next
        return poppedValue
    }
    fun peek(): T {
        if (isEmpty()) 
            throw IllegalStateException("Stack is empty")
        return top!!.value
    }
    
    fun isEmpty(): Boolean = top == null

    override fun toString(): String {
        val values = mutableListOf<T>()
        var current = top
        while (current != null) {
            values.add(current.value)
            current = current.next
        }
        return values.joinToString(" ,")
    }
}
