class RecentCounter {
    
    private int counter ;
    private Queue<Integer> queuePings = new LinkedList<Integer>();

    public RecentCounter() {
        this.counter = 0;
    }
    
    public int ping(int t) {
        queuePings.add(t);
        
        while(t - queuePings.peek() > 3000){
            queuePings.remove();
            
        }
      
        return queuePings.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */