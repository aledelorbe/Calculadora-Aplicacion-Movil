
package com.example.calculadoramovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    List<Double> operandos = new ArrayList();
    List<String> operadores = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // EXTRAER REFERENCICA DE LOS BOTONES
        Button btnPorcv = (Button)findViewById(R.id.btnPorc);
        Button btnCe = (Button)findViewById(R.id.btnCe);
        Button btnC = (Button)findViewById(R.id.btnC);
        Button btnDel = (Button)findViewById(R.id.btnDel);
        Button btnRecip = (Button)findViewById(R.id.btnInver);
        Button btnX2 = (Button)findViewById(R.id.btnX2);
        Button btnSqrt = (Button)findViewById(R.id.btnSqrt);
        Button btnDiv = (Button)findViewById(R.id.btnDiv);
        Button btnSiete = (Button)findViewById(R.id.btnSiete);
        Button btnOcho = (Button)findViewById(R.id.btnOcho);
        Button btnNueve = (Button)findViewById(R.id.btnNueve);
        Button btnX = (Button)findViewById(R.id.btnX);
        Button btnCuatro = (Button)findViewById(R.id.btnCuatro);
        Button btnCinco = (Button)findViewById(R.id.btnCinco);
        Button btnSeis = (Button)findViewById(R.id.btnSeis);
        Button btnMenos = (Button)findViewById(R.id.btnMenos);
        Button btnUno = (Button)findViewById(R.id.btnUno);
        Button btnDos = (Button)findViewById(R.id.btnDos);
        Button btnTres = (Button)findViewById(R.id.btnTres);
        Button btnMas = (Button)findViewById(R.id.btnMas);
        Button btnMasMenos = (Button)findViewById(R.id.btnMasMenos);
        Button btnCero = (Button)findViewById(R.id.btnCero);
        Button btnPunto = (Button)findViewById(R.id.btnPunto);
        Button btnIgual = (Button)findViewById(R.id.btnIgual);

        btnPorcv.setOnClickListener(this);
        btnCe.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnRecip.setOnClickListener(this);
        btnX2.setOnClickListener(this);
        btnSqrt.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnSiete.setOnClickListener(this);
        btnOcho.setOnClickListener(this);
        btnNueve.setOnClickListener(this);
        btnX.setOnClickListener(this);
        btnCuatro.setOnClickListener(this);
        btnCinco.setOnClickListener(this);
        btnSeis.setOnClickListener(this);
        btnMenos.setOnClickListener(this);
        btnUno.setOnClickListener(this);
        btnDos.setOnClickListener(this);
        btnTres.setOnClickListener(this);
        btnMas.setOnClickListener(this);
        btnMasMenos.setOnClickListener(this);
        btnCero.setOnClickListener(this);
        btnPunto.setOnClickListener(this);
        btnIgual.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){

        //ACCIONES A REALIZAR DEPENDIENDEMENTE DE QUE BOTON FUE PRESIONADO
        if ( view.getId() == R.id.btnPorc ){
            if( !isCeroRes() ){
                agregarOperador("%");

                String nuevaEntrada = porcentajeador();
                TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
                String entrada = String.valueOf(txtOper.getText());
                /*vaciadorArraylist();
                extractorOperadoresOperandos(entrada);
                multiDivi();
                sumaResta();
                mostrarResultado();*/
            }
        }
        else if ( view.getId() == R.id.btnCe ){
            vaciarRes();
        }
        else if ( view.getId() == R.id.btnC ){
            vaciarResyOper();
        }
        else if ( view.getId() == R.id.btnDel ){

            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());
            String cadena[] = entrada.split("");

            if( cadena.length > 1 )
            {
                if( isPenultimoCaracterOperador() )
                    eliminarUltimoCaracter();
                else
                {
                    eliminarUltimoCaracter();
                    vaciadorArraylist();
                    extractorOperadoresOperandos(entrada);
                    multiDivi();
                    sumaResta();
                    mostrarResultado();
                }
            }
            else
                vaciarResyOper();
        }
        else if ( view.getId() == R.id.btnInver ){
            reciproco();

            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());
            vaciadorArraylist();
            extractorOperadoresOperandos(entrada);
            multiDivi();
            sumaResta();
            mostrarResultado();
        }
        else if ( view.getId() == R.id.btnX2 ){
            potenciaCuadratica();

            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());
            vaciadorArraylist();
            extractorOperadoresOperandos(entrada);
            multiDivi();
            sumaResta();
            mostrarResultado();
        }
        else if ( view.getId() == R.id.btnSqrt ){
            raizCuadrada();

            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());
            vaciadorArraylist();
            extractorOperadoresOperandos(entrada);
            multiDivi();
            sumaResta();
            mostrarResultado();
        }
        else if ( view.getId() == R.id.btnDiv ){
            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());

            if( entrada.isEmpty() )
                agregarOperador("0/");
            else if( isUltimoCaracterDigito() )
                agregarOperador("/");
            else if( isUltimoCaracterOperador() )
                reemplazarUltimoCaracter("/");
        }
        else if ( view.getId() == R.id.btnSiete ){
            agregarNumero(7);

            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());
            vaciadorArraylist();
            extractorOperadoresOperandos(entrada);
            multiDivi();
            sumaResta();
            mostrarResultado();
        }
        else if ( view.getId() == R.id.btnOcho ){
            agregarNumero(8);

            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());
            vaciadorArraylist();
            extractorOperadoresOperandos(entrada);
            multiDivi();
            sumaResta();
            mostrarResultado();
        }
        else if ( view.getId() == R.id.btnNueve ){
            agregarNumero(9);

            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());
            vaciadorArraylist();
            extractorOperadoresOperandos(entrada);
            multiDivi();
            sumaResta();
            mostrarResultado();
        }
        else if ( view.getId() == R.id.btnX ){
            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());

            if( entrada.isEmpty() )
                agregarOperador("0x");
            else if( isUltimoCaracterDigito() )
                agregarOperador("x");
            else if( isUltimoCaracterOperador() )
                reemplazarUltimoCaracter("x");
        }
        else if ( view.getId() == R.id.btnCuatro ){
            agregarNumero(4);

            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());
            vaciadorArraylist();
            extractorOperadoresOperandos(entrada);
            multiDivi();
            sumaResta();
            mostrarResultado();
        }
        else if ( view.getId() == R.id.btnCinco ){
            agregarNumero(5);

            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());
            vaciadorArraylist();
            extractorOperadoresOperandos(entrada);
            multiDivi();
            sumaResta();
            mostrarResultado();
        }
        else if ( view.getId() == R.id.btnSeis ){
            agregarNumero(6);

            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());
            vaciadorArraylist();
            extractorOperadoresOperandos(entrada);
            multiDivi();
            sumaResta();
            mostrarResultado();
        }
        else if ( view.getId() == R.id.btnMenos ){
            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());

            if( entrada.isEmpty() )
                agregarOperador("0-");
            else if( isUltimoCaracterDigito() )
                agregarOperador("-");
            else if( isUltimoCaracterOperador() )
                reemplazarUltimoCaracter("-");
        }
        else if ( view.getId() == R.id.btnUno ){
            agregarNumero(1);

            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());
            vaciadorArraylist();
            extractorOperadoresOperandos(entrada);
            multiDivi();
            sumaResta();
            mostrarResultado();
        }
        else if ( view.getId() == R.id.btnDos ){
            agregarNumero(2);

            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());
            vaciadorArraylist();
            extractorOperadoresOperandos(entrada);
            multiDivi();
            sumaResta();
            mostrarResultado();
        }
        else if ( view.getId() == R.id.btnTres ){
            agregarNumero(3);

            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());
            vaciadorArraylist();
            extractorOperadoresOperandos(entrada);
            multiDivi();
            sumaResta();
            mostrarResultado();
        }
        else if ( view.getId() == R.id.btnMas ){
            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());

            if( entrada.isEmpty() )
                agregarOperador("0+");
            else if( isUltimoCaracterDigito() )
                agregarOperador("+");
            else if( isUltimoCaracterOperador() )
                reemplazarUltimoCaracter("+");
        }
        else if ( view.getId() == R.id.btnMasMenos ){
            inversorSigno();

            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());
            vaciadorArraylist();
            extractorOperadoresOperandos(entrada);
            multiDivi();
            sumaResta();
            mostrarResultado();
        }
        else if ( view.getId() == R.id.btnCero ){
            if( !isCeroRes() ){
                agregarNumero(0);

                TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
                String entrada = String.valueOf(txtOper.getText());
                vaciadorArraylist();
                extractorOperadoresOperandos(entrada);
                multiDivi();
                sumaResta();
                mostrarResultado();
            }
        }
        else if ( view.getId() == R.id.btnPunto ){
            TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
            String entrada = String.valueOf(txtOper.getText());

            if( entrada.isEmpty() )
            {
                agregarOperador("0.");
            }
            else
            {
                System.out.println("entrada = " + entrada);
                String nuevaEntrada = "";
                if( isUltimoCaracterOperador() )
                    nuevaEntrada = entrada + "0.";
                else if( !isPunto() )
                    nuevaEntrada = entrada + ".";
                else
                    nuevaEntrada = entrada;

                System.out.println("nuevaEntrada = " + nuevaEntrada);
                txtOper.setText(nuevaEntrada);
            }

        }
        else if ( view.getId() == R.id.btnIgual ){
            mostrarIgual();
        }
    }


    public boolean isPunto()
    {
        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        String entrada = String.valueOf(txtOper.getText());

        System.out.println("entrada = " + entrada);
        int longitudCadena = entrada.length();
        boolean respuesta = false;
        String cadena[] = entrada.split("");

        for (int i = longitudCadena - 1; i > 0; i--)
        {
            if( cadena[i].equals(".") )
                respuesta = true;
            else if( cadena[i].equals("+") || cadena[i].equals("-") || cadena[i].equals("x") || cadena[i].equals("/") )
            {
                break;
            }
            System.out.println("cadena[i] = " + cadena[i]);
        }

        return respuesta;
    }


    public void reemplazarUltimoCaracter(String caracter)
    {
        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        String entrada = String.valueOf(txtOper.getText());

        System.out.println("entrada = " + entrada);
        int longitudCadena = entrada.length();
        String nuevaEntrada = "";
        System.out.println("longitudCadena = " + longitudCadena);

        nuevaEntrada = entrada.substring(0, longitudCadena - 1) + caracter;
        System.out.println("nuevaEntrada = " + nuevaEntrada);

        txtOper.setText(nuevaEntrada);
    }

    public boolean isUltimoCaracterDigito()
    {
        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        String entrada = String.valueOf(txtOper.getText());

        boolean respuesta = false;
        int longitudCadena = entrada.length();
        String cadena[] = entrada.split("");

        if( cadena[longitudCadena - 1].equals("9") || cadena[longitudCadena - 1].equals("8") ||
                cadena[longitudCadena - 1].equals("7") || cadena[longitudCadena - 1].equals("6") ||
                cadena[longitudCadena - 1].equals("5") || cadena[longitudCadena - 1].equals("4") ||
                cadena[longitudCadena - 1].equals("3") || cadena[longitudCadena - 1].equals("2") ||
                cadena[longitudCadena - 1].equals("1") || cadena[longitudCadena - 1].equals("0") )
        respuesta = true;

        return respuesta;
    }

    public boolean isUltimoCaracterOperador()
    {
        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        String entrada = String.valueOf(txtOper.getText());

        boolean respuesta = false;
        int longitudCadena = entrada.length();
        String cadena[] = entrada.split("");

        if( cadena[longitudCadena - 1].equals("+") || cadena[longitudCadena - 1].equals("-") ||
                cadena[longitudCadena - 1].equals("x") || cadena[longitudCadena - 1].equals("/") )
            respuesta = true;

        return respuesta;
    }


    public boolean isPenultimoCaracterOperador()
    {
        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        String entrada = String.valueOf(txtOper.getText());

        boolean respuesta = false;
        int longitudCadena = entrada.length();
        String cadena[] = entrada.split("");

        if( cadena[longitudCadena - 2].equals("+") || cadena[longitudCadena - 2].equals("-") ||
                cadena[longitudCadena - 2].equals("x") || cadena[longitudCadena - 2].equals("/") )
            respuesta = true;

        return respuesta;
    }


    public void inversorSigno()
    {
        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        String entrada = String.valueOf(txtOper.getText());
        String nuevaEntrada = "";

        System.out.println("entrada = " + entrada);
        int longitudCadena = entrada.length();
        String cadena[] = entrada.split("");
        int posicionNumero = 0;
        double numero;

        int posicionOperSuma = entrada.lastIndexOf("+");
        int posicionOperResta = entrada.lastIndexOf("-");

        System.out.println("posicionOperResta = " + posicionOperResta);
        System.out.println("posicionOperSuma = " + posicionOperSuma);
        System.out.println("longitudCadena = " + longitudCadena);

        if( posicionOperResta == -1 && posicionOperSuma == -1 )
        {
            System.out.println("primero");
            nuevaEntrada = "0-" + entrada;
        }
        else if( posicionOperResta != -1 && posicionOperSuma == -1 && posicionOperResta != (longitudCadena -
                1) )
        {
            System.out.println("segundo");
            nuevaEntrada = entrada.substring(0, posicionOperResta) + "+" + entrada.substring(posicionOperResta +
                    1, longitudCadena);
        }
        else if( posicionOperResta == -1 && posicionOperSuma != -1 && posicionOperSuma != (longitudCadena -
                1) )
        {
            System.out.println("tercero");
            nuevaEntrada = entrada.substring(0, posicionOperSuma) + "-" + entrada.substring(posicionOperSuma +
                    1, longitudCadena);
        }
        else if( posicionOperResta != -1 && posicionOperResta == (longitudCadena - 1) )
        {
            System.out.println("cuarto");
            boolean coincidencia = false;
            for (int i = longitudCadena - 2; i > 0; i--)
            {
                if( cadena[i].equals("+") || cadena[i].equals("-") || cadena[i].equals("x") || cadena[i].equals("/") )
                {
                    coincidencia = true;
                    posicionNumero = i;
                    break;
                }
            }
            System.out.println("coincidencia = " + coincidencia);

            if( coincidencia )
            {
                System.out.println("posicionNumero = " + posicionNumero);
                System.out.println("Parte de la cadena: " + entrada.substring(posicionNumero, longitudCadena - 1));
                numero = Double.parseDouble(entrada.substring(posicionNumero, longitudCadena - 1));

                System.out.println("numero = " + numero);
                System.out.println("Parte de la cadena original: " + entrada.substring(0, longitudCadena - 1));
                nuevaEntrada = entrada.substring(0, longitudCadena - 1) + "+" + numero;
            }
            else
            {
                System.out.println("posicionNumero = " + posicionNumero);
                System.out.println("Parte de la cadena: " + entrada.substring(posicionNumero, longitudCadena - 1));
                numero = Double.parseDouble(entrada.substring(posicionNumero, longitudCadena - 1));

                System.out.println("numero = " + numero);
                System.out.println("Parte de la cadena original: " + entrada.substring(0, longitudCadena - 1));
                nuevaEntrada = entrada.substring(0, longitudCadena - 1) + "+" + numero;
            }
        }
        else if( posicionOperSuma != -1 && posicionOperSuma == (longitudCadena - 1) )
        {
            System.out.println("quinto");
            boolean coincidencia = false;
            for (int i = longitudCadena - 2; i > 0; i--)
            {
                if( cadena[i].equals("+") || cadena[i].equals("-") || cadena[i].equals("x") || cadena[i].equals("/") )
                {
                    coincidencia = true;
                    posicionNumero = i;
                    break;
                }
            }
            System.out.println("coincidencia = " + coincidencia);

            if( coincidencia )
            {
                System.out.println("posicionNumero = " + posicionNumero);
                System.out.println("Parte de la cadena: " + entrada.substring(posicionNumero, longitudCadena - 1));
                numero = Math.abs(Double.parseDouble(entrada.substring(posicionNumero, longitudCadena - 1)));

                System.out.println("numero = " + numero);
                System.out.println("Parte de la cadena original: " + entrada.substring(0, longitudCadena - 1));
                nuevaEntrada = entrada.substring(0, longitudCadena - 1) + "-" + numero;
            }
            else
            {
                System.out.println("posicionNumero = " + posicionNumero);
                System.out.println("Parte de la cadena: " + entrada.substring(posicionNumero, longitudCadena - 1));
                numero = Double.parseDouble(entrada.substring(posicionNumero, longitudCadena - 1));

                System.out.println("numero = " + numero);
                System.out.println("Parte de la cadena original: " + entrada.substring(0, longitudCadena - 1));
                nuevaEntrada = entrada.substring(0, longitudCadena - 1) + "-" + numero;
            }
        }

        System.out.println("nuevaEntrada = " + nuevaEntrada);
        txtOper.setText(nuevaEntrada);
    }

    public void raizCuadrada()
    {
        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        String entrada = String.valueOf(txtOper.getText());
        String nuevaEntrada = "";

        System.out.println("entrada = " + entrada);
        int longitudCadena = entrada.length();
        String cadena[] = entrada.split("");
        int posicionNumero = 0;
        double numero;
        String numCuadrado = "";

        if( longitudCadena == 1 )
        {
            if( !entrada.equals("+") && !entrada.equals("-") && !entrada.equals("/") && !entrada.equals("x") )
            {
                numero = Double.parseDouble(entrada);
                numCuadrado = "" + Math.sqrt(numero);
                nuevaEntrada = numCuadrado;
                System.out.println("nuevaEntrada = " + nuevaEntrada);
            }
        }
        else if( (cadena[longitudCadena - 1].equals("+") || cadena[longitudCadena - 1].equals("-") ||
                cadena[longitudCadena - 1].equals("x") || cadena[longitudCadena - 1].equals("/")) && longitudCadena
                == 2 )
        {
            for (int i = longitudCadena - 2; i > 0; i--)
            {
                if( cadena[i].equals("+") || cadena[i].equals("-") || cadena[i].equals("x") || cadena[i].equals("/") )
                {
                    posicionNumero = i;
                    break;
                }
            }

            System.out.println("posicionNumero = " + posicionNumero);
            System.out.println("Parte de la cadena: " + entrada.substring(posicionNumero, longitudCadena - 1));
            numero = Double.parseDouble(entrada.substring(posicionNumero, longitudCadena - 1));
            numCuadrado = "" + Math.sqrt(numero);

            System.out.println("numCuadrado = " + numCuadrado);
            System.out.println("Parte de la cadena original: " + entrada.substring(0, posicionNumero + 1));
            nuevaEntrada = entrada.substring(0, posicionNumero + 2) + numCuadrado;
            System.out.println("nuevaEntrada = " + nuevaEntrada);
        }
        // Si el ultimo caracter es un operador, comienza la busqueda del ultimo numero desde la penultima posicion
        else if( cadena[longitudCadena - 1].equals("+") || cadena[longitudCadena - 1].equals("-") ||
                cadena[longitudCadena - 1].equals("x") || cadena[longitudCadena - 1].equals("/") )
        {
            boolean coincidencia = false;
            for (int i = longitudCadena - 2; i > 0; i--)
            {
                if( cadena[i].equals("+") || cadena[i].equals("-") || cadena[i].equals("x") || cadena[i].equals("/") )
                {
                    posicionNumero = i;
                    coincidencia = true;
                    break;
                }
            }

            if( coincidencia )
            {
                System.out.println("posicionNumero = " + posicionNumero);
                System.out.println("Parte de la cadena: " + entrada.substring(posicionNumero + 1, longitudCadena -
                        1));
                numero = Double.parseDouble(entrada.substring(posicionNumero + 1, longitudCadena - 1));
                numCuadrado = "" + Math.sqrt(numero);
                System.out.println("numCuadrado = " + numCuadrado);
                System.out.println("Parte de la cadena original: " + entrada.substring(0, posicionNumero + 1));
                nuevaEntrada = entrada + numCuadrado;
                System.out.println("nuevaEntrada = " + nuevaEntrada);
            }
            else
            {
                System.out.println("ahora si");
                System.out.println("posicionNumero = " + posicionNumero);
                System.out.println("Parte de la cadena: " + entrada.substring(posicionNumero, longitudCadena - 1));
                numero = Double.parseDouble(entrada.substring(posicionNumero, longitudCadena - 1));
                numCuadrado = "" + Math.sqrt(numero);

                System.out.println("numCuadrado = " + numCuadrado);
                System.out.println("Parte de la cadena original: " + entrada.substring(0, posicionNumero + 1));
                nuevaEntrada = entrada + numCuadrado;
                System.out.println("nuevaEntrada = " + nuevaEntrada);
            }

        }
        else // De lo contrario, comienza la busqueda del ultimo numero desde la ultima posicion
        {
            boolean coincidencia = false;
            for (int i = longitudCadena - 1; i > 0; i--)
            {
                if( cadena[i].equals("+") || cadena[i].equals("-") || cadena[i].equals("x") || cadena[i].equals("/") )
                {
                    posicionNumero = i;
                    coincidencia = true;
                    break;
                }
            }

            if( coincidencia )
            {
                System.out.println("posicionNumero = " + posicionNumero);
                System.out.println("Parte de la cadena: " + entrada.substring(posicionNumero + 1, longitudCadena));
                numero = Double.parseDouble(entrada.substring(posicionNumero + 1, longitudCadena));
                numCuadrado = "" + Math.sqrt(numero);

                System.out.println("numCuadrado = " + numCuadrado);
                System.out.println("Parte de la cadena original: " + entrada.substring(0, posicionNumero + 1));
                nuevaEntrada = entrada.substring(0, posicionNumero + 1) + numCuadrado;
                System.out.println("nuevaEntrada = " + nuevaEntrada);
            }
            else // Si no hubo ningun operador, significa que todos los caracteres de la entrada, es un solo numero.
            {
                System.out.println("posicionNumero = " + posicionNumero);
                numero = Double.parseDouble(entrada);
                numCuadrado = "" + Math.sqrt(numero);

                System.out.println("numCuadrado = " + numCuadrado);
                System.out.println("Parte de la cadena original: " + entrada);
                nuevaEntrada = numCuadrado;
                System.out.println("nuevaEntrada = " + nuevaEntrada);
            }
        }

        txtOper.setText(nuevaEntrada);
    }


    public void potenciaCuadratica()
    {
        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        String entrada = String.valueOf(txtOper.getText());
        String nuevaEntrada = "";

        System.out.println("entrada = " + entrada);
        int longitudCadena = entrada.length();
        String cadena[] = entrada.split("");
        int posicionNumero = 0;
        double numero;
        String numCuadrado = "";

        if( longitudCadena == 1 )
        {
            if( !entrada.equals("+") && !entrada.equals("-") && !entrada.equals("/") && !entrada.equals("x") )
            {
                numero = Double.parseDouble(entrada);
                numCuadrado = "" + (numero*numero);
                nuevaEntrada = numCuadrado;
                System.out.println("nuevaEntrada = " + nuevaEntrada);
            }
        }
        else if( (cadena[longitudCadena - 1].equals("+") || cadena[longitudCadena - 1].equals("-") ||
                cadena[longitudCadena - 1].equals("x") || cadena[longitudCadena - 1].equals("/")) && longitudCadena
                == 2 )
        {
            for (int i = longitudCadena - 2; i > 0; i--)
            {
                if( cadena[i].equals("+") || cadena[i].equals("-") || cadena[i].equals("x") || cadena[i].equals("/") )
                {
                    posicionNumero = i;
                    break;
                }
            }

            System.out.println("posicionNumero = " + posicionNumero);
            System.out.println("Parte de la cadena: " + entrada.substring(posicionNumero, longitudCadena - 1));
            numero = Double.parseDouble(entrada.substring(posicionNumero, longitudCadena - 1));
            numCuadrado = "" + (numero*numero);

            System.out.println("numCuadrado = " + numCuadrado);
            System.out.println("Parte de la cadena original: " + entrada.substring(0, posicionNumero + 1));
            nuevaEntrada = entrada.substring(0, posicionNumero + 2) + numCuadrado;
            System.out.println("nuevaEntrada = " + nuevaEntrada);
        }
        // Si el ultimo caracter es un operador, comienza la busqueda del ultimo numero desde la penultima posicion
        else if( cadena[longitudCadena - 1].equals("+") || cadena[longitudCadena - 1].equals("-") ||
                cadena[longitudCadena - 1].equals("x") || cadena[longitudCadena - 1].equals("/") )
        {
            System.out.println("entro a este"); ///////////////
            boolean coincidencia = false;
            for (int i = longitudCadena - 2; i > 0; i--)
            {
                if( cadena[i].equals("+") || cadena[i].equals("-") || cadena[i].equals("x") || cadena[i].equals("/") )
                {
                    posicionNumero = i;
                    coincidencia = true;
                    break;
                }
            }

            if( coincidencia )
            {
                System.out.println("posicionNumero = " + posicionNumero);
                System.out.println("Parte de la cadena: " + entrada.substring(posicionNumero + 1, longitudCadena -
                        1));
                numero = Double.parseDouble(entrada.substring(posicionNumero + 1, longitudCadena - 1));
                numCuadrado = "" + (numero*numero);

                System.out.println("numCuadrado = " + numCuadrado);
                System.out.println("Parte de la cadena original: " + entrada.substring(0, posicionNumero + 1));
                nuevaEntrada = entrada + numCuadrado;
                System.out.println("nuevaEntrada = " + nuevaEntrada);
            }
            else
            {
                System.out.println("ahora si");
                System.out.println("posicionNumero = " + posicionNumero);
                System.out.println("Parte de la cadena: " + entrada.substring(posicionNumero, longitudCadena - 1));
                numero = Double.parseDouble(entrada.substring(posicionNumero, longitudCadena - 1));
                numCuadrado = "" + (numero*numero);

                System.out.println("numCuadrado = " + numCuadrado);
                System.out.println("Parte de la cadena original: " + entrada.substring(0, posicionNumero + 1));
                nuevaEntrada = entrada + numCuadrado;
                System.out.println("nuevaEntrada = " + nuevaEntrada);
            }

        }
        else // De lo contrario, comienza la busqueda del ultimo numero desde la ultima posicion
        {
            boolean coincidencia = false;
            for (int i = longitudCadena - 1; i > 0; i--)
            {
                if( cadena[i].equals("+") || cadena[i].equals("-") || cadena[i].equals("x") || cadena[i].equals("/") )
                {
                    posicionNumero = i;
                    coincidencia = true;
                    break;
                }
            }

            if( coincidencia )
            {
                System.out.println("posicionNumero = " + posicionNumero);
                System.out.println("Parte de la cadena: " + entrada.substring(posicionNumero + 1, longitudCadena));
                numero = Double.parseDouble(entrada.substring(posicionNumero + 1, longitudCadena));
                numCuadrado = "" + (numero*numero);

                System.out.println("numCuadrado = " + numCuadrado);
                System.out.println("Parte de la cadena original: " + entrada.substring(0, posicionNumero + 1));
                nuevaEntrada = entrada.substring(0, posicionNumero + 1) + numCuadrado;
                System.out.println("nuevaEntrada = " + nuevaEntrada);
            }
            else // Si no hubo ningun operador, significa que todos los caracteres de la entrada, es un solo numero.
            {
                System.out.println("posicionNumero = " + posicionNumero);
                numero = Double.parseDouble(entrada);
                numCuadrado = "" + (numero*numero);

                System.out.println("numCuadrado = " + numCuadrado);
                System.out.println("Parte de la cadena original: " + entrada);
                nuevaEntrada = numCuadrado;
                System.out.println("nuevaEntrada = " + nuevaEntrada);
            }

        }

        txtOper.setText(nuevaEntrada);
    }



    public void reciproco()
    {
        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        String entrada = String.valueOf(txtOper.getText());
        String nuevaEntrada = "";

        System.out.println("entrada = " + entrada);
        int longitudCadena = entrada.length();
        String cadena[] = entrada.split("");
        int posicionNumero = 0;
        double numero;
        String numRecip = "";

        if( longitudCadena == 1 )
        {
            if( !entrada.equals("+") && !entrada.equals("-") && !entrada.equals("/") && !entrada.equals("x") )
            {
                numero = Double.parseDouble(entrada);
                numRecip = "1/" + numero;
                nuevaEntrada = numRecip;
                System.out.println("nuevaEntrada = " + nuevaEntrada);
            }
        }
        else if( (cadena[longitudCadena - 1].equals("+") || cadena[longitudCadena - 1].equals("-") ||
                cadena[longitudCadena - 1].equals("x") || cadena[longitudCadena - 1].equals("/")) && longitudCadena
                == 2 )
        {
            for (int i = longitudCadena - 2; i > 0; i--)
            {
                if( cadena[i].equals("+") || cadena[i].equals("-") || cadena[i].equals("x") || cadena[i].equals("/") )
                {
                    posicionNumero = i;
                    break;
                }
            }

            System.out.println("posicionNumero = " + posicionNumero);
            System.out.println("Parte de la cadena: " + entrada.substring(posicionNumero, longitudCadena - 1));
            numero = Double.parseDouble(entrada.substring(posicionNumero, longitudCadena - 1));
            numRecip = "1/" + numero;

            System.out.println("numRecip = " + numRecip);
            System.out.println("Parte de la cadena original: " + entrada.substring(0, posicionNumero + 1));
            nuevaEntrada = entrada.substring(0, posicionNumero + 2) + numRecip;
            System.out.println("nuevaEntrada = " + nuevaEntrada);
        }
        // Si el ultimo caracter es un operador, comienza la busqueda del ultimo numero desde la penultima posicion
        else if( cadena[longitudCadena - 1].equals("+") || cadena[longitudCadena - 1].equals("-") ||
                cadena[longitudCadena - 1].equals("x") || cadena[longitudCadena - 1].equals("/") )
        {
            System.out.println("entro a este"); ///////////////
            boolean coincidencia = false;
            for (int i = longitudCadena - 2; i > 0; i--)
            {
                if( cadena[i].equals("+") || cadena[i].equals("-") || cadena[i].equals("x") || cadena[i].equals("/") )
                {
                    posicionNumero = i;
                    coincidencia = true;
                    break;
                }
            }

            if( coincidencia )
            {
                System.out.println("posicionNumero = " + posicionNumero);
                System.out.println("Parte de la cadena: " + entrada.substring(posicionNumero + 1, longitudCadena -
                        1));
                numero = Double.parseDouble(entrada.substring(posicionNumero + 1, longitudCadena - 1));
                numRecip = "1/" + numero;

                System.out.println("numRecip = " + numRecip);
                System.out.println("Parte de la cadena original: " + entrada.substring(0, posicionNumero + 1));
                nuevaEntrada = entrada + numRecip;
                System.out.println("nuevaEntrada = " + nuevaEntrada);
            }
            else
            {
                System.out.println("ahora si");
                System.out.println("posicionNumero = " + posicionNumero);
                System.out.println("Parte de la cadena: " + entrada.substring(posicionNumero, longitudCadena - 1));
                numero = Double.parseDouble(entrada.substring(posicionNumero, longitudCadena - 1));
                numRecip = "1/" + numero;

                System.out.println("numRecip = " + numRecip);
                System.out.println("Parte de la cadena original: " + entrada.substring(0, posicionNumero + 1));
                nuevaEntrada = entrada + numRecip;
                System.out.println("nuevaEntrada = " + nuevaEntrada);
            }

        }
        else // De lo contrario, comienza la busqueda del ultimo numero desde la ultima posicion
        {
            boolean coincidencia = false;
            for (int i = longitudCadena - 1; i > 0; i--)
            {
                if( cadena[i].equals("+") || cadena[i].equals("-") || cadena[i].equals("x") || cadena[i].equals("/") )
                {
                    posicionNumero = i;
                    coincidencia = true;
                    break;
                }
            }

            if( coincidencia )
            {
                System.out.println("posicionNumero = " + posicionNumero);
                System.out.println("Parte de la cadena: " + entrada.substring(posicionNumero + 1, longitudCadena));
                numero = Double.parseDouble(entrada.substring(posicionNumero + 1, longitudCadena));
                numRecip = "1/" + numero;

                System.out.println("numRecip = " + numRecip);
                System.out.println("Parte de la cadena original: " + entrada.substring(0, posicionNumero + 1));
                nuevaEntrada = entrada.substring(0, posicionNumero + 1) + numRecip;
                System.out.println("nuevaEntrada = " + nuevaEntrada);
            }
            else // Si no hubo ningun operador, significa que todos los caracteres de la entrada, es un solo numero.
            {
                System.out.println("posicionNumero = " + posicionNumero);
                numero = Double.parseDouble(entrada);
                numRecip = "1/" + numero;

                System.out.println("numRecip = " + numRecip);
                System.out.println("Parte de la cadena original: " + entrada);
                nuevaEntrada = numRecip;
                System.out.println("nuevaEntrada = " + nuevaEntrada);
            }

        }

        txtOper.setText(nuevaEntrada);
    }



    public String porcentajeador()
    {

        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        String entrada = String.valueOf(txtOper.getText());
        String nuevaEntrada = "";

        System.out.println("entrada = " + entrada);
        // PORCENTAJEADOR
        int posicionPorcentaje = 0;

        posicionPorcentaje = entrada.lastIndexOf("%");
        if( posicionPorcentaje != -1)
        {

            String cadena[] = entrada.split("");
            int longitudCadena = entrada.length();
            System.out.println("longitudCadena = " + longitudCadena);
            int posicionNumero = 0;
            double numero, multiplicador;

            if( cadena[longitudCadena - 2].equals("+") || cadena[longitudCadena - 2].equals("-") ||
                    cadena[longitudCadena - 2].equals("x") || cadena[longitudCadena - 2].equals("/") )
            {
                System.out.println("si entro a ");
                boolean coincidencia = false;
                for (int i = posicionPorcentaje - 2; i > 0; i--)
                {
                    if( cadena[i].equals("+") || cadena[i].equals("-") || cadena[i].equals("x") || cadena[i].equals("/") )
                    {
                        posicionNumero = i;
                        coincidencia = true;
                        break;
                    }
                }

                if( coincidencia )
                {
                    System.out.println("coincidencia = " + coincidencia);
                    System.out.println("posicionNumero = " + posicionNumero);
                    System.out.println("posicionPorcentaje = " + posicionPorcentaje);
                    System.out.println("Parte de la cadena: " + entrada.substring(posicionNumero + 1,
                            posicionPorcentaje - 1));
                    numero = Double.parseDouble(entrada.substring(posicionNumero + 1, posicionPorcentaje - 1));
                    multiplicador = numero/100;

                    System.out.println("Parte de la cadena que se mandara: " + entrada.substring(0, posicionPorcentaje -
                            1));

                    vaciadorArraylist();
                    extractorOperadoresOperandos(entrada.substring(0, posicionPorcentaje - 1));

                    System.out.println("\n\n\n " );
                    multiDivi();
                    sumaResta();

                    double resultado = operandos.get(0);
                    System.out.println("resultado = " + resultado);
                    System.out.println("resultado*multiplicador = " + resultado*multiplicador);

                    nuevaEntrada = entrada.substring(0, posicionPorcentaje) + resultado*multiplicador;
                    System.out.println("nuevaEntrada " + nuevaEntrada);
                    txtOper.setText(nuevaEntrada);
                    return nuevaEntrada;
                }
                else
                {
                    System.out.println("coincidencia = " + coincidencia);
                    numero = Double.parseDouble(entrada.substring(0, posicionPorcentaje - 1));
                    System.out.println("numero = " + numero);
                    multiplicador = numero/100;

                    nuevaEntrada = "" + entrada.substring(0, posicionPorcentaje) + (numero*multiplicador);
                    System.out.println("nuevaEntrada " + nuevaEntrada);

                    txtOper.setText(nuevaEntrada);
                    return nuevaEntrada;
                }
            }
            else
            {
                boolean coincidencia = false;
                for (int i = posicionPorcentaje; i > 0; i--)
                {
                    if( cadena[i].equals("+") || cadena[i].equals("-") || cadena[i].equals("x") || cadena[i].equals("/") )
                    {
                        posicionNumero = i;
                        coincidencia = true;
                        break;
                    }
                }

                if( coincidencia )
                {
                    System.out.println("posicionNumero = " + posicionNumero);
                    System.out.println("posicionPorcentaje = " + posicionPorcentaje);
                    System.out.println("Parte de la cadena: " + entrada.substring(posicionNumero + 1,
                            posicionPorcentaje));
                    numero = Double.parseDouble(entrada.substring(posicionNumero + 1, posicionPorcentaje));
                    multiplicador = numero/100;

                    System.out.println("Parte de la cadena que se mandara: " + entrada.substring(0, posicionNumero));

                    vaciadorArraylist();
                    extractorOperadoresOperandos(entrada.substring(0, posicionNumero));

                    System.out.println("\n\n\n " );
                    multiDivi();
                    sumaResta();

                    double resultado = operandos.get(0);
                    System.out.println("resultado = " + resultado);
                    System.out.println("resultado*multiplicador = " + resultado*multiplicador);

                    nuevaEntrada = entrada.substring(0, posicionNumero) + cadena[posicionNumero] +
                            resultado*multiplicador;
                    System.out.println("nuevaEntrada " + nuevaEntrada);
                    txtOper.setText(nuevaEntrada);
                    return nuevaEntrada;
                }
                else
                {
                    numero = Double.parseDouble(entrada.substring(0, posicionPorcentaje));
                    multiplicador = numero/100;

                    nuevaEntrada = "" + multiplicador;
                    System.out.println("nuevaEntrada " + nuevaEntrada);

                    txtOper.setText(nuevaEntrada);
                    return nuevaEntrada;
                }
            }
        }
        else
        {
            txtOper.setText(entrada);
            return entrada;
        }


    }


    public void mostrarIgual(){
        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        txtOper.setText("" + operandos.get(0));
    }

    /*public boolean isVacioOperaciones(){
        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        String aux = String.valueOf(txtOper.getText());

        if( aux.isEmpty() )
            return true;
        else
            return false;
    }*/


    public boolean isCeroOper(){
        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        String aux = String.valueOf(txtOper.getText());

        if( aux.equals("0") )
            return true;
        else
            return false;
    }

    public boolean isCeroRes(){
        TextView txtRes = (TextView)findViewById(R.id.txtResultado);

        if( txtRes.getText().equals("0") )
            return true;
        else
            return false;
    }

    public boolean isOperador(){
        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);

        String operaciones[] = String.valueOf(txtOper.getText()).split("");
        int ultima = operaciones.length - 1;

        if( operaciones[ultima].equals("+") || operaciones[ultima].equals("-") || operaciones[ultima].equals("*") ||
                operaciones[ultima].equals("/") )
            return true;
        else
            return false;
    }

    public void agregarNumero(int numero){
        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        txtOper.append("" + numero);
    }

    public void agregarOperador(String operador){
        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        txtOper.append("" + operador);
    }


    public void vaciarRes(){
        TextView txtRes = (TextView)findViewById(R.id.txtResultado);

        txtRes.setText("0");
    }


    public void vaciarResyOper(){
        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        TextView txtRes = (TextView)findViewById(R.id.txtResultado);

        String vacio = "";
        txtOper.setText(vacio);
        txtRes.setText("0");
    }

    public void eliminarUltimoCaracter()
    {
        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        String entrada = String.valueOf(txtOper.getText());
        String numero = "";

        System.out.println("entrada = " + entrada);
        int longitudCadena = entrada.length();
        String cadena[] = entrada.split("");
        String nuevaEntrada = "";

        if( longitudCadena == 1 )
        {
            nuevaEntrada = " ";
            System.out.println("nuevaEntrada = " + nuevaEntrada);
        }
        else
        {
            nuevaEntrada = entrada.substring(0, longitudCadena - 1);
            System.out.println("nuevaEntrada = " + nuevaEntrada);
        }

        txtOper.setText(nuevaEntrada);
    }

    public void vaciadorArraylist()
    {
        // VACIAR ARRAYLIST DE OPERANDOS Y OPERADORES
        while( operandos.size()>0 )
            operandos.remove(0);

        while( operadores.size()>0 )
            operadores.remove(0);
    }

    public void extractorOperadoresOperandos(String cadena){

        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        String entrada = String.valueOf(txtOper.getText());
        String numero = "";

        for(String oper:entrada.split("") ){

            if( oper.equals("+") || oper.equals("-") || oper.equals("x") || oper.equals("/") ){
                operandos.add( Double.parseDouble(numero) );
                operadores.add(oper);
                numero = new String();
            }
            else{
                numero += oper;
                System.out.println("numero = " + numero);
            }
        }
        operandos.add( Double.parseDouble(numero) );
    }


    public void multiDivi(){
        double nuevoNumero = 0;
        int i;
        boolean resp = false;

        for ( i = 0; i < operadores.size(); i++) {
            if( operadores.get(i).equals("x") || operadores.get(i).equals("/") )
            {
                System.out.println("i = " + i);
                resp = true;

                if( operadores.get(i).equals("x") )
                {
                    nuevoNumero = operandos.get(i)*operandos.get(i+1);
                    System.out.println("Los dos numero: " + operandos.get(i) + " " + operandos.get(i+1) );
                }
                else
                {
                    nuevoNumero = operandos.get(i)/operandos.get(i+1);
                }
                break;
            }
        }

        if( resp )
        {
            operadores.remove(i);
            operandos.add(i, nuevoNumero);
            operandos.remove(i + 1);
            operandos.remove(i + 1);

            /*
            operadores.forEach(operador->{
                System.out.println("operador = " + operador);
            });

            operandos.forEach(operando->{
                System.out.println("operando = " + operando);
            });
            */
        }

        if( isMultiDivi() )
            multiDivi();
    }

    public boolean isMultiDivi(){
        boolean resp = false;

        for (int i = 0; i < operadores.size(); i++) {
            if( operadores.get(i).equals("x") || operadores.get(i).equals("/") )
                resp = true;
        }

        return resp;
    }


    public void sumaResta(){
        double nuevoNumero = 0;
        int i;
        boolean resp = false;

        for ( i = 0; i < operadores.size(); i++) {
            if( operadores.get(i).equals("+") || operadores.get(i).equals("-") )
            {
                System.out.println("i = " + i);
                resp = true;

                if( operadores.get(i).equals("+") )
                {
                    nuevoNumero = operandos.get(i) + operandos.get(i+1);
                    System.out.println("Los dos numero: " + operandos.get(i) + " " + operandos.get(i+1) );
                }
                else
                {
                    nuevoNumero = operandos.get(i) - operandos.get(i+1);
                }
                break;
            }
        }

        if( resp )
        {
            operadores.remove(i);
            operandos.add(i, nuevoNumero);
            operandos.remove(i + 1);
            operandos.remove(i + 1);

            /*
            operadores.forEach(operador->{
                System.out.println("operador = " + operador);
            });

            operandos.forEach(operando->{
                System.out.println("operando = " + operando);
            });
            */
        }

        if( isSumaResta() )
            sumaResta();
    }


    public boolean isSumaResta(){
        boolean resp = false;

        for (int i = 0; i < operadores.size(); i++) {
            if( operadores.get(i).equals("+") || operadores.get(i).equals("-") )
                resp = true;
        }

        return resp;
    }

    public void mostrarResultado(){
        TextView txtRes = (TextView)findViewById(R.id.txtResultado);

        txtRes.setText("           ");
        txtRes.setText("= " + operandos.get(0) );
    }

    public void invertirSigno(){
        TextView txtOper = (TextView)findViewById(R.id.txtOperaciones);
        String entrada = String.valueOf(txtOper.getText());
        String aux[] = entrada.split("");
        String cadena2 = "";

        int ultimoMas = entrada.lastIndexOf("+"), ultimoMenos = entrada.lastIndexOf("-");
        int ultimo, tamano = aux.length;
        boolean mas = false;

        if( ultimoMas == -1 && ultimoMenos == -1 ){
            cadena2 += "-" + entrada;
        }
        else
        {
            System.out.println("ultimoMas = " + ultimoMas);
            System.out.println("ultimoMenos = " + ultimoMenos);

            if( ultimoMas > ultimoMenos)
            {
                ultimo = ultimoMas;
                mas = true;
            }
            else
                ultimo = ultimoMenos;

            cadena2 += entrada.substring(0, ultimo);

            if( mas ){
                cadena2 += "-" + entrada.substring(ultimo + 1, tamano);
            }
            else{
                cadena2 += "+" + entrada.substring(ultimo + 1, tamano);
            }
        }
        System.out.println("cadena2 = " + cadena2);

        txtOper.setText("           ");
        txtOper.setText(cadena2);
    }
}