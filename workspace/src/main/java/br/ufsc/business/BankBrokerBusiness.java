package br.ufsc.business;

import br.ufsc.classes.Thing;
import br.ufsc.model.InvestmentLiquidity;
import br.ufsc.model.InvestmentRange;
import br.ufsc.model.InvestmentTime;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.*;
import org.apache.jena.util.FileManager;
import org.apache.jena.vocabulary.VCARD;

/**
 * @author Maciel Hogenn e Osmar de Oliveira Braz Júnior
 * @since 1.0.0-SNAPSHOT
 */

public class BankBrokerBusiness {

    /**
     * The IRI with the model model.
     *
     * @var SOURCE_URL
     * @type String
     */
    public final String SOURCE_URL = "http://www.semanticweb.org/admin/ontologies/2017/4/untitled-ontology-8";

    /**
     * The file with the model model.
     *
     * @var SOURCE_FILE
     * @type String
     */
    public final String SOURCE_FILE = "ontology/aplicacaoFinanceiraRDF.owl";

    /**
     * The namespace of the model.
     *
     * @var NS
     * @type String
     */
    public final String NS = SOURCE_URL + "#";

    public OntModel model;

    private static BankBrokerBusiness instance;

    public static BankBrokerBusiness getInstance() {
        if (instance == null) instance = new BankBrokerBusiness();

        return instance;
    }

    private BankBrokerBusiness() {
        OntModel model = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);

        loadModel(model);
    }

    private void loadModel(OntModel model) {
        FileManager.get().getLocationMapper().addAltEntry(SOURCE_URL, SOURCE_FILE);
        Model baseOntology = FileManager.get().loadModel(SOURCE_URL);
        model.addSubModel(baseOntology);

        // for compactness, add a prefix declaration st
        model.setNsPrefix("st", NS);

        this.model = model;
    }

    public final String filter(InvestmentRange investmentRange, InvestmentTime investmentTime, InvestmentLiquidity investmentLiquidity) {

        OntClass financialApplication = model.getOntClass(String.join("", NS, Thing.FINANCIAL_APPLICATION));
        OntClass financialInstitution = model.getOntClass(String.join("", NS, Thing.FINANCIAL_INSTITUTION));
        OntClass applicator = model.getOntClass(String.join("", NS, Thing.APPLICATOR));
        OntClass investorProfile = model.getOntClass(String.join("", NS, Thing.INVESTOR_PROFILE));

        financialApplication.listSubClasses().forEachRemaining((subClass) -> {
            System.out.println(subClass);
            subClass.listInstances().forEachRemaining((instace) -> {
                System.out.println("          Instance: " + instace.getLocalName());
            });
        });

//        StmtIterator iter = model.listStatements(
//                new SimpleSelector(null, VCARD.ADRPROPERTIES, (RDFNode) null) {
//                            public boolean selects(Statement s) {
//                                System.out.println(s);
////                                return (subject == null || s.getSubject().equals(subject))
////                                        && (predicate == null || s.getPredicate().equals(predicate))
////                                        && (object == null || s.getObject().equals(object));
//
//                                return true;
//                            }
//                        });



        return "";
}

}
