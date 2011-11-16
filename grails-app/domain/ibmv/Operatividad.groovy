package ibmv

class Operatividad {

    static expose = 'operatividad'

    static constraints = {
    }
    
    String idMercado
    String idTipoDerivado
    String idTipoValor
    String idEmisora
    BigDecimal interesAbierto = 0
    BigDecimal importeNocional = 0
    BigDecimal importePrimas = 0
    BigInteger volumenOperado = 0
    BigInteger numeroOperaciones = 0
    
}
