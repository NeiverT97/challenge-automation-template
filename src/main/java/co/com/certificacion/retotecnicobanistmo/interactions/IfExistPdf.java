package co.com.certificacion.retotecnicobanistmo.interactions;

import static co.com.certificacion.retotecnicobanistmo.utils.PathDownLoadPDF.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.File;
import java.util.logging.Logger;

@NoArgsConstructor
@AllArgsConstructor
public class IfExistPdf {

    public String inPath(){

        File file = new File(PATH_FILE);
        try {
            if (file.exists()) {
                if (file.delete()) {
                    return PATH;
                } else {
                    Logger.getLogger("No se pudo eliminar el archivo:" + PATH_FILE);
                }
            } else {
                Logger.getLogger("El archivo no existe: " + PATH_FILE);
            }
        } catch (Exception e) {
            Logger.getLogger("Error al eliminar el archivo: " + e.getMessage());
        }
        return PATH;
    }

}
