package Parcial1;

    class Main {
    public static void main(String[] args) {
        Persona estudiante = new Persona("Alejandro Sepulveda",  "estudiante", "5:00 AM", "heterosexual", 16, 1);
        System.out.println("Caracteristicas de estudiante");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Ocupacion: " + estudiante.getOcupacion());
        System.out.println("Hora en que se levanta: " + estudiante.getHoraLevantar());
        System.out.println("Orientacion sexual: " + estudiante.getOrientacionSexual());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("***************\n");

        Persona docente = new Persona("Burundanga Roberto", "docente", "4:00 AM", 56);
        System.out.println("Caracteristicas de docente");
        docente.setOrientacionSexual("gay");
        docente.setNumerosHermanos(3);
        System.out.println("Nombre: " + docente.getNombre());
        System.out.println("Ocupacion: " + docente.getOcupacion());
        System.out.println("Hora en que se levanta: " + docente.getHoraLevantar());
        System.out.println("Orientacion sexual: " + docente.getOrientacionSexual());
        System.out.println("Edad: " + docente.getEdad());
        System.out.println("***************\n");
        
        Persona administrativo = new Persona("Dahiana Salazar", "administrativo", "9:00 AM", 35);
        System.out.println("Caracteristicas de administrativo");
        administrativo.setOrientacionSexual("heterosexual");
        administrativo.setNumerosHermanos(4);
        System.out.println("Nombre: " + administrativo.getNombre());
        System.out.println("Ocupacion: " + administrativo.getOcupacion());
        System.out.println("Hora en que se levanta: " + administrativo.getHoraLevantar());
        System.out.println("Orientacion sexual: " + administrativo.getOrientacionSexual());
        System.out.println("Edad: " + administrativo.getEdad());
        System.out.println("***************\n");

        estudiante.cogerTransporte();
        docente.comerDesayuno();
        administrativo.despedirseDeMama();
        
    }
}

