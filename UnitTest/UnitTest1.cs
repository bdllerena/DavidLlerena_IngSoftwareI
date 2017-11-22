
using Microsoft.VisualStudio.TestTools.UnitTesting;
using EspePocket;
using EspePocket.Droid;
using EspePocket.Pages;

namespace UnitTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void UriTest1()
        {
            CustomWebView varEsperado = new CustomWebView
             {
                 Uri = "http://google.com"
             };
             var valorEsperado = varEsperado.Uri;
             CustomWebView varActual = new CustomWebView
             {
                 Uri = "http://google.com"
             };
             var valorActual = varActual.Uri;
             Assert.AreEqual(valorActual, valorEsperado);

        }
        [TestMethod]
        public void UriTest2()
        {
            /*CustomWebView operation = new CustomWebView
            {
                Uri = "http://google.com"
            };
            var valorActual = operation.Uri;
            Uri valorEsperado = new Uri("http://google.com");
            Assert.AreEqual(valorActual, valorEsperado);*/
            CustomWebView varEsperado = new CustomWebView
            {
                Uri = ""
            };
            var valorEsperado = varEsperado.Uri;
            CustomWebView varActual = new CustomWebView
            {
                Uri = ""
            };
            var valorActual = varActual.Uri;
            Assert.AreEqual(valorActual, valorEsperado);

        }
        [TestMethod]
        public void MaxLengthTest1()
        {
            MaxLengthValidator operation = new MaxLengthValidator();
            int valorActual;
            valorActual = operation.MaxLength = 10;
            int valorEsperado = 10;
            Assert.AreEqual(valorActual, valorEsperado);
        }
        [TestMethod]
        public void MaxLengthTest2()
        {
            MaxLengthValidator operation = new MaxLengthValidator();
            int valorActual;
            valorActual = operation.MaxLength;
            int valorEsperado = 0;
            Assert.AreEqual(operation.MaxLength, valorEsperado);
        }
        [TestMethod]
        public void MaxLengthTest3()
        {
            MaxLengthValidator operation = new MaxLengthValidator();
            int valorActual;
            valorActual = operation.MaxLength = 0;
            int valorEsperado = 0;
            Assert.AreEqual(operation.MaxLength, valorEsperado);
        }
        [TestMethod]
        public void MaxLengthTest4()
        {
            MaxLengthValidator operation = new MaxLengthValidator();
            int valorActual;
            valorActual = operation.MaxLength = -1;
            int valorEsperado = 0;
            Assert.AreEqual(operation.MaxLength, valorEsperado);
        }
        [TestMethod]
        public void MaxLengthTest5()
        {
            MaxLengthValidator operation = new MaxLengthValidator();
            int valorActual;
            valorActual = operation.MaxLength = (int) 15.5;
            int valorEsperado = 15;
            Assert.AreEqual(operation.MaxLength, valorEsperado);
        }
        [TestMethod]
        public void CalcularTest1()
        {

            Calcular operation = new Calcular();
            double valorActual;
            valorActual = operation.Calculo(21,22,23);
            double valorEsperado = 0;
            Assert.AreEqual(valorActual, valorEsperado);
        }
        [TestMethod]
        public void CalcularTest2()
        {

            Calcular operation = new Calcular();
            double valorActual;
            valorActual = operation.Calculo(20,20,20);
            double valorEsperado = 20;
            Assert.AreEqual(valorActual, valorEsperado);
        }
        [TestMethod]
        public void CalcularTest3()
        {

            Calcular operation = new Calcular();
            double valorActual;
            valorActual = operation.Calculo(-1, -1, -1.2);
            double valorEsperado = 0;
            Assert.AreEqual(valorActual, valorEsperado);
        }
        [TestMethod]
        public void CalcularTest4()
        {

            Calcular operation = new Calcular();
            double valorActual;
            valorActual = operation.Calculo(15.555,16.3,18.6666);
            double valorEsperado = 17;
            Assert.AreEqual(valorActual, valorEsperado);
        }
        [TestMethod]
        public void CalcularTest5()
        {

            Calcular operation = new Calcular();
            double valorActual;
            valorActual = operation.Calculo(-1,20,13.2222);
            double valorEsperado = 0;
            Assert.AreEqual(valorActual, valorEsperado);
        }
    }
}
