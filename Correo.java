public class Correo {
        private String remitente;
            private String titulo;
                private String mensaje;
                    private boolean visto;

                        public Correo(String remitente, String titulo, String mensaje) {
                                this.remitente = remitente;
                                        this.titulo = titulo;
                                                this.mensaje = mensaje;
                                                        this.visto = false;
                                                            }

                                                                public String getRemitente() {
                                                                        return remitente;
                                                                            }

                                                                                public String getTitulo() {
                                                                                        return titulo;
                                                                                            }

                                                                                                public String getMensaje() {
                                                                                                        return mensaje;
                                                                                                            }

                                                                                                                public boolean isVisto() {
                                                                                                                        return visto;
                                                                                                                            }

                                                                                                                                public void marcarVisto() {
                                                                                                                                        this.visto = true;
                                                                                                                                            }

                                                                                                                                                public void mostrar() {
                                                                                                                                                        System.out.println("\n--- CORREO ---");
                                                                                                                                                                System.out.println("De: " + remitente);
                                                                                                                                                                        System.out.println("Titulo: " + titulo);
                                                                                                                                                                                System.out.println(mensaje);
                                                                                                                                                                                        System.out.println("--------------\n");
                                                                                                                                                                                            }
                                                                                                                                                                                            }
}