package net.println.kotlin.高级函数

// 尾递归
// 递归的一种特殊形式
// 调用自身之后无其他操作
// tailrec 修饰的尾递归函数，是提示编译器尾递归优化

data class ListNode(val value:Int,var next:ListNode?=null)

// 这就是 尾递归
// 只是调用本身，不做其他操作
// 对于尾递归优化 就是在方法前加一个tailrec(这个只能加在真正的尾递归的方法前，才能起作用)
// 加过tailrec修饰的尾递归方法，就可以将这方法中的代码秉成了迭代
tailrec fun findListNode(head: ListNode?,value: Int): ListNode?{
    head?:return null
    if (head.value == value) return head
    return findListNode(head.next,value)
}

// 这不是尾递归
// 这最后调用了自己 还调用了一个乘法运算
fun factorial(long: Long):Long{
    return long * factorial(long-1)
}

data class TreeNode(val value: Int){
    var left: TreeNode? = null
    var right: TreeNode? = null
}
// 这也不是尾递归
// 最后多次调用自己本身
fun findTreeNode(root: TreeNode?,value: Int):TreeNode?{
    root?:return null
    if (root.value == value) return root
    return findTreeNode(root.left,value) ?: return findTreeNode(root.right,value)
}


fun main(args: Array<String>) {
    val MAX_NODE_COUNT = 100000
    val head = ListNode(0)
    var p = head
    for (i in 1..MAX_NODE_COUNT){
        p.next = ListNode(i)
        p = p.next!!
    }
    println(findListNode(head,MAX_NODE_COUNT-3)?.value)
    //findListNode 函数前的 tailrec 修饰去掉，就能对比出 尾递归优化 的一个效果

}