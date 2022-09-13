package br.senai.sp.jandira.model;



public class Tabuada {
	
	public int multiplicando;
	public int minMultiplicador;
	public int maxMultiplicador;
	
	
	
	public String [] getTabuada () { 
		int tamanho = maxMultiplicador - minMultiplicador + 1;
		String[] tabuada = new String[tamanho];
		
		int i = 0;
		while (i < tamanho) {
			
        int resultadoDaConta = multiplicando * minMultiplicador;
		String resultado = multiplicando + "X" + minMultiplicador + "=" + resultadoDaConta;
		tabuada[i] = resultado;
		i++;
		minMultiplicador++;
			
					
		}
		 return tabuada;
		
	}
	

}
