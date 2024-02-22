package funcDAO;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

import funcModel.Funcionario;
import funcUtil.Log;


public class FuncDAO {
	
	private String pathBancoDados = "C:\\TEMP_1\\TesteDeArquivo\\BancoDeDados.csv";
	
	public boolean gravarFuncionarios(List <Funcionario> funcionarios) throws Exception{
		
		PrintWriter pw;
		try {
			pw = new PrintWriter(pathBancoDados, Charset.forName("UTF-8"));

			for (Funcionario func : funcionarios) {
				pw.print(func.getId());
				pw.print(";" + func.getName());
				pw.print(";" + func.getCpf());
				pw.println();
			}

			pw.close();
			return true;
		} catch (Exception e) {
			Log.escrever("Erro ao tentar gravar Funcionarios: " + e.getMessage());
			throw new Exception("Erro ao tentar gravar Funcionarios: " + e.getMessage());
		}
	}
	
	public List<Funcionario> lerFunc(){
		
		List <Funcionario> resp = new ArrayList<Funcionario>();
		
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader (new FileReader(pathBancoDados));
			
			String linha;
			
			Funcionario tmp;
			
			while((linha = br.readLine()) != null) {
				
				String[] palavras = linha.split(";");
				tmp = new Funcionario();
				tmp.setId(Long.parseLong(palavras[0]));
				tmp.setName(palavras[1]);
				tmp.setCpf(palavras[2]);
				
				resp.add(tmp);
				
			}
			
		}catch(Exception e) {
			Log.escrever(e.getMessage());
		}finally {
			try {
				br.close();
			}catch (IOException e) {
				Log.escrever("Nao conseguiu liberar o recurso. " + e.getMessage());
			}
		}
		return resp;
		
	}
	
}
