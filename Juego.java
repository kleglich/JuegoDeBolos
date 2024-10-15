public class Juego {
    //datos de entrada 
    int tiro;
    //datos de salida
    String rdo;
    int p_final;
    
    public void procesar(){
       
      p_final= 0;
      for (int rondas = 0; rondas < 3; rondas++)
        
         tiro=(int)(tiro*Math.random()*20+10);
        if (tiro>=100) 
        {
            rdo="¡CHUZAA!";
            p_final += 10;
        }
        
        else
        {
                if (tiro>=90) 
                {
                    rdo="derribaste 9 pinos";
                    p_final += 9;
                }
            
            else 
            {
                 if (tiro>=80) 
                {
                    rdo="derribaste 8 pinos";
                    p_final += 8;
                }
             
            else 
            {
                if (tiro>=70) 
                {
                    rdo="derribaste 7 pinos";
                    p_final += 7;
                }

             else
            {
                if (tiro>=60) 
                {
                    rdo= "derribaste 6 pinos";
                    p_final += 6;
                }
            
            else 
            {
                 if (tiro>=50) 
                {
                    rdo="derribaste 5 pinos";
                    p_final += 5;
                }
            
            else
            {
                 if (tiro>=40)
                {
                    rdo="derribo 4 pinos";
                    p_final += 4;
                }
            
            else
            {
                 if (tiro>=30) 
                {
                    rdo="derribaste 3 pinos";
                    p_final += 3;
                }
            
            else
            {
                 if (tiro>=20) 
                {
                    rdo="derribaste 2 pinos";
                    p_final += 2;
                }
            
            else 
            {
                 if (tiro>=10)  
                {
                    rdo="derribaste un pino";
                    p_final += 1;
                }
            
            else
            {
                rdo="no derribaste nada";
                p_final += 0;
            }
            
            }

            }

            }

            }

            }

            }
            
            }

            }
          
        }
        
        if (tiro>=110)
        {
            rdo="te saliste del carril de";
            p_final += 0;
        }

    

    }
}