import BarChar from "components/BarChar";
import DataTable from "components/DataTable";
import DonutChar from "components/DonutChar";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

const Home = () => {
    return (
        <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-3">Dashboard de vendas</h1>

        <div className="row px-3">
          <div className="col sm-6">
            <h5 className="text-center text-secundary">Taxa de sucessos (%)</h5>
            <BarChar />
          </div>
          <div className="col sm-6">
            <h5 className="text-center text-secundary">Taxa de sucessos (%)</h5>
            <DonutChar />
          </div>

          <div className="py-3">
            <h2 className="text-primary">Todas as Vendas</h2>
          </div>

        </div>

        <DataTable />
      </div>
      <Footer />
    </>
    );
}

export default Home;
