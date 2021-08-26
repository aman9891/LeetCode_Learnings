package easy;

public class FirstBadVersion {

    // Approach1
    public int firstBadVersionApproach1(int n) {
        int left = 1, right = n, badVersion = 0;

        while(left <= right) {
            int mid = left + (right -left)/2;

            if(isBadVersion(mid)) {
                badVersion = mid;
                right = mid - 1;
            }
            else
                left = mid + 1;
        }
        return badVersion;
    }

    // Approach2
    public int firstBadVersionApproach2(int n) {
        int left = 1, right = n;

        while(left < right) {
            int mid = left + (right -left)/2;

            if(isBadVersion(mid))
                right = mid;
            else
                left = mid + 1;
        }
        return right;
    }

    public boolean isBadVersion(int num) {
        return true;
    }
}
