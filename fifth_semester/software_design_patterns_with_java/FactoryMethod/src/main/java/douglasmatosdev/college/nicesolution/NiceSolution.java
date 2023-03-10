package douglasmatosdev.college.nicesolution;

import douglasmatosdev.college.entities.ItemPedido;
import douglasmatosdev.college.entities.Produto;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class NiceSolution {
    public static void start() {
        Produto produto = new Produto("Nice produto");

        HashSet<ItemPedido> list = new HashSet<>(Arrays.asList(
                new ItemPedido(produto, 0, 3),
                new ItemPedido(produto, 3, 7)
        ));

        System.out.println("Nice list before, size: " + list.size());
        removerItensInvalidos(list);
        System.out.println("Nice list after, size: " + list.size());
    }
    public static void removerItensInvalidos(Collection<ItemPedido> itens) {
        Iterator<ItemPedido> iterator = itens.iterator();
        while (iterator.hasNext()) {
            ItemPedido item = iterator.next();
            if (!isValido(item)) {
                itens.remove(item);
            }
        }
    }

    public static boolean isValido(ItemPedido item) {
        return (item.getQuantidade() > 0 && item.getQuantidade() < 100);
    }
}
