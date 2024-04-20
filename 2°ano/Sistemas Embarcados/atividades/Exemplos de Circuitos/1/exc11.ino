// C++ code
//
int valor;
  
void setup()
{
  Serial.begin(9600);
}

void loop()
{
  valor = analogRead(A0);
  Serial.print("Valor = ");
  Serial.println(valor);
  delay(250);
}