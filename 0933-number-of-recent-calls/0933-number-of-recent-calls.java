class RecentCounter {
    
    private int counter ;
    private Queue<Integer> queuePings = new LinkedList<Integer>();

    public RecentCounter() {
        this.counter = 0;
    }
    
    public int ping(int t) {
        queuePings.add(t);
        int firstElemQueue = queuePings.peek() ;
        
        
        while(t - firstElemQueue > 3000){
            queuePings.remove();
            firstElemQueue = queuePings.peek() ;
        }
      

        
        return queuePings.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */