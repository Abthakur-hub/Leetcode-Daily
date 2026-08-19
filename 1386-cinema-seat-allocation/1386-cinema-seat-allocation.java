class Solution {

    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        for (int[] seat : reservedSeats) {
            map.putIfAbsent(seat[0], new HashSet<>());
            map.get(seat[0]).add(seat[1]);
        }

        int count = (n - map.size()) * 2;

        for (int row : map.keySet()) {

            HashSet<Integer> reserved = map.get(row);

            boolean left = true;
            boolean middle = true;
            boolean right = true;

            for (int seat = 2; seat <= 5; seat++) {
                if (reserved.contains(seat))
                    left = false;
            }

            for (int seat = 4; seat <= 7; seat++) {
                if (reserved.contains(seat))
                    middle = false;
            }

            for (int seat = 6; seat <= 9; seat++) {
                if (reserved.contains(seat))
                    right = false;
            }

            if (left && right)
                count += 2;
            else if (left || middle || right)
                count++;
        }

        return count;
    }
}