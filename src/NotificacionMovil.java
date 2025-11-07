class NotificacionMovil implements Observer {
    @Override
    public void update(String mensaje) {
        System.out.println("Notificación enviada al móvil: " + mensaje);
    }
}