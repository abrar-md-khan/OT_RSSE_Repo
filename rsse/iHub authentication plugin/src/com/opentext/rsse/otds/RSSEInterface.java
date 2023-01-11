package com.opentext.rsse.otds;

import java.io.IOException;

import org.apache.axis2.AxisFault;
import org.xml.sax.SAXException;

/**
 * RSSEInterface java skeleton interface for the axisService
 */
public interface RSSEInterface
{

	com.actuate.schemas.actuate11.rsse.GetTranslatedUserNamesResponseE getTranslatedUserNames(String volume,
																																														com.actuate.schemas.actuate11.rsse.GetTranslatedUserNamesE getTranslatedUserNames) throws AxisFault;

	com.actuate.schemas.actuate11.rsse.StopResponseE stop(com.actuate.schemas.actuate11.rsse.StopE stop) throws AxisFault;

	com.actuate.schemas.actuate11.rsse.AuthenticateResponseE authenticate(String volume,
																																				com.actuate.schemas.actuate11.rsse.AuthenticateE authenticate) throws AxisFault;

	com.actuate.schemas.actuate11.rsse.SelectUsersResponseE selectUsers(String volume,
																																			com.actuate.schemas.actuate11.rsse.SelectUsersE selectUsers) throws AxisFault;

	com.actuate.schemas.actuate11.rsse.GetConnectionPropertiesResponseE getConnectionProperties(com.actuate.schemas.actuate11.rsse.GetConnectionPropertiesE getConnectionProperties) throws AxisFault;

	com.actuate.schemas.actuate11.rsse.GetUsersToNotifyResponseE getUsersToNotify(String volume,
																																								com.actuate.schemas.actuate11.rsse.GetUsersToNotifyE getUsersToNotify) throws AxisFault;

	com.actuate.schemas.actuate11.rsse.DoesUserExistResponseE doesUserExist(String volume,
																																					com.actuate.schemas.actuate11.rsse.DoesUserExistE doesUserExist) throws AxisFault;

	com.actuate.schemas.actuate11.rsse.StartResponseE start(com.actuate.schemas.actuate11.rsse.StartE start) throws AxisFault;

	com.actuate.schemas.actuate11.rsse.PassThroughResponseE passThrough(com.actuate.schemas.actuate11.rsse.PassThroughE passThrough) throws AxisFault;

	com.actuate.schemas.actuate11.rsse.SelectGroupsResponseE selectGroups(String volume,
																																				com.actuate.schemas.actuate11.rsse.SelectGroupsE selectGroups) throws AxisFault;

	com.actuate.schemas.actuate11.rsse.DoesRoleExistResponseE doesRoleExist(String volume,
																																					com.actuate.schemas.actuate11.rsse.DoesRoleExistE doesRoleExist) throws AxisFault;

	com.actuate.schemas.actuate11.rsse.SelectRolesResponseE selectRoles(String volume,
																																			com.actuate.schemas.actuate11.rsse.SelectRolesE selectRoles) throws AxisFault,
																																																																	 SAXException,
																																																																	 IOException;

	com.actuate.schemas.actuate11.rsse.GetUserPropertiesResponseE getUserProperties(String volume,
																																									com.actuate.schemas.actuate11.rsse.GetUserPropertiesE getUserProperties) throws AxisFault;

	com.actuate.schemas.actuate11.rsse.DoesGroupExistResponseE doesGroupExist(String volume,
																																						com.actuate.schemas.actuate11.rsse.DoesGroupExistE doesGroupExist) throws AxisFault;

	com.actuate.schemas.actuate11.rsse.GetTranslatedRoleNamesResponseE getTranslatedRoleNames(String volume,
																																														com.actuate.schemas.actuate11.rsse.GetTranslatedRoleNamesE getTranslatedRoleNames) throws AxisFault;

	com.actuate.schemas.actuate11.rsse.GetUserACLResponseE getUserACL(String volume,
																																		com.actuate.schemas.actuate11.rsse.GetUserACLE getUserACL) throws AxisFault;

}
