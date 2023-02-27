package section04_JavaCore.topic23_Logger.theory.T04_LogLevels;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import section04_JavaCore.topic23_Logger.theory.T04_LogLevels.exception.AuthenticationException;

public class Main {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);

    public static void main(String[] args) {
        // Logging
        logger.fatal("I'm fatal message!");
        AuthenticationService authenticationService = new AuthenticationServiceImpl();
        try {
            authenticationService.login("bill", "12354");
        } catch (AuthenticationException e) {
            logger.error("Can't login", e);
        }
        // LOG levels
        /*
            OFF - всё равно, что не добавлять логгер в проект
            FATAL - серьёзная ошибка, использовать для отлова банальных ошибок не рекомендуется
            ERROR - когда есть ошибки, но ещё не нарушающие процесс работы программы. Например отклонённый платёж банка из-за нехватки средств
            WARN - когда что-то пошло не так, но это не ошибка. Часто встречается при использовании старых библиотек или deprecated-методов
            INFO - если надо вывести инфу, например "вот это действие выполнено с такими-то параметрами или результатом"
            DEBUG - когда нужно отдебажить какую-то ошибку
            TRACE - так же, как у debug
            ALL - логгирует абсолютно всё, лучше всего ставить перезатирание раз в день или два, чтобы не засорять винт
         */
    }
}
