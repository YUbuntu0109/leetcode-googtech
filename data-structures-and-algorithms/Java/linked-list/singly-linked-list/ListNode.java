/**
 * 声明单向链表
 * @param <E>
 */
class SinglyListNode<E> {

	private E data;
	private SinglyListNode<E> next;

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public SinglyListNode<E> getNext() {
		return next;
	}

	public void setNext(SinglyListNode<E> next) {
		this.next = next;
	}
}


/**
 * 操作单向链表
 * @param <T>
 */
class SinglyLinkedList<T> {

	SinglyListNode<T> headNode;

    /**
     * 初始化单向链表
     */
	public void createLinkedList() {
		headNode = new SinglyListNode<T>();
		// headNode.setData(0); // 单向链表的头节点默认值为零
	}

    /**
     * 获取单向链表的头节点
     * @return headNode.getData()
     */
	public T getHeaderNode() {
		return headNode.getData();
	}

    /**
     * 获取单向链表的长度
     * @return length
     */
	public int getListLength(/* ListNode headNode */) {
		int length = 0;
		SinglyListNode<T> currentNode = headNode;
		while (currentNode != null) {
			currentNode = currentNode.getNext();
			length++;
		}
		return length;
	}

    /**
     * 向单向链表中插入新节点
     * @param nodeToInsert
     * @param position
     * @return headNode
     */
	public SinglyListNode<T> insertInLinked(SinglyListNode<T> nodeToInsert, int position) {

		if (headNode == null) {
			System.err.println("Error: the linked list is empty !");
			return nodeToInsert;
		}
		int size = getListLength();
		if (position > size + 1 || position < 1) {
			System.err.println("Position of node to insert is invalid. The vaild inputs are 1 to " + (size + 1));
			return headNode;
        }
        // 插入头节点
		if (position == 1) {
			nodeToInsert.setNext(headNode);
			headNode = nodeToInsert;
            return nodeToInsert;
        // 插入中间或尾节点
		} else {

			int count = 1;
			SinglyListNode<T> previousNode = headNode;
			while (count < position - 1) {
				previousNode = previousNode.getNext();// 待插节点的前节点
				count++;
			}

			SinglyListNode<T> currentNode = previousNode.getNext();// 待插节点的后节点
			nodeToInsert.setNext(currentNode);
			previousNode.setNext(nodeToInsert);
		}
		return headNode;
	}

    /**
     * 删除单向链表中的节点
     * @param position
     * @return boolean
     */
	public boolean deleteNodeFromLinkedList(/* ListNode headNode, */ int position) {

		int size = getListLength();
		if (position > size || position < 1) {
			System.err.println("Position of node to insert is invalid. The vaild inputs are 1 to" + (size + 1));
			return false;
        }
        // 删除头节点
		if (position == 1) {
			SinglyListNode<T> currentNode = headNode.getNext();
			headNode = currentNode;
            return true;
        // 删除中间或尾结点
		} else {
			int count = 1;
			SinglyListNode<T> previousNode = headNode.getNext();
			while (count < position) {
				previousNode = previousNode.getNext(); // 找到待删节点的前节点
				count++;
			}

			SinglyListNode<T> currentNode = previousNode.getNext(); // 待删节点
			previousNode.setNext(currentNode.getNext());
			currentNode = null;
		}
		return true;
	}

    /**
     * 遍历删除单向链表中的所有节点
     * @return boolean
     */
	public boolean destroyLinkedList(/* ListNode headNode */) {

		if (headNode == null) {
			System.err.println("异常 : 单向链表为空 !");
			return false;
		}
		System.out.print("遍历删除单向链表中的所有节点 : ");
		while (headNode != null) {
			System.out.print(headNode.getData() + " , ");
			headNode = headNode.getNext();
		}
		System.out.println();
		return true;
	}

    /**
     * 遍历输出单向链表中的所有节点
     * @return boolean
     */
	public boolean traverseNode( /* ListNode headNode */) {

		if (headNode == null) {
			System.err.println("异常 : 单向链表为空 !");
			return false;
		}
		SinglyListNode<T> currentNode = headNode;
		System.out.print("遍历输出单向链表中的所有节点 : ");
		while (currentNode != null) {
			System.out.print(currentNode.getData() + " , ");
			currentNode = currentNode.getNext();
		}
		System.out.println();
		return true;
	}

    /**
     * 测试
     * @param args
     */
	public static void main(String[] args) {

		SinglyLinkedList<String> list = new SinglyLinkedList<String>();

		// 初始化待插入链表的节点
		SinglyListNode<String> a = new SinglyListNode<String>();
		a.setData("A");
		SinglyListNode<String> b = new SinglyListNode<String>();
		b.setData("B");
		SinglyListNode<String> c = new SinglyListNode<String>();
		c.setData("C");

		// 向单向链表中添加新的节点
		list.createLinkedList();
		list.insertInLinked(a, 1);
		list.insertInLinked(b, 2);
		list.insertInLinked(c, 1);

		System.out.println("单向链表的长度为 : " + list.getListLength());
        System.out.println("单向链表的头节点为 : " + list.getHeaderNode());
		list.traverseNode(); //遍历输出单向链表中的所有节点
		System.out.println("删除单向链表中的第一个节点 : " + list.deleteNodeFromLinkedList(1));
		list.traverseNode();
		System.out.println("删除单向链表中的所有节点 : " + list.destroyLinkedList());
		System.out.println("单向链表的长度为 : " + list.getListLength());
		list.traverseNode(); //遍历输出单向链表中的所有节点

	}
}
