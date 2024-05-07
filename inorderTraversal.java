/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lista = new ArrayList();
        buscaProfundidade(lista, root);
        return lista;
    }

    // Esse método serve para fazer uma busca de profundidade em uma raiz da arvore, e buscar seus respectivos nós. Fiz isso de forma recursiva.
    private void buscaProfundidade(List<Integer> lista, TreeNode node) {
        //caso base: verifica se o nó não é null. Se fosse para fazer no design de Adalberto, seria if(!node.isNill()).
        if(node != null) {
            //caso indutivo: verifica se o nó esquerdo não é null. Se fosse para fazer no design de Adalberto, seria if(!node.getLeft().isNill())
            if(node.left != null) {
                //realiza a recursão da busca de profundidade, passando pela lista e pelo nó esquerdo.
                buscaProfundidade(lista, node.left);
            }

            //adiciona na lista o nó, caso tanto da esquerda quanto da direita for null. Ai adicionariamos desse jeito lista.add(node.getData()).
            lista.add(node.val);
            //a mesma coisa que fiz com o da esquerda. o design seria o mesmo, só mudar o getLeft() para getRight().
            if(node.right != null) {
                buscaProfundidade(lista, node.right);
            }
        }
    }
}
