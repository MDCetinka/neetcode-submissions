class DynamicArray {
    
    int[] arr;
    int size; //dolular
    int capacity;


    public DynamicArray(int capacity) {
        this.capacity = capacity; 
        //this diyince objeninki demek, parametreninki değil
        
        size =0;
        if(capacity > 0){
            arr = new int[capacity];
        }
        
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (capacity == size){
            resize();
    
        }
            arr[size ] = n;
            size++;
        

    }

    public int popback() {
        size--;
        return arr[size];
        
    }

    private void resize() {
        capacity = capacity *2;
        int[] bigArr = new int[capacity];
        for(int a = 0; a< size; a++){
            bigArr[a] = arr[a];
        }
        arr = bigArr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
