class TopVotedCandidate {
    private int[] times;
    private int[] leaders;

    public TopVotedCandidate(int[] persons, int[] times) {
        this.times = times;
        this.leaders = new int[persons.length];

        HashMap<Integer, Integer> map = new HashMap<>();

        int leader = -1;
        int maxVotes = 0;

        for (int i = 0; i < persons.length; i++) {
            int person = persons[i];

            map.put(person, map.getOrDefault(person, 0) + 1);

            if (map.get(person) >= maxVotes) {
                maxVotes = map.get(person);
                leader = person;
            }

            leaders[i] = leader;
        }
    }

    public int q(int t) {
        int left = 0;
        int right = times.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (times[mid] <= t) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return leaders[right];
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */