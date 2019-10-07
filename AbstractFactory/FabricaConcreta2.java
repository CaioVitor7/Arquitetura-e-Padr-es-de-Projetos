package AbstractFactory;

class FabricaConcreta2 implements FabricaAbstrata {

    @Override
    public ProdutoAbstratoA createProdutoA() {
        return new ProdutoA2();
    }
    @Override
    public ProdutoAbstratoB createProdutoB() {
        return new ProdutoB2();
    }
}