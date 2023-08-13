/*
 * Problem Link : https://leetcode.com/problems/implement-trie-prefix-tree/
 * Solution Link : https://www.youtube.com/watch?v=dBGUmUQhjaM&list=PLgUwDviBIf0pcIDCZnxhv0LkHf5KzG9zp
 *
 * Time Complexity : 
 * Space Complexity :
 *
 */

class Q208_Implement_Trie_Prefix_Tree
 
{
    class Node
    {
        Node links[] = new Node[26];
        boolean flag = false;

        public boolean contains(char c)
        {
            return links[c-'a'] != null;
        }

        public Node get(char c)
        {
            return links[c-'a'];
        }

        public void put(char c, Node node)
        {
            links[c-'a'] = node;
        }

        public void setFlag()
        {
            flag = true;
        }

        public boolean isSet()
        {
            return flag;
        }
    }

    Node root = null;

    public Trie() 
    {
        root = new Node();
    }
    
    public void insert(String word) 
    {
        Node current = root;
        for(char c : word.toCharArray())
        {
            if(!current.contains(c))
                current.put(c, new Node());
            current = current.get(c);
        }
        current.setFlag();
    }
    
    public boolean search(String word) 
    {
        Node current = root;
        for(char c : word.toCharArray())
        {
            if(!current.contains(c))
                return false;
            current = current.get(c);
        }
        return current.isSet();
    }
    
    public boolean startsWith(String prefix) 
    {
        Node current = root;
        for(char c : prefix.toCharArray())
        {
            if(!current.contains(c))
                return false;
            current = current.get(c);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
