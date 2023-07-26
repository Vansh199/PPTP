public class Question7 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int[] remainingTickets = tickets.clone();
        int time = 0;

        while (true) {
            for (int i = 0; i < n; i++) {
                if (remainingTickets[i] > 0) {
                    int ticketsToBuy = Math.min(remainingTickets[i], 1);
                    remainingTickets[i] -= ticketsToBuy;
                    time += ticketsToBuy;

                    if (i == k && remainingTickets[i] == 0) {
                        return time;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
