package javapoo;

public class UseClasseAtributos {

	public static void main(String[] args) {
		Atributos cliente01 = new Atributos();
		
		System.out.println(cliente01.fnome);
		System.out.println(cliente01.lnome);
		System.out.println(cliente01.idade);
		System.out.printf("O aluno %s %s tem %d anos", cliente01.fnome,cliente01.lnome, cliente01.idade);
	}

}
