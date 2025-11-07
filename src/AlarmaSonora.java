class AlarmaSonora implements Observer {
    @Override
    public void update(String mensaje) {
        System.out.println("Alarma sonora activada: " + mensaje);
    }
}
