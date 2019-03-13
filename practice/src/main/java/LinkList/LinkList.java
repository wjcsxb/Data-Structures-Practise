package LinkList;

/**
 * The type Link list.
 * 单链表的创建 插入 删除
 */
public class LinkList {

    public Node first;
    private int index = 0;

    public LinkList() {
        this.first = null;
    }

    /*
    * 带头指针
    * */
    public LinkList(int data){
        Node headNode = new Node(data);
        headNode.next = first;
        this.first = headNode;
    }
    /*
    * 插入一个头结点
    * */
    public void addFirstNode(int data){
        Node node = new Node(data);
        node.next = first;
        first = node;
    }
    /*
    * 删除一个头结点,并返回当前头结点
    * */
    public Node deleteFirstNode(){
        Node deleteNode = first;
        first = deleteNode.next;
        return deleteNode;
    }
    /*
     * 插入一个头结点(带头指针)
     * */
    public void addFirstNodeWithHeadNode(int data){
        Node node = new Node(data);
        node.next = first.next;
        first.next = node;
    }

    /*
    * 显示所有节点信息
    * */
    public void displayAllNodes(){
        Node currentNode = first;
        while (currentNode != null) {
            currentNode.display();
            currentNode = currentNode.next;
        }

    }
    public static void main(String[] args){
//        LinkList linkList = new LinkList();
        LinkList linkList = new LinkList(0);
//        linkList.addFirstNode(20);
        linkList.addFirstNodeWithHeadNode(20);
        linkList.addFirstNodeWithHeadNode(21);
//        linkList.addFirstNode(21);
        linkList.displayAllNodes();
    }
}
