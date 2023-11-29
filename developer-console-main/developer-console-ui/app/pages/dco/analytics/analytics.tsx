import React from 'react';

const Analytics = ({ path }: any) => {
    const sumoImage = '/Vehicle-Trajectories.png';
    const PowSyblImage = '/image.png';

    return (
        <div className="image-container">
            <div className="image-wrapper">
                <img src={sumoImage} alt="Sumo" className="image" />
            </div>
            <div className="image-wrapper">
                <img src={PowSyblImage} alt="PowSybl" className="image" />
            </div>
        </div>
    );
};

export default Analytics;
