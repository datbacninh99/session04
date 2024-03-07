package BT3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo mảng gồm 100,000 phần tử
        int[] array = new int[100000];
        Random random = new Random();
        // Điền mảng với các số ngẫu nhiên
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }

        // Khởi tạo đối tượng StopWatch và bắt đầu đếm thời gian
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        // Sắp xếp mảng sử dụng thuật toán sắp xếp chọn
        selectionSort(array);

        // Dừng đếm thời gian
        stopWatch.end();
        // In thời gian thực thi của thuật toán sắp xếp chọn
        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn: " + stopWatch.getElapsedTime() + " ms");
    }

    // Thuật toán sắp xếp chọn
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) { // Duyệt qua từng phần tử của mảng
            int minIndex = i; // Gán chỉ số của phần tử nhỏ nhất ban đầu là i
            for (int j = i + 1; j < array.length; j++) { // Duyệt qua các phần tử còn lại trong mảng
                if (array[j] < array[minIndex]) { // Nếu phần tử tại vị trí j nhỏ hơn phần tử nhỏ nhất hiện tại
                    minIndex = j; // Cập nhật chỉ số của phần tử nhỏ nhất
                }
            }

            if (minIndex != i) { // Nếu phần tử nhỏ nhất không phải là phần tử hiện tại
                int temp = array[i]; // Hoán đổi phần tử nhỏ nhất với phần tử tại vị trí i
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}