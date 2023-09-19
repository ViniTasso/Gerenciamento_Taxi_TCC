
package sys.taxi.com.all.util;

/**
 *
 * @author VGCT
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;


public class Data {
    
   public String dia, mes, ano, diaDaSemana, day;
   public String hora, minuto, segundo;
   public Date dataAtual = new Date();    
   
   //SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyýy");
   
    
    
    public void leData(){
        //hoje = dataFormatada.format(dataAtual);
        dia = ""+dataAtual.getDate();
        mes = ""+(1+dataAtual.getMonth());
        ano = ""+(1900+dataAtual.getYear());        
        day = ""+ dataAtual.getDay();
        switch (dataAtual.getDay()){
            case 0: diaDaSemana = "Domingo"; 
            break;
            case 1: diaDaSemana = "Segunda-Feira";
                break;
            case 2: diaDaSemana = "Terça-Feira";
                break;
            case 3: diaDaSemana = "Quarta-Feira";
                break;
            case 4: diaDaSemana = "Quinta-Feira";
                break;
            case 5: diaDaSemana = "Sexta-Feira";
                break;
            case 6: diaDaSemana = "Sabado";
                break;
        }
        
        if (dia.length() < 2){
            dia = "0"+dia;
        }
        
        if (mes.length() < 2){
            mes = "0"+mes;
        }
        
                 
        
    }
    
    public void leHora(){
        Date horaAtual = new Date();
        hora = ""+horaAtual.getHours();
        minuto = ""+horaAtual.getMinutes();
        segundo = ""+horaAtual.getSeconds();
        
        if (minuto.length() < 2)
        {
            minuto = "0" + minuto;
        }
        if (hora.length() < 2)       
        {
            hora = "0" + hora;
        }
         if (segundo.length() < 2)       
        {
            segundo = "0" + segundo;
        }
    }
    
    public void setaDataAtual(JTextField campo){
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        campo.setText(formato.format(dataAtual));
    }
}
