import logo from '../../assets/img/logo.svg';
import './styles.css';

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="LogoDSMeta" />
                <h1>Sales Viewer</h1>
                <p>Projeto desenvolvido em Spring Boot e React-TS</p>
                <p>
                    Desenvolvido por
                    <a href="https://www.instagram.com/digospaim">@digospaim</a>
                </p>
            </div>
        </header>
    )
}

export default Header;