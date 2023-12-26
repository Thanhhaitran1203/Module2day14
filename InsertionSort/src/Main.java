public class Main {
    public static void main(String[] args) {
        int[] list = {2,5,1,9,6,7,4};
        System.out.println("---------");
        insertionSort(list);

    }
    public static void insertionSort(int[] list){
        int  pos,x;
        for (int i = 1; i < list.length; i++) {
            x = list[i]
            System.out.println("xét phần tử " + x);
            pos = i;
            while (pos > 0 && x < list[pos - 1]){
                list[pos] = list[pos - 1];
                pos--;
                System.out.println("tịnh tiến phần tử "+list[pos]+" lên 1");
            }
            list[pos] = x;
            System.out.println("chèn " + x + " vào vị trí thích hợp");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + " ");
            }
            System.out.println("");
        }
    }
}