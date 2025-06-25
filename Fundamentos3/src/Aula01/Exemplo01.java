package Aula01;

public class Exemplo01 {

	public static void main(String[] args) {
		String texto = new String(); // criando uma string vazia chamada texto
		String str = "hello word";
		texto = str.replace("hello", "Olá");
		System.out.println(texto);
		texto = str.substring(5); //guarda o texto apartir da posição solicitada até o final.
		System.out.println(texto);
		texto = str.substring(3,8); // guarda o texto apartir da posição solicitada até a posição solicitada também ( 8 -1)
		System.out.println(texto);
	}

}
