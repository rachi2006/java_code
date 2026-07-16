class maximum {
    public static void main(String [] args){
        int [] arr = {5,8,6,4,2,3,8};
        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }

        }
        System.out.println("Maximum element in the array is: " + max);
    }
}