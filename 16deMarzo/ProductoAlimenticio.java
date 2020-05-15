public class ProductoAlimenticio {
        private String fechadeelaboracion;
        private String nombre;
        private int precio;
        private String fechadevencimiento;
        private int peso;
    
    public ProductoAlimenticio(){
        fechadeelaboracion = "4 De febrero de 2020";
        nombre = "Kiwi";
        precio = 3000;
        fechadevencimiento = "14 De febrero de 2023";
        peso  = 4;
        }
        public String getFechadeelaboracion() {
            return fechadeelaboracion;
        }

        public void setFechadeelaboracion(String fechadeelaboracion) {
            this.fechadeelaboracion = fechadeelaboracion;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getPrecio() {
            return precio;
        }

        public void setPrecio(int precio) {
            this.precio = precio;
        }

        public String getFechadevencimiento() {
            return fechadevencimiento;
        }

        public void setFechadevencimiento(String fechadevencimiento) {
            this.fechadevencimiento = fechadevencimiento;
        }

        public int getPeso() {
            return peso;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }
}