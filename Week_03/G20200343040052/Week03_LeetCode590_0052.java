//给定一个 N 叉树，返回其节点值的后序遍历。 
//
// 例如，给定一个 3叉树 : 
//
// 
//
// 
//
// 
//
// 返回其后序遍历: [5,6,3,2,4,1]. 
//
// 
//
// 说明: 递归法很简单，你可以使用迭代法完成此题吗? Related Topics 树


import java.util.LinkedList;

//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    private List<Integer> res;
    public List<Integer> postorder(Node root) {
        res = new LinkedList<>();
        dfs(root);
        return res;
    }
    private void dfs(Node root) {
        // root == null 的含义就是 上一层没有children节点
        if (root == null) return;
        // 后序遍历是先遍历孩子结点后遍历根节点
        //所以，先向下，然后再加值
        for(Node child : root.children) {
            dfs(child);
        }
        res.add(root.val);

    }
}
//leetcode submit region end(Prohibit modification and deletion)
