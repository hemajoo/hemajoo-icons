package com.hemajoo.media.icon.collection.idea;

import lombok.Getter;
import lombok.NonNull;

import java.util.Map;

public enum IconCollectionIdea implements IconCollectionItemAware
{
    /**
     * Special entry each enumeration of icon collection should have!
     */
    ALL(IconCollectionIdeaCategory.ALL, null),

    ANNOTATE(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/annotate.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/annotate_dark.svg")
    ),

    ADD_FILE(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/addFile.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/addFile_dark.svg")
    ),

    ADD_LIST(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/addList.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/addList_dark.svg")
    ),

    ADD_MULTICARET(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/addMulticaret.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/addMulticaret_dark.svg")
    ),

    ADD_TO_DICTIONARY(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/addToDictionary.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/addToDictionary_dark.svg")
    ),

    ARROW_COLLAPSE(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/arrowCollapse.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/arrowCollapse_dark.svg")
    ),

    ARROW_EXPAND(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/arrowExpand.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/arrowExpand_dark.svg")
    ),

    BACK(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/back.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/back_dark.svg")
    ),

    BUILD_AUTO_RELOAD_CHANGES(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/buildAutoReloadChanges.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/buildAutoReloadChanges_dark.svg")
    ),

    BUILD_LOAD_CHANGES(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/buildLoadChanges.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/buildLoadChanges_dark.svg")
    ),

    CANCEL(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/cancel.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/cancel_dark.svg")
    ),

    CHANGE_VIEW(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/changeView.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/changeView_dark.svg")
    ),

    CHECK_MULTICARET(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/checkMulticaret.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/checkMulticaret_dark.svg")
    ),

    CHECK_OUT(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/checkOut.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/checkOut_dark.svg")
    ),

    CLOSE(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/close.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/close_dark.svg")
    ),

    CLOSE_HOVERED(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/closeHovered.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/closeHovered_dark.svg")
    ),

    CLOSE_DARK_GREY(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/closeDarkGrey.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/closeDarkGrey_dark.svg")
    ),

    COLLAPSE_ALL(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/collapseAll.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/collapseAll_dark.svg")
    ),

    COLORS(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/colors.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/colors_dark.svg")
    ),

    COMMIT(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/commit.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/commit_dark.svg")
    ),

    COMPILE(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/compile.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/compile_dark.svg")
    ),

    COPY(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/copy.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/copy_dark.svg")
    ),

    DELETE_TAG(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/deleteTag.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/deleteTag_dark.svg")
    ),

    DELETE_TAG_HOVER(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/deleteTagHover.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/deleteTagHover_dark.svg")
    ),

    DEPENDENCY_ANALYZER(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/dependencyAnalyzer.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/dependencyAnalyzer_dark.svg")
    ),

    DIAGRAM_DIFF(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/diagramDiff.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/diagramDiff_dark.svg")
    ),

    DIFF(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/diff.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/diff_dark.svg")
    ),

    DIFF_WITH_CLIPBOARD(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/diffWithClipBoard.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/diffWithClipBoard_dark.svg")
    ),

    DOWNLOAD(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/download.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/download_dark.svg")
    ),

    DUMP(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/dump.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/dump_dark.svg")
    ),

    DYNAMIC_USAGES(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/dynamicUsages.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/dynamicUsages_dark.svg")
    ),

    EDIT(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/edit.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/edit_dark.svg")
    ),

    EDIT_SCHEME(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/editScheme.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/editScheme_dark.svg")
    ),

    EDIT_SOURCE(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/editSource.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/editSource_dark.svg")
    ),

    EXECUTE(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/execute.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/execute_dark.svg")
    ),

    EXIT(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/exit.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/exit_dark.svg")
    ),

    EXPAND_ALL(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/expandAll.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/expandAll_dark.svg")
    ),

    FIND(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/find.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/find_dark.svg")
    ),

    FIND_AND_SHOW_NEXT_MATCHES(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/findAndShowNextMatches.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/findAndShowNextMatches_dark.svg")
    ),

    FIND_AND_SHOW_NEXT_MATCHES_SMALL(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/findAndShowNextMatchesSmall.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/findAndShowNextMatchesSmall_dark.svg")
    ),

    FIND_AND_SHOW_PREV_MATCHES(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/findAndShowPrevMatches.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/findAndShowPrevMatches_dark.svg")
    ),

    FIND_AND_SHOW_PREV_MATCHES_SMALL(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/findAndShowPrevMatchesSmall.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/findAndShowPrevMatchesSmall_dark.svg")
    ),

    FIND_BACKWARD(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/findBackward.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/findBackward_dark.svg")
    ),

    FIND_ENTIRE_FILE(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/findEntireFile.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/findEntireFile_dark.svg")
    ),

