/*
 * 
 */
package mdn.diagram.edit.policies;

import java.util.Iterator;

import mdn.diagram.edit.commands.AppAppToNetworkNodeCreateCommand;
import mdn.diagram.edit.commands.AppAppToNetworkNodeReorientCommand;
import mdn.diagram.edit.commands.AppControllerAppCreateCommand;
import mdn.diagram.edit.commands.AppControllerAppReorientCommand;
import mdn.diagram.edit.commands.SwitchSwitchControllerCreateCommand;
import mdn.diagram.edit.commands.SwitchSwitchControllerReorientCommand;
import mdn.diagram.edit.parts.AppAppToNetworkNodeEditPart;
import mdn.diagram.edit.parts.AppControllerAppEditPart;
import mdn.diagram.edit.parts.SwitchSwitchControllerEditPart;
import mdn.diagram.part.MdnVisualIDRegistry;
import mdn.diagram.providers.MdnElementTypes;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ControllerItemSemanticEditPolicy extends
		MdnBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ControllerItemSemanticEditPolicy() {
		super(MdnElementTypes.Controller_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (MdnVisualIDRegistry.getVisualID(incomingLink) == SwitchSwitchControllerEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MdnVisualIDRegistry.getVisualID(incomingLink) == AppAppToNetworkNodeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MdnVisualIDRegistry.getVisualID(incomingLink) == AppControllerAppEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (MdnElementTypes.SwitchSwitchController_4006 == req.getElementType()) {
			return null;
		}
		if (MdnElementTypes.AppAppToNetworkNode_4030 == req.getElementType()) {
			return null;
		}
		if (MdnElementTypes.AppControllerApp_4031 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (MdnElementTypes.SwitchSwitchController_4006 == req.getElementType()) {
			return getGEFWrapper(new SwitchSwitchControllerCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MdnElementTypes.AppAppToNetworkNode_4030 == req.getElementType()) {
			return getGEFWrapper(new AppAppToNetworkNodeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MdnElementTypes.AppControllerApp_4031 == req.getElementType()) {
			return getGEFWrapper(new AppControllerAppCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case SwitchSwitchControllerEditPart.VISUAL_ID:
			return getGEFWrapper(new SwitchSwitchControllerReorientCommand(req));
		case AppAppToNetworkNodeEditPart.VISUAL_ID:
			return getGEFWrapper(new AppAppToNetworkNodeReorientCommand(req));
		case AppControllerAppEditPart.VISUAL_ID:
			return getGEFWrapper(new AppControllerAppReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
