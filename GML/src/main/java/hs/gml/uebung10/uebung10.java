package main.java.hs.gml.uebung10;

import weka.classifiers.Evaluation;
import weka.classifiers.functions.MultilayerPerceptron;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

import java.util.Random;


public class uebung10 {
    public static void main(String[] args) throws Exception {

        ConverterUtils.DataSource source;

        source = new ConverterUtils.DataSource("GML/src/main/resources/uebung10.csv");
        Instances data = source.getDataSet();
        System.out.println("data = " + data);



        double[] learnRates = new double[]{0.001, 0.003, 0.01, 0.03, 0.1, 0,3};
        int[] hiddenLayers = new int[]{1, 2, 3, 4};

        for (int hiddenLayer : hiddenLayers) {
            for(double learnRate : learnRates){
                MultilayerPerceptron mlp = new MultilayerPerceptron();
                mlp.setLearningRate(learnRate);
                mlp.setHiddenLayers(hiddenLayer);

                System.out.println("mlp = " + mlp);

                Evaluation eval = new Evaluation(data);
                Random rnd = new Random(42);

                eval.crossValidateModel(mlp, data, 5, rnd);

                System.out.println("H: " + hiddenLayer + " : Acc=" + eval.pctCorrect() + " : learnRate=" + learnRate);
            }
        }


    }
}
