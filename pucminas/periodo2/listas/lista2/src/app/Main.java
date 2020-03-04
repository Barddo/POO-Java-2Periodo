package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {

		new Exercicio11().executa();
		for (int i = 3; i <= 20; i++) {
			// Executa todos exercícios.

			Class<?> exercicioClass = Class.forName("app.Exercicio" + i);

			Object exercicio = exercicioClass.getDeclaredConstructor().newInstance();

			Method executa = exercicio.getClass().getMethod("executa");
			executa.invoke(exercicio);
		}
	}

	public static int readInt(String msg) {
		System.out.println(msg);
		int i = 0;
		try {
			i = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return i;
	}

	public static String readLine(String msg) {
		System.out.println(msg);
		String i = null;
		try {
			i = new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return i;
	}

	public static float readFloat(String msg) {
		System.out.println(msg);
		float i = 0F;
		try {
			i = Float.parseFloat(new BufferedReader(new InputStreamReader(System.in)).readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return i;
	}
}