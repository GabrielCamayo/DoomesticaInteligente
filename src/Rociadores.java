class Rociadores implements Observer {
    @Override
    public void update(String mensaje) {
        System.out.println("Rociadores de agua activados: " + mensaje);
    }
}
