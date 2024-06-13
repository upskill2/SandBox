package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;

public class Job_1 {

    class UserStats {
        private Optional<Long> visitCount;

        public Optional<Long> getVisitCount() {
            return visitCount;
        }

        public void setVisitCount(Optional<Long> visitCount) {
            this.visitCount = visitCount;
        }
    }
}


class VisitCounter {


    Map<Long, Long> count(Map<String, Job_1.UserStats>... visits) {
        if(visits==null){
            return new HashMap<Long,Long>();
        }
        Map<Long, Long> result = new HashMap<>();
        for (Map<String, Job_1.UserStats> visit : visits) {
            if(visit==null || visit.isEmpty()){
                break;
            }
            for (Map.Entry<String, Job_1.UserStats> entry : visit.entrySet()) {
                if (entry.getValue() == null) {
                    break;
                }
                long userId = -1L;
                long userStats = -1L;
                try {
                    userId = Long.parseLong(entry.getKey());
                    userStats = entry.getValue().getVisitCount().isPresent()
                            ? entry.getValue().getVisitCount().get() : -1L;
                } catch (Exception e) {
                    System.out.println("cant cast userId to Long, skipping the record");
                }
                if (userId != -1 && userStats != -1) {
                    if (result.containsKey(userId)) {
                        result.put(userId, result.get(userId) + userStats==-1?0:userStats);
                    } else {
                        result.put(userId, userStats);
                    }
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {

    }

}
