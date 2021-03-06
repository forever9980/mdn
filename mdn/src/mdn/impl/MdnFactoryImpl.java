/**
 */
package mdn.impl;

import mdn.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MdnFactoryImpl extends EFactoryImpl implements MdnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MdnFactory init() {
		try {
			MdnFactory theMdnFactory = (MdnFactory)EPackage.Registry.INSTANCE.getEFactory(MdnPackage.eNS_URI);
			if (theMdnFactory != null) {
				return theMdnFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MdnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdnFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MdnPackage.SDN: return createSdn();
			case MdnPackage.CONTROLLER: return createController();
			case MdnPackage.HOST: return createHost();
			case MdnPackage.SWITCH: return createSwitch();
			case MdnPackage.OPEN_FLOW_SWITCH: return createOpenFlowSwitch();
			case MdnPackage.RULE: return createRule();
			case MdnPackage.APP: return createApp();
			case MdnPackage.CONDITION: return createCondition();
			case MdnPackage.TRAFFIC: return createTraffic();
			case MdnPackage.TIME: return createTime();
			case MdnPackage.PACKET_HEADER: return createPacketHeader();
			case MdnPackage.APP_MONITOR: return createAppMonitor();
			case MdnPackage.FLOW: return createFlow();
			case MdnPackage.GROUP: return createGroup();
			case MdnPackage.INSTRUCTION: return createInstruction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MdnPackage.PACKET_HEADERS:
				return createPacketHeadersFromString(eDataType, initialValue);
			case MdnPackage.ACTIONS:
				return createActionsFromString(eDataType, initialValue);
			case MdnPackage.CONDITIONS:
				return createConditionsFromString(eDataType, initialValue);
			case MdnPackage.RELATIONAL_OPERATORS:
				return createRelationalOperatorsFromString(eDataType, initialValue);
			case MdnPackage.APP_MONITOR_PROTOCOLS:
				return createAppMonitorProtocolsFromString(eDataType, initialValue);
			case MdnPackage.CONTROLLER_TYPES:
				return createControllerTypesFromString(eDataType, initialValue);
			case MdnPackage.INSTRUCTIONS:
				return createInstructionsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MdnPackage.PACKET_HEADERS:
				return convertPacketHeadersToString(eDataType, instanceValue);
			case MdnPackage.ACTIONS:
				return convertActionsToString(eDataType, instanceValue);
			case MdnPackage.CONDITIONS:
				return convertConditionsToString(eDataType, instanceValue);
			case MdnPackage.RELATIONAL_OPERATORS:
				return convertRelationalOperatorsToString(eDataType, instanceValue);
			case MdnPackage.APP_MONITOR_PROTOCOLS:
				return convertAppMonitorProtocolsToString(eDataType, instanceValue);
			case MdnPackage.CONTROLLER_TYPES:
				return convertControllerTypesToString(eDataType, instanceValue);
			case MdnPackage.INSTRUCTIONS:
				return convertInstructionsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sdn createSdn() {
		SdnImpl sdn = new SdnImpl();
		return sdn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Host createHost() {
		HostImpl host = new HostImpl();
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App createApp() {
		AppImpl app = new AppImpl();
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Traffic createTraffic() {
		TrafficImpl traffic = new TrafficImpl();
		return traffic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacketHeader createPacketHeader() {
		PacketHeaderImpl packetHeader = new PacketHeaderImpl();
		return packetHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenFlowSwitch createOpenFlowSwitch() {
		OpenFlowSwitchImpl openFlowSwitch = new OpenFlowSwitchImpl();
		return openFlowSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppMonitor createAppMonitor() {
		AppMonitorImpl appMonitor = new AppMonitorImpl();
		return appMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction createInstruction() {
		InstructionImpl instruction = new InstructionImpl();
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacketHeaders createPacketHeadersFromString(EDataType eDataType, String initialValue) {
		PacketHeaders result = PacketHeaders.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPacketHeadersToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actions createActionsFromString(EDataType eDataType, String initialValue) {
		Actions result = Actions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conditions createConditionsFromString(EDataType eDataType, String initialValue) {
		Conditions result = Conditions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperators createRelationalOperatorsFromString(EDataType eDataType, String initialValue) {
		RelationalOperators result = RelationalOperators.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationalOperatorsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppMonitorProtocols createAppMonitorProtocolsFromString(EDataType eDataType, String initialValue) {
		AppMonitorProtocols result = AppMonitorProtocols.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppMonitorProtocolsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerTypes createControllerTypesFromString(EDataType eDataType, String initialValue) {
		ControllerTypes result = ControllerTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControllerTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions createInstructionsFromString(EDataType eDataType, String initialValue) {
		Instructions result = Instructions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstructionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdnPackage getMdnPackage() {
		return (MdnPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MdnPackage getPackage() {
		return MdnPackage.eINSTANCE;
	}

} //MdnFactoryImpl
