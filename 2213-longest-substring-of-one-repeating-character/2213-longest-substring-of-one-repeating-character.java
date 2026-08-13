class Solution {

    class Node {
        int len, pref, suff, best;
        char leftChar, rightChar;

        Node(int len, int pref, int suff, int best,
             char leftChar, char rightChar) {
            this.len = len;
            this.pref = pref;
            this.suff = suff;
            this.best = best;
            this.leftChar = leftChar;
            this.rightChar = rightChar;
        }
    }

    Node[] tree;
    char[] arr;

    public int[] longestRepeating(String s,
                                  String queryCharacters,
                                  int[] queryIndices) {

        int n = s.length();

        arr = s.toCharArray();
        tree = new Node[4 * n];

        build(1, 0, n - 1);

        int k = queryIndices.length;
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {

            int index = queryIndices[i];
            char ch = queryCharacters.charAt(i);

            arr[index] = ch;

            update(1, 0, n - 1, index);

            ans[i] = tree[1].best;
        }

        return ans;
    }

    void build(int node, int l, int r) {

        if (l == r) {
            tree[node] = new Node(
                1, 1, 1, 1,
                arr[l], arr[l]
            );
            return;
        }

        int mid = (l + r) / 2;

        build(node * 2, l, mid);
        build(node * 2 + 1, mid + 1, r);

        tree[node] = merge(tree[node * 2],
                           tree[node * 2 + 1]);
    }

    void update(int node, int l, int r, int index) {

        if (l == r) {
            tree[node] = new Node(
                1, 1, 1, 1,
                arr[l], arr[l]
            );
            return;
        }

        int mid = (l + r) / 2;

        if (index <= mid) {
            update(node * 2, l, mid, index);
        } else {
            update(node * 2 + 1, mid + 1, r, index);
        }

        tree[node] = merge(tree[node * 2],
                           tree[node * 2 + 1]);
    }

    Node merge(Node a, Node b) {

        int len = a.len + b.len;

        int pref = a.pref;
        int suff = b.suff;

        if (a.pref == a.len && a.rightChar == b.leftChar) {
            pref = a.len + b.pref;
        }

        if (b.suff == b.len && a.rightChar == b.leftChar) {
            suff = b.len + a.suff;
        }

        int best = Math.max(a.best, b.best);

        if (a.rightChar == b.leftChar) {
            best = Math.max(best, a.suff + b.pref);
        }

        return new Node(
            len,
            pref,
            suff,
            best,
            a.leftChar,
            b.rightChar
        );
    }
}