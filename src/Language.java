/*
 * @author Anthony Narlock
 * This Language class defines what each type of Langauge will outline
 * 
 * Each profile will be assigned an integer value that will determine their language
 * The language can be modified afterwards.
 * 
 * 
 */

public class Language {

	private int lang;
	
	public Language() {
		this.lang = 0;
	}
	
	public Language(int lang) {
		this.lang = lang;
	}
	
	/*
	 * getText(int num) is a method that will return a string of text in the preferred language
	 * the num parameter indicates the message number that will be returned.
	 */
	
	public String getText(int num) {
		//0 = English
		if(lang == 0) {
			//UI Interface
			if(num == 1)
				return "Welcome";
			if(num == 2)
				return "Level";
			if(num == 3)
				return "Statistics";
			if(num == 4)
				return "Food Store";
			if(num == 5)
				return "Background Store";
			if(num == 6)
				return "Logout";
			if(num == 7)
				return "Start Focus";
			if(num == 8)
				return "Break Focus";
				
			//Statistics Interface
			if(num == 9)
				return "Total Hours";
			if(num == 10)
				return "Total Hours in Session";
			if(num == 11)
				return "User";
			if(num == 12)
				return "Join Date";
			if(num == 13)
				return "Achievements";
				
			//Shop Interface
			if(num == 14)
				return "Can't enter food shop";
			if(num == 15)
				return "Your Tamo is full!";
			if(num == 16)
				return "Purchase for";
			if(num == 17)
				return "Tamo Tokens";
			if(num == 18)
				return "Can't complete purchase";
			if(num == 19)
				return "You don't have sufficient funds";
			if(num == 20)
				return "Return to Focus";
			if(num == 21)
				return "Hunger";
				
			//Logout
			if(num == 22)
				return "Logging out...";
			if(num == 23)
				return "Are you sure?";
		}
		
		//1 = Spanish
		if(lang == 1) {
			//UI Interface
			if(num == 1)
				return "Bienvendios";
			if(num == 2)
				return "Nivel";
			if(num == 3)
				return "Estad�stica";
			if(num == 4)
				return "Supermercado";
			if(num == 5)
				return "Tienda de Fondos";
			if(num == 6)
				return "Salir";
			if(num == 7)
				return "Comienza Enfoque";
			if(num == 8)
				return "Pare Enfoque";
				
			//Statistics Interface
			if(num == 9)
				return "Horas Totales";
			if(num == 10)
				return "Horas Totales en Sesi�n";
			if(num == 11)
				return "Usuario";
			if(num == 12)
				return "Fecha de Entrada";
			if(num == 13)
				return "Exitos";
				
			//Shop Interface
			if(num == 14)
				return "No puedes entrar en el supermercado";
			if(num == 15)
				return "Tu Tamo est� lleno!";
			if(num == 16)
				return "Compra por";
			if(num == 17)
				return "Tamo Tokens";
			if(num == 18)
				return "No se puede completar la compra";
			if(num == 19)
				return "No tienes condos suficientes";
			if(num == 20)
				return "Volver a enfoque";
			if(num == 21)
				return "Hambre";
				
			//Logout
			if(num == 22)
				return "Cerrando sesi�n...";
			if(num == 23)
				return "Est�s seguro?";
		}
		
		//2 = Portuguese
		if(lang == 2) {
			//UI Interface
			if(num == 1)
				return "Boas vindas";
			if(num == 2)
				return "N�vel";
			if(num == 3)
				return "Estat�stica";
			if(num == 4)
				return "Loja de Comidas";
			if(num == 5)
				return "Loja de Background";
			if(num == 6)
				return "Sair";
			if(num == 7)
				return "Iniciar foco";
			if(num == 8)
				return "Interromper foco";
				
			//Statistics Interface
			if(num == 9)
				return "Horas totais de foco";
			if(num == 10)
				return "Horas totais em sess�es";
			if(num == 11)
				return "Usu�rio";
			if(num == 12)
				return "Ingressou em";
			if(num == 13)
				return "Conquistas";
				
			//Shop Interface
			if(num == 14)
				return "Voc� n�o precisa comprar comida agora";
			if(num == 15)
				return "Seu Tamo n�o est� com fome!";
			if(num == 16)
				return "Comprar";
			if(num == 17)
				return "Tamo Moedas";
			if(num == 18)
				return "N�o foi poss�vel concluir a compra";
			if(num == 19)
				return "Voc� n�o tem Tamo Moedas suficientes";
			if(num == 20)
				return "Retornar ao foco";
			if(num == 21)
				return "Hunger";
				
			//Logout
			if(num == 22)
				return "Fazendo logoff...";
			if(num == 23)
				return "Voc� tem certeza?";
		}
		
		//3 = German
		if(lang == 3) {
			//UI Interface
			if(num == 1)
				return "Willkommen";
			if(num == 2)
				return "Level";
			if(num == 3)
				return "Statistik";
			if(num == 4)
				return "Markt";
			if(num == 5)
				return "Background Store";
			if(num == 6)
				return "Logout";
			if(num == 7)
				return "Beginn Fokus";
			if(num == 8)
				return "Pause Fokus";
				
			//Statistics Interface
			if(num == 9)
				return "Gesamtzeit";
			if(num == 10)
				return "Gesamtzeit in Session";
			if(num == 11)
				return "Benutzer";
			if(num == 12)
				return "Beitrittsdatum";
			if(num == 13)
				return "Erfolge";
				
			//Shop Interface
			if(num == 14)
				return "Betreten des Markts nicht m�glich";
			if(num == 15)
				return "Dein Tamo ist satt!";
			if(num == 16)
				return "Kauf von";
			if(num == 17)
				return "Tamo M�nzen";
			if(num == 18)
				return "Kauf kann nicht beendet werden";
			if(num == 19)
				return "Nicht genug Tamo M�nzen";
			if(num == 20)
				return "Zur�ck zum Fokus";
			if(num == 21)
				return "Hunger";
				
			//Logout
			if(num == 22)
				return "Ausloggen...";
			if(num == 23)
				return "Bist du dir sicher?";
		}
		
		return null;
	}
}
