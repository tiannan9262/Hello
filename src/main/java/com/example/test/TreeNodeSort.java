/**
 * 
 */
package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 无序树排序
 *
 * @author xzq ^^
 * 
 * @Date 2020年3月10日 下午5:28:09
 */
class TreeNode {

	String id;
	String parentId;
	List<TreeNode> children;

	public TreeNode(String id, String parentId) {
		super();
		this.id = id;
		this.parentId = parentId;
	}
}

public class TreeNodeSort {

	public TreeNode sort(List<TreeNode> nodes) {

		// 父节点集合
		List<TreeNode> father = new ArrayList<>();
		// 子节点集合
		List<TreeNode> pos = new ArrayList<>();
		// 根节点
		TreeNode root = null;

		// 找到根节点
		for (TreeNode n : nodes) {
			if (n.parentId == null) {
				father.add(n);
				root = n;
			}
		}

		while (true) {
			// 找到以当前层为父节点的所有子节点
			for (TreeNode f : father) {
				for (TreeNode n : nodes) {
					// 假如是该父节点的孩子
					if (f.id == n.parentId) {
						// 建立关系
						f.children.add(n);
						// 保存到当前节点集合 作为下一次的父节点集合
						pos.add(n);
					}
				}
			}
			
			// 假如都为叶节点 跳出循环
			if (pos.size() == 0) {
				break;
			}
			
			// 更新父节点结合
			father.clear();
			for (TreeNode p : pos) {
				father.add(p);
			}
			// 清空当前节点集合
			pos.clear();
		}
		
		return root;
	}
}
