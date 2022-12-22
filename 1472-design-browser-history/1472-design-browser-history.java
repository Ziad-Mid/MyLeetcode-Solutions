class BrowserHistory {

    int currentIndex ;
    ArrayList<String> history;
    
    public BrowserHistory(String homepage) {
        this.history = new ArrayList<>();
        this.currentIndex = 0;
        history.add(homepage);
    }
    
    public void visit(String url) {
        
        while(history.size()-1 > currentIndex){
            history.remove(history.size()-1);
        }
        
        history.add(url);
        currentIndex += 1; 
        
    }
    
    public String back(int steps) {
        System.out.println(currentIndex);
        if(steps < currentIndex)
        {
            currentIndex -= steps; 
            return history.get(currentIndex);
            
        }
        else{
            currentIndex = 0;
            return history.get(currentIndex);
        }
            
    
    }
    
    public String forward(int steps) {
        if(currentIndex + steps > history.size()-1 ){
            currentIndex = history.size()-1;
            return history.get(currentIndex);
        }
        else{
            currentIndex +=steps;
            return history.get(currentIndex);
        }
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */