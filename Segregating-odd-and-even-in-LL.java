class Segregating-odd-and-even-in-LL{
    Node divide(int N, Node head){
        Node odd = new Node(-1), even = new Node(-1);
        
        Node oddHead = odd, evenHead = even, node = head;
        while (node != null) {
            if (node.data % 2 == 0) {
                even.next = new Node(node.data);
                even = even.next;
            } else {
                odd.next = new Node(node.data);
                odd = odd.next;
            }
            node = node.next;
        }
        even.next = oddHead.next;
        return evenHead.next;
    }
}
