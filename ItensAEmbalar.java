package SimuladoII;

import java.util.ArrayList;
import java.util.List;

public class ItensAEmbalar {
    public List <ItemASerEmbaladoIF> itens = new ArrayList<>();

    public int adicionaItem(ItemASerEmbaladoIF item){
        itens.add(item);
        return itens.indexOf(item);
    }

    public double calculaQtdeDeEmbalar(int posicao){
        return itens.get(posicao).getArea()*itens.get(posicao).getPeso();
    }

    public double calculaQtdeTotalDeEmbalar(){
        double total = 0;
        for(int i = 0; i<=itens.size()-1; i++){
            total += calculaQtdeDeEmbalar(i);
        }
        return total;
    }
}
