package binary_search.problems;

public class BookAllocation {
    public static void main(String[] args) {

    }

    public static int findPages(int[]arr,int N,int M)
    {
        // If Number of studtents are maximum and the books are not equal or greater
        // than number of students then book will not allocate to each  student
        if(M > N)
            return -1;

        int start = 0, end = 0, mid , ans = -1 ;

        // Assigning maxmum value of the array to start  and Sum of all array elements to end
        for(int i = 0; i< N; i++){
            start = Math.max(start, arr[i]);
            end = end + arr[i];
        }

        // Implementing binary Search
        while(start <= end){
            mid = start + (end - start) / 2 ;
            int pages = 0, count = 1;

            // Distributing pages to the student
            for(int i=0; i<N; i++){
                pages = pages + arr[i];

                // if pages greater than the mid then remaining pages are assigned to next student
                if(pages > mid){
                    count++;
                    // Giving remaining pages to another student
                    pages = arr[i];
                }
            }

            if(count <= M){
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
