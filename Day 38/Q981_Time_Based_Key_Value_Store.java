/*
 * Problem Link : https://leetcode.com/problems/time-based-key-value-store/
 * Solution Link : https://www.youtube.com/watch?v=uNyAMxr7JGI
 *
 * Time Complexity : 
 * Space Complexity :
 */

class Q981_Time_Based_Key_Value_Store
{
    Map<String, TreeMap<Integer,String>> map;

    public TimeMap() 
    {
        map = new HashMap<String, TreeMap<Integer,String>>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, x->new TreeMap<Integer,String>()).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) 
    {
        Integer version = map.containsKey(key) ? map.get(key).floorKey(timestamp) : null;
        return version != null ? map.get(key).get(version) : "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
