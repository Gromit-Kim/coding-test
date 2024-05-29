package programmers;

public class L2_Solution_23 {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0)
            return cities.length * 5;

        String[] caches = new String[cacheSize];
        int answer = 0;
        int curSize = 0;
        for (String city : cities) {
            city = city.toLowerCase();
            if (check(city, caches, curSize)) {
                answer++;
            } else {
                answer += 5;
                if (curSize < cacheSize) {
                    caches[curSize++] = city;
                } else {
                    leftRotate(caches);
                    caches[cacheSize - 1] = city;
                }
            }
        }
        return answer;
    }

    private boolean check(String cur, String[] arr, int size) {
        for (int i = 0; i < size; i++) {
            if (cur.equals(arr[i])) {
                // Hit : 해당 항목을 가장 최근(마지막)으로 이동
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[size - 1] = cur;
                return true;
            }
        }
        return false;
    }

    private void leftRotate(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
    }
}
