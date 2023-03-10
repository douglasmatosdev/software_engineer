package douglasmatosdev.college.badsolutiontoo;

import douglasmatosdev.college.entities.ItemPedido;
import douglasmatosdev.college.entities.Produto;
import douglasmatosdev.college.utils.ArrayIterator;
import douglasmatosdev.college.utils.HashSetIterator;

import java.util.*;

public class BadSolutionToo {
    public static void start() throws Exception {
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

        System.out.println("Bad solution too arrayList before, size: " + arrayList.size());
        removerItensInvalidosArrayListOrHashSet(arrayList);
        System.out.println("Bad solution too arrayList after, size: " + arrayList.size());

        System.out.println("Bad solution too hashsetList before, size: " + hashsetList.size());
        removerItensInvalidosArrayListOrHashSet(hashsetList);
        System.out.println("Bad solution too hashsetList after, size: " + hashsetList.size());
    }

    public static void removerItensInvalidosArrayListOrHashSet(Collection<ItemPedido> itens) throws Exception {
        Iterator<ItemPedido> cursor = null;

        if (itens instanceof ArrayList) {
            cursor = new ArrayIterator<>((ArrayList) itens);
        } else if (itens instanceof HashSet) {
            cursor = new HashSetIterator<>((HashSet) itens);
        }

        if (cursor == null) {
            throw new Exception("Tipo de coleção de itens inválido");
        }

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
