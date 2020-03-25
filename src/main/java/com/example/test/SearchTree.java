/**
 * 
 */
package algorithm;

/**
 * 二叉排序树
 *
 * @author xzq ^^
 * 
 * @Date 2020年3月8日 下午2:15:32
 */
class BinaryTree {

	int val;
	BinaryTree left;
	BinaryTree right;

	public BinaryTree(int val) {
		this.val = val;
	}
}

public class SearchTree {

	/** 父节点 */
	static BinaryTree f;
	/** 根节点 */
	static BinaryTree root;

	/**
	 * 二叉排序树的创建
	 * 
	 * @param root
	 * @param key
	 */
	public static void createBST(BinaryTree root, int key) {

		BinaryTree newNode = new BinaryTree(key);
		if (key > root.val) {
			if (root.right == null) {
				root.right = newNode;
			} else {
				createBST(root.right, key);
			}
		} else if (key < root.val) {
			if (root.left == null) {
				root.left = newNode;
			} else {
				createBST(root.left, key);
			}
		} else {
			System.out.println("The node " + key + "is already exists!");
			return;
		}
	}

	/**
	 * 二叉排序树的查找
	 * 
	 * @param root
	 * @param key
	 * @param p
	 * @return
	 */
	public static boolean sort(BinaryTree root, int key, BinaryTree p) {

		if (root == null) {
			f = p;
			System.out.println("fail!");
			return false;
		} else if (root.val == key) {
			f = root;
			System.out.println("success!");
			return true;
		} else if (root.val > key) {
			return sort(root.left, key, root);
		} else {
			return sort(root.right, key, root);
		}
	}

	/**
	 * 二叉排序树的插入
	 * 
	 * @param root
	 * @param key
	 */
	public static void insert(BinaryTree root, int key) {

		if (sort(root, key, null) == false) {
			BinaryTree newNode = new BinaryTree(key);
			if (f == null) {
				root = newNode;
			} else if (key > f.val) {
				f.right = newNode;
			} else {
				f.left = newNode;
			}
			System.out.println("success!");
		} else {
			System.out.println("The node " + key + "is already exists!");
		}
	}

}
