package AbstractFactory;

class ProdutoB2 implements ProdutoAbstratoB {

    @Override
    public void interagir(ProdutoAbstratoA a) {
        System.out.println(this.getClass().getName() + " interage com " + a.getClass().getName());
    }

}