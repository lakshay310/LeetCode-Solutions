class Solution {
    public String predictPartyVictory(String senate) {
        char[] arr = senate.toCharArray();
        int n = arr.length;
        boolean[] banned = new boolean[n];
        while (true) {
            for (int i = 0; i < n; i++) {
                if (banned[i]) continue;
                char target = (arr[i] == 'R') ? 'D' : 'R';
                boolean opponentBanned = false;
                for (int j = i + 1; j < n; j++) {
                    if (!banned[j] && arr[j] == target) {
                        banned[j] = true;
                        opponentBanned = true;
                        break;
                    }
                }
                if (!opponentBanned) {
                    for (int j = 0; j < i; j++) {
                        if (!banned[j] && arr[j] == target) {
                            banned[j] = true;
                            opponentBanned = true;
                            break;
                        }
                    }
                }
                if (!opponentBanned) {
                    return arr[i] == 'R' ? "Radiant" : "Dire";
                }
            }
        }
    }
}