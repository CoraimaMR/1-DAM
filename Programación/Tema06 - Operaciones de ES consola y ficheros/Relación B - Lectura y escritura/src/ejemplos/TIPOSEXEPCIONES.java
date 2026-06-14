
/********************************* EXEPCIONES **********************************

} catch (FileNotFoundException e) { // ERROR de archivo no encontrado
    System.out.println("ERROR DE ARCHIVO NO ENCONTRADO: " + e);
    e.printStackTrace();
}
if (!archivo.exists()) throw new FileNotFoundException("*** Error en la apertura del archivo ***");


} catch (InputMismatchException e) { // ERROR de tipo de dato
    System.out.println("ERROR DE TIPO DE DATO: " + e);
    e.printStackTrace();
}

} catch (IOException e) { // ERROR de entrada o salida de texto
    System.out.println("ERROR EN LA ENTRADA O SALIDA DE TEXTO: " + e);
    e.printStackTrace();
}
 
} catch (Exception e) { // ERROR general
    System.out.println("OTRO TIPO DE ERROR: " + e);
    e.printStackTrace();
}

*******************************************************************************/
