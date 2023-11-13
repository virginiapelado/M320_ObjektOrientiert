import java.util.ArrayList;

public class Stack implements Iterator {
    private ArrayList<Integer> stackData;
    private int currIndex;

    public Stack() {
        this.stackData = new ArrayList<>();
        this.currIndex = -1; // in beginning stack is empty
    }

    //adds element to the stack
    public void push(int element) {
        stackData.add(element);
        currIndex++;

    }

    //removes top element from the stack
    public int pop() {
        if (currIndex >= 0) {
            int poppedElement = stackData.get(currIndex);
            stackData.remove(currIndex);
            currIndex--;
            return poppedElement;
        } else {
            throw new IllegalStateException("ERROR");
        }
    }

    //TASK C: Implemented Methods
    @Override
    public boolean hasNext() {
        //currIndex is more or equal 0: true, else: false
        return currIndex >= 0;
    }

    //TASK B:
    @Override
    public int next() {
        //hasNext: true -> get the currIndex
        if(hasNext()){
            return stackData.get(currIndex);
        }
        else {
            throw new IllegalStateException("ERROR");
        }
    }

    @Override
    public int remove() {
        //currIndex >= 0: true -> remove the currIndex and decrements the index
        if(currIndex >= 0){
            int modStack = stackData.remove(currIndex);
            currIndex--;
            return modStack;
        }
        else {
            throw new IllegalStateException("ERROR");
        }
    }

    //Getter and Setters
    public ArrayList<Integer> getStackData() {
        return stackData;
    }

    public void setStackData(ArrayList<Integer> stackData) {
        this.stackData = stackData;
    }

    public int getCurrIndex() {
        return currIndex;
    }

    public void setCurrIndex(int currIndex) {
        this.currIndex = currIndex;
    }
}
