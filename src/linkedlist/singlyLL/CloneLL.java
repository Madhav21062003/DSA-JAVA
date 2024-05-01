// Method 3
    Node copyList(Node head) {
        // your code here
        
        if (head == null) return null;

        // Create a map to store the mapping from original nodes to copied nodes
        Map<Node, Node> map = new HashMap<>();

        // Clone created of singly Linked List i.e. without random pointer
        Node headCopy = new Node(0);
        Node tailCopy = headCopy;
        Node temp = head;

        while (temp != null) {
            tailCopy.next = new Node(temp.data);
            map.put(temp, tailCopy.next);
            temp = temp.next;
            tailCopy = tailCopy.next;
        }

        headCopy = headCopy.next;

        // Assign random pointer to the clone LL
        tailCopy = headCopy;
        temp = head;

        // Insert them in orginal LL, merge dono
        Node curr1 = head;
        Node curr2 = headCopy;
        Node front1, front2;
        
        while(curr1 != null){
            front1 = curr1.next;
            front2 = curr2.next;
            curr1.next = curr2;
            curr2.next = front1;
            curr1 = front1;
            curr2 = front2;
        }
        
        // Assign random pointer to cloned linked liist
        curr1 = head;
        while(curr1 != null){
            curr2 = curr1.next;
            
            if(curr1.arb != null)
            curr2.arb = curr1.arb.next;
            
            curr1 = curr2.next;
        }
        
        // Break the linked list
        curr1 = head;
        while(curr1.next != null){
            front1 = curr1.next;
            curr1.next = front1.next;
            curr1 = front1;
        }
        
        return headCopy;
        
    }
    
    // Method 1
     Node copyList1(Node head) {
        // your code here
        
        Node headCopy = new Node(0);
        Node tailCopy = headCopy;
        Node temp = head;
        
        // Clone Created Without Random Pointer
        while(temp != null){
            tailCopy.next = new Node(temp.data);
            tailCopy = tailCopy.next;
            temp = temp.next;
        }
        
        tailCopy = headCopy;
        headCopy = headCopy.next;
         
         
        // Assign random pointer to the Clone LL
        tailCopy = headCopy;
        temp = head;
        
        while(temp != null){
            tailCopy.arb = find(head, headCopy, temp.arb);
            tailCopy = tailCopy.next;
            temp = temp.next;
        }
        
       
         
         return headCopy;
        
    }
    
    Node find(Node curr1, Node curr2, Node x){
        
        if(x == null)
        return null;
        
        while(curr1 != x){
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        
        return curr2;
    }
    
    
    // Method 2
     Node copyList2(Node head) {
        // your code here
        
        if (head == null) return null;

        // Create a map to store the mapping from original nodes to copied nodes
        Map<Node, Node> map = new HashMap<>();

        // Clone created of singly Linked List i.e. without random pointer
        Node headCopy = new Node(0);
        Node tailCopy = headCopy;
        Node temp = head;

        while (temp != null) {
            tailCopy.next = new Node(temp.data);
            map.put(temp, tailCopy.next);
            temp = temp.next;
            tailCopy = tailCopy.next;
        }

        headCopy = headCopy.next;

        // Assign random pointer to the clone LL
        tailCopy = headCopy;
        temp = head;

        while (temp != null) {
            tailCopy.arb = map.get(temp.arb);
            temp = temp.next;
            tailCopy = tailCopy.next;
        }

        return headCopy;
        
    }
