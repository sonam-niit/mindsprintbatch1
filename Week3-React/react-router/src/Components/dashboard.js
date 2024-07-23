import { Link, Route, Routes } from "react-router-dom";

function Profile() {
    return (<h1>Profile Component</h1>)
}
function Settings() {
    return (<h1>Setting Component</h1>)
}
function Dashboard() {
    return (
        <div>
            <h3>Dashboard Component</h3>
            <nav>
                <ul className="nav nav-tabs">
                    <li className="nav-item">
                        <Link to='profile' className="nav-link">Profile</Link>
                    </li>
                    <li className="nav-item">
                        <Link to='settings' className="nav-link">Setting</Link>
                    </li>
                </ul>
            </nav>
            <Routes>
                <Route path="profile" element={<Profile />} />
                <Route path="settings" element={<Settings />} />
            </Routes>
        </div>
    );
}

export default Dashboard;