    FIND_FORWARD(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/findForward.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/findForward_dark.svg")
    ),

    FORCE_REFRESH(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/forceRefresh.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/forceRefresh_dark.svg")
    ),

    FORWARD(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/forward.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/forward_dark.svg")
    ),

    TRASHCAN(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/gc.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/gc_dark.svg")
    ),

    GENERATED_FOLDER(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/generatedFolder.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/generatedFolder_dark.svg")
    ),

    INLAY_DROP_TRIANGLE(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/inlayDropTriangle.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/inlayDropTriangle_dark.svg")
    ),

    INLAY_GEAR(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/inlayGear.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/inlayGear_dark.svg")
    ),

    INLAY_GLOBE(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/inlayGlobe.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/inlayGlobe_dark.svg")
    ),

    INLAY_RENAME_IN_COMMENTS(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/inlayRenameInComments.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/inlayRenameInComments_dark.svg")
    ),

    INLAY_RENAME_IN_COMMENTS_ACTIVE(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/inlayRenameInCommentsActive.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/inlayRenameInCommentsActive_dark.svg")
    ),

    INLAY_RENAME_IN_NO_CODE_FILES(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/inlayRenameInNoCodeFiles.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/inlayRenameInNoCodeFiles_dark.svg")
    ),

    INLAY_RENAME_IN_NO_CODE_FILES_ACTIVE(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/inlayRenameInNoCodeFilesActive.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/inlayRenameInNoCodeFilesActive_dark.svg")
    ),

    MATCH_CASE(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/matchCase.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/matchCase_dark.svg")
    ),

    MATCH_CASE_HOVERED(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/matchCaseHovered.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/matchCaseHovered_dark.svg")
    ),

    INLINE_DROP_FRAME(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/inlineDropFrame.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/inlineDropFrame_dark.svg")
    ),

    INLINE_DROP_FRAME_SELECTED(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/inlineDropFrameSelected.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/inlineDropFrameSelected_dark.svg")
    ),

    IN_SELECTION(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/inSelection.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/inSelection_dark.svg")
    ),

    INSTALL(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/install.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/install_dark.svg")
    ),

    INTENTION_BULB(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/intentionBulb.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/intentionBulb_dark.svg")
    ),

    INTENTION_BULB_GREY(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/intentionBulbGrey.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/intentionBulbGrey_dark.svg")
    ),

    LIGHTNING(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/lightning.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/lightning_dark.svg")
    ),

    LIST_CHANGE(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/listChange.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/listChange_dark.svg")
    ),

    LIST_FILES(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/listFiles.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/listFiles_dark.svg")
    ),

    GROUP_BY(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/groupBy.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/groupBy_dark.svg")
    ),

    GROUP_BY_CLASS(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/groupByClass.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/groupByClass_dark.svg")
    ),

    GROUP_BY_FILE(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/groupByFile.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/groupByFile_dark.svg")
    ),

    GROUP_BY_METHOD(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/groupByMethod.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/groupByMethod_dark.svg")
    ),

    GROUP_BY_MODULE(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/groupByModule.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/groupByModule_dark.svg")
    ),

    GROUP_BY_MODULE_GROUP(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/groupByModuleGroup.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/groupByModuleGroup_dark.svg")
    ),

    GROUP_BY_PACKAGE(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/groupByPackage.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/groupByPackage_dark.svg")
    ),

    GROUP_BY_PREFIX(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/groupByPrefix.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/groupByPrefix_dark.svg")
    ),

    GROUP_BY_TEST_PRODUCTION(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/groupByTestProduction.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/groupByTestProduction_dark.svg")
    ),

    HELP(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/help.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/help_dark.svg")
    ),

    HIGHLIGHTING(IconCollectionIdeaCategory.ACTIONS, Map.of(
            IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/highlighting.svg",
            IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/highlighting_dark.svg")
    ),

    ANGULAR(IconCollectionIdeaCategory.ANGULAR, Map.of(IconCollectionIdeaVariant.LIGHT, "media/icon/collection/idea/highlighting.svg", IconCollectionIdeaVariant.DARK, "media/icon/collection/idea/highlighting_dark.svg")
    );

    @Getter
    private final IconCollectionCategoryAware category;

    private final Map<Enum< ? extends IconCollectionVariantAware>, String> variants;

    IconCollectionIdea(final @NonNull IconCollectionCategoryAware category, final @NonNull Map<Enum<? extends IconCollectionVariantAware>, String> variants)
    {
        this.category = category;
        this.variants = variants;
    }

    @Override
    public String getVariant(Enum<? extends IconCollectionVariantAware> variant)
    {
        return variants.get(variant);
    }
}
