class LucesEmergencia implements Observer {
    @Override
    public void update(String mensaje) {
        System.out.println("Luces de emergencia encendidas: " + mensaje);
    }
}