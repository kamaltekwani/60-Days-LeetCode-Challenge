/*
 * Problem Link : https://leetcode.com/problems/course-schedule/
 * Solution Link : https://leetcode.com/problems/course-schedule/solutions/58775/my-java-bfs-solution/
 *
 * Time Complexity : O(V + E)
 * Space Complexity : O(V)
 */

class Q207_Course_Schedule
{
    public boolean canFinish(int numCourses, int[][] prerequisites) 
    {
        List<List<Integer>> adjacency_list = new ArrayList<List<Integer>>();

        for(int index=0 ; index<numCourses ; index++)
            adjacency_list.add(new ArrayList<Integer>());

        for(int prerequisite[] :  prerequisites)
            adjacency_list.get(prerequisite[1]).add(prerequisite[0]);

        int inDegree[] = new int[numCourses];
        Queue<Integer> queue = new LinkedList<Integer>();

        for(int index=0 ; index<numCourses ; index++)
            for(int neighbour : adjacency_list.get(index))
                inDegree[neighbour]++;

        for(int index=0 ; index<numCourses ; index++)
            if(inDegree[index]==0)
                queue.add(index);

        int topological_sort[] = new int[numCourses];
        int index = 0;

        while(!queue.isEmpty())
        {
            int node = queue.poll();
            topological_sort[index++] = node;

            for(Integer neighbour : adjacency_list.get(node))
            {
                inDegree[neighbour]--;
                if(inDegree[neighbour] == 0)
                    queue.add(neighbour);
            }
        }
        
        return index == numCourses;
    }
}
