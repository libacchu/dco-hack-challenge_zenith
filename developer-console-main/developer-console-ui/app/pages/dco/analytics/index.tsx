import { Box } from '@dco/sdv-ui'
import Dco from '..'
import ReleaseManagementList from '../release_management/releaseManagementList'
import Analytics from "./analytics";

// scenario listing table
const AnalyticsIndex = (args: any) => {
  return (<Dco>
    <Box fullHeight scrollY>
      <Analytics></Analytics>
    </Box>
  </Dco>)
}

export default AnalyticsIndex
