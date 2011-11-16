import ibmv.Operatividad

class BootStrap {

    def init = { servletContext ->

        Operatividad oper = new Operatividad()

        oper.idMercado = 'MD'
        oper.idTipoDerivado = 'FT'
        oper.idTipoValor = 'FD'
        oper.idEmisora = 'DOLAR'
        oper.interesAbierto = 346436
        oper.importeNocional = 274484620
        oper.importePrimas = 274484620
        oper.volumenOperado = 2014
        oper.numeroOperaciones = 4

        oper.save()


        oper = new Operatividad()

        oper.idMercado = 'MD'
        oper.idTipoDerivado = 'FT'
        oper.idTipoValor = 'FB'
        oper.idEmisora = 'M20'
        oper.interesAbierto = 30888
        oper.importeNocional = 143765250
        oper.importePrimas = 143765250
        oper.volumenOperado = 1250
        oper.numeroOperaciones = 13

        oper.save()

        oper = new Operatividad()

        oper.idMercado = 'MD'
        oper.idTipoDerivado = 'FT'
        oper.idTipoValor = 'FI'
        oper.idEmisora = 'IPC'
        oper.interesAbierto = 93897
        oper.importeNocional = 406104050
        oper.importePrimas = 406104050
        oper.volumenOperado = 1098
        oper.numeroOperaciones = 286

        oper.save()

        oper = new Operatividad()

        oper.idMercado = 'MD'
        oper.idTipoDerivado = 'OP'
        oper.idTipoValor = 'OI'
        oper.idEmisora = 'IPC'
        oper.interesAbierto = 16529
        oper.importeNocional = 2880000
        oper.importePrimas = 2880000
        oper.volumenOperado = 8
        oper.numeroOperaciones = 2

        oper.save()

    }

    def destroy = {
    }
}
