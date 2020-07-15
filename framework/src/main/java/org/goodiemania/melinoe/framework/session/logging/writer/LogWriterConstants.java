package org.goodiemania.melinoe.framework.session.logging.writer;

public class LogWriterConstants {
    public static final String HTML_HEAD = "\n"
            + "<!doctype html>\n"
            + "<html lang=\"en\"><head>\n"
            + "    <meta charset=\"utf-8\">\n"
            + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n"
            + "    <meta name=\"description\" content=\"\">\n"
            + "    <meta name=\"author\" content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\n"
            + "    <meta name=\"generator\" content=\"Jekyll v3.8.5\">\n"
            + "    <title>Melinoe logs</title>\n"
            + "\n"
            + "    <!-- Bootstrap core CSS -->\n"
            + "    <link href=\"https://getbootstrap.com/docs/4.5/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n"
            + "\n"
            + "\n"
            + "    <style>\n"
            + "        .bd-placeholder-img {\n"
            + "            font-size: 1.125rem;\n"
            + "            text-anchor: middle;\n"
            + "            -webkit-user-select: none;\n"
            + "            -moz-user-select: none;\n"
            + "            -ms-user-select: none;\n"
            + "            user-select: none;\n"
            + "        }\n"
            + "\n"
            + "        @media (min-width: 768px) {\n"
            + "            .bd-placeholder-img-lg {\n"
            + "                font-size: 3.5rem;\n"
            + "            }\n"
            + "        }\n"
            + "    </style>\n"
            + "    <!-- Custom styles for this template -->\n"
            + "    <link href=\"https://getbootstrap.com/docs/4.5/examples/offcanvas/offcanvas.css\" rel=\"stylesheet\">\n"
            + "</head>\n"
            + "<body class=\"bg-light\">\n"
            + "<nav class=\"navbar navbar-expand-lg fixed-top navbar-dark bg-dark\">\n"
            + "    <a class=\"navbar-brand mr-auto mr-lg-0\" href=\"#\">Melinoe test logs</a>\n"
            + "</nav>\n"
            + "\n"
            + "<main role=\"main\" class=\"container\">\n"
            + "    <div class=\"d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded shadow-sm\">\n"
            + "        <img class=\"mr-3\" src=\"https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-outline.svg\" alt=\"\" width=\"48\" height=\"48\">\n"
            + "        <div class=\"lh-100\">\n"
            + "            <h6 class=\"mb-0 text-white lh-100\">Melinoe</h6>\n"
            + "            <small>Since 2020</small>\n"
            + "        </div>\n"
            + "    </div>"
            + "    <div class=\"my-3 p-3 bg-white rounded shadow-sm\">\n"
            + "        <h6 class=\"border-bottom border-gray pb-2 mb-0\">Log results</h6>";
    public static final String HTML_FOOTER = "\n"
            + "</div>\n"
            + "</main>\n"
            + "<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n"
            + "<script>window.jQuery || document.write('<script src=\"https://getbootstrap.com/docs/4.5/assets/js/vendor/jquery.slim.min.js\"><\\/script>')</script>\n"
            + "<script src=\"https://getbootstrap.com/docs/4.5/dist/js/bootstrap.bundle.min.js\"></script>\n"
            + "<script src=\"https://getbootstrap.com/docs/4.5/examples/offcanvas/offcanvas.js\"></script>\n"
            + "\n"
            + "</body></html>";
    public static final String INDIVIDUAL_SECTION_HTML = "\n"
            + "        <a href=\"%s\">"
            + "        <div class=\"media text-muted pt-3\">\n"
            + "            <svg class=\"bd-placeholder-img mr-2 rounded\" width=\"32\" height=\"32\" xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\" role=\"img\" aria-label=\"Placeholder: 32x32\"><title>Placeholder</title><rect width=\"100%%\" height=\"100%%\" fill=\"%s\"></rect><text x=\"50%%\" y=\"50%%\" fill=\"#007bff\" dy=\".3em\"></text></svg>\n"
            + "            <p class=\"media-body pb-3 mb-0 small lh-125 border-bottom border-gray\">\n"
            + "                <strong class=\"d-block text-gray-dark\">%s</strong>\n"
            + "                %s \n"
            + "            </p>\n"
            + "        </div>"
            + "        </a>";
    public static final String INDIVIDUAL_SECTION_LOG_HTML = "\n"
            + "        <div class=\"media text-muted pt-3 border-bottom border-gray container\">\n"
            + "            <p class=\"media-body pb-3 mb-0 small lh-125 col-sm-3\">\n"
            + "                %s\n"
            + "            </p>\n"
            + "            <p class=\"media-body pb-3 mb-0 small lh-125 col-sm-6\">\n"
            + "                %s\n"
            + "            </p>\n"
            + "            <p class=\"media-body pb-3 mb-0 small lh-125 col-sm-3\">\n"
            + "                %s\n"
            + "            </p>\n"
            + "        </div>";
    public static final String INDIVIDUAL_SECTION_HIDDEN_LOG_HTML = "\n"
            + "<div class=\"media text-muted pt-3 border-bottom border-gray container\" data-toggle=\"collapse\"\n"
            + "             data-target=\"#%s\" aria-expanded=\"true\" aria-controls=\"collapseOne\">\n"
            + "            <p class=\"media-body pb-3 mb-0 small lh-125 col-sm-3\">\n"
            + "                %s\n"
            + "            </p>\n"
            + "            <div class=\"media-body pb-3 mb-0 small lh-125 col-sm-6\">\n"
            + "                %s\n"
            + "            </div>\n"
            + "            <p class=\"media-body pb-3 mb-0 small lh-125 col-sm-3\">"
            + "                %s\n"
            + "            </p>\n"
            + "        </div>\n"
            + "        <div id=\"%s\" class=\"media text-muted pt-3 border-bottom border-gray container collapse\">\n"
            + "            <p class=\"media-body pb-3 mb-0 small lh-125 col-sm-12\">\n"
            + "                %s\n"
            + "            </p>\n"
            + "        </div>";
}
