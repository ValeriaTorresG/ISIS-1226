package uniandes.dpoo.taller0.modificacion;
import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Modificacion {
	
	public void main() throws FileNotFoundException, IOException
	{
		System.out.println("Hola, mundo!");
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		
		//System.out.println(calc.paisConMasMedallistas());
		
		Map<String, Integer> pais = calc.paisConMasMedallistas();
		Set<String> mapNombre = pais.keySet();
		List<String> keys = new ArrayList<>(mapNombre);
		String key = keys.toString();
		String nombre = key.substring(1, key.length()-1);
		int medallas = pais.get(nombre);
		System.out.println("El pais con mas medallas es " + nombre + " con " + medallas + " medallas");
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Modificacion consola = new Modificacion();
		consola.main();
	}
}