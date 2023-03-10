package douglasmatosdev.college.badsolution;

import douglasmatosdev.college.entities.ItemPedido;
import douglasmatosdev.college.entities.Produto;
import douglasmatosdev.college.utils.ArrayIterator;
import douglasmatosdev.college.utils.HashSetIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class BadSolution {
    public static void start() {
        Produto produtoArraylist = new Produto("ArrayList");
        Produto produtoArraylist1 = new Produto("ArrayList1");
        Produto produtoHashSet = new Produto("HashSet");
        Produto produtoHashSet1 = new Produto("HashSet1");

        ArrayList<ItemPedido> arrayList = new ArrayList<>() {{
            add(new ItemPedido(produtoArraylist, 0, 5));
            add(new ItemPedido(produtoArraylist1, 2, 5));
        }};

        HashSet<ItemPedido> hashsetList = new HashSet<>(Arrays.asList(
                new ItemPedido(produtoHashSet, 0, 3),
                new ItemPedido(produtoHashSet1, 3, 7)
        ));

        System.out.println("Bad solution arrayList before, size: " + arrayList.size());
        removerItensInvalidosArrayList(arrayList);
        System.out.println("Bad solution arrayList after, size: " + arrayList.size());

        System.out.println("Bad solution hashsetList before, size: " + hashsetList.size());
        removerItensInvalidosHashSet(hashsetList);
        System.out.println("Bad solution hashsetList after, size: " + hashsetList.size());
    }
    public static void removerItensInvalidosArrayList(ArrayList<ItemPedido> itens) {
        ArrayIterator<ItemPedido> cursor = new ArrayIterator(itens);

        while (cursor.hasNext()) {
            ItemPedido item = cursor.next();

            if (!isValido(item)) {
                cursor.remove();
            }
        }
    }
    public static void removerItensInvalidosHashSet(HashSet<ItemPedido> itens) {
        HashSetIterator<ItemPedido> cursor = new HashSetIterator(itens);
        while (cursor.hasNext()) {
            ItemPedido item = cursor.next();
            if (!isValido(item)) {
                cursor.remove();
            }
        }
    }
    public static boolean isValido(ItemPedido item) {
        return (item.getQuantidade() > 0 && item.getQuantidade() < 100);
    }
}
