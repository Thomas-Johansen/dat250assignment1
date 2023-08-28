/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package no.hvl.dat250.thomas.exp1;

import io.javalin.Javalin;

import static no.hvl.dat250.thomas.exp1.Webpage.*;

public class App {
    private static final double IN_TO_METER = 0.0254;
    private static final double FT_TO_METER = 0.3048;
    private static final double MI_TO_METER = 1609.344;


    public static void main(String[] args) {
        Javalin.create()
                .get("/", ctx -> {
                    ctx.html(WEBPAGE);
                })
                .post("/convert", ctx -> {
                    double value = Double.parseDouble(ctx.formParam("value"));
                    String fromUnit = ctx.formParam("sunit");
                    String toUnit = ctx.formParam("tunit");

                    double result = Converter.convert(value, fromUnit, toUnit);

                    ctx.result(Double.toString(result));
                })
                .start(9000);
    }


}