package com.hemajoo.media.icon.collection.idea;

import com.hemajoo.utility.file.FileException;
import lombok.Getter;
import lombok.NonNull;

import javax.swing.*;

public enum IconCollectionIdea
{
    ANNOTATE("media/icon/collection/idea/annotate.svg", "media/icon/collection/idea/annotate_dark.svg"),
    ADD_FILE("media/icon/collection/idea/addFile.svg", "media/icon/collection/idea/addFile_dark.svg"),
    ADD_LIST("media/icon/collection/idea/addList.svg", "media/icon/collection/idea/addList_dark.svg"),
    ADD_MULTICARET("media/icon/collection/idea/addMulticaret.svg", "media/icon/collection/idea/addMulticaret_dark.svg"),
    ADD_TO_DICTIONARY("media/icon/collection/idea/addToDictionary.svg", "media/icon/collection/idea/addToDictionary_dark.svg"),
    ARROW_COLLAPSE("media/icon/collection/idea/arrowCollapse.svg", "media/icon/collection/idea/arrowCollapse_dark.svg"),
    ARROW_EXPAND("media/icon/collection/idea/arrowExpand.svg", "media/icon/collection/idea/arrowExpand_dark.svg"),
    BACK("media/icon/collection/idea/back.svg", "media/icon/collection/idea/back_dark.svg"),
    BUILD_AUTO_RELOAD_CHANGES("media/icon/collection/idea/buildAutoReloadChanges.svg", "media/icon/collection/idea/buildAutoReloadChanges_dark.svg"),
    BUILD_LOAD_CHANGES("media/icon/collection/idea/buildLoadChanges.svg", "media/icon/collection/idea/buildLoadChanges_dark.svg"),
    CANCEL("media/icon/collection/idea/cancel.svg", "media/icon/collection/idea/cancel_dark.svg"),
    CHANGE_VIEW("media/icon/collection/idea/changeView.svg", "media/icon/collection/idea/changeView_dark.svg"),
    CHECK_MULTICARET("media/icon/collection/idea/checkMulticaret.svg", "media/icon/collection/idea/checkMulticaret_dark.svg"),
    CHECK_OUT("media/icon/collection/idea/checkOut.svg", "media/icon/collection/idea/checkOut_dark.svg"),
    CLOSE("media/icon/collection/idea/close.svg", "media/icon/collection/idea/close_dark.svg"),
    CLOSE_HOVERED("media/icon/collection/idea/closeHovered.svg", "media/icon/collection/idea/closeHovered_dark.svg"),
    CLOSE_DARK_GREY("media/icon/collection/idea/closeDarkGrey.svg", "media/icon/collection/idea/closeDarkGrey_dark.svg"),
    COLLAPSE_ALL("media/icon/collection/idea/collapseAll.svg", "media/icon/collection/idea/collapseAll_dark.svg"),
    COLORS("media/icon/collection/idea/colors.svg", "media/icon/collection/idea/colors_dark.svg"),
    COMMIT("media/icon/collection/idea/commit.svg", "media/icon/collection/idea/commit_dark.svg"),
    COMPILE("media/icon/collection/idea/compile.svg", "media/icon/collection/idea/compile_dark.svg"),
    COPY("media/icon/collection/idea/copy.svg", "media/icon/collection/idea/copy_dark.svg"),
    DELETE_TAG("media/icon/collection/idea/deleteTag.svg", "media/icon/collection/idea/deleteTag_dark.svg"),
    DELETE_TAG_HOVER("media/icon/collection/idea/deleteTagHover.svg", "media/icon/collection/idea/deleteTagHover_dark.svg"),
    DEPENDENCY_ANALYZER("media/icon/collection/idea/dependencyAnalyzer.svg", "media/icon/collection/idea/dependencyAnalyzer_dark.svg"),
    DIAGRAM_DIFF("media/icon/collection/idea/diagramDiff.svg", "media/icon/collection/idea/diagramDiff_dark.svg"),
    DIFF("media/icon/collection/idea/diff.svg", "media/icon/collection/idea/diff_dark.svg"),
    DIFF_WITH_CLIPBOARD("media/icon/collection/idea/diffWithClipBoard.svg", "media/icon/collection/idea/diffWithClipBoard_dark.svg"),
    DOWNLOAD("media/icon/collection/idea/download.svg", "media/icon/collection/idea/download_dark.svg"),
    DUMP("media/icon/collection/idea/dump.svg", "media/icon/collection/idea/dump_dark.svg"),
    DYNAMIC_USAGES("media/icon/collection/idea/dynamicUsages.svg", "media/icon/collection/idea/dynamicUsages_dark.svg"),
    EDIT("media/icon/collection/idea/edit.svg", "media/icon/collection/idea/edit_dark.svg"),
    EDIT_SCHEME("media/icon/collection/idea/editScheme.svg", "media/icon/collection/idea/editScheme_dark.svg"),
    EDIT_SOURCE("media/icon/collection/idea/editSource.svg", "media/icon/collection/idea/editSource_dark.svg"),
    EXECUTE("media/icon/collection/idea/execute.svg", "media/icon/collection/idea/execute_dark.svg"),
    EXIT("media/icon/collection/idea/exit.svg", "media/icon/collection/idea/exit_dark.svg"),
    EXPAND_ALL("media/icon/collection/idea/expandAll.svg", "media/icon/collection/idea/expandAll_dark.svg"),
    FIND("media/icon/collection/idea/find.svg", "media/icon/collection/idea/find_dark.svg"),
    FIND_AND_SHOW_NEXT_MATCHES("media/icon/collection/idea/findAndShowNextMatches.svg", "media/icon/collection/idea/findAndShowNextMatches_dark.svg"),
    FIND_AND_SHOW_NEXT_MATCHES_SMALL("media/icon/collection/idea/findAndShowNextMatchesSmall.svg", "media/icon/collection/idea/findAndShowNextMatchesSmall_dark.svg"),
    FIND_AND_SHOW_PREV_MATCHES("media/icon/collection/idea/findAndShowPrevMatches.svg", "media/icon/collection/idea/findAndShowPrevMatches_dark.svg"),
    FIND_AND_SHOW_PREV_MATCHES_SMALL("media/icon/collection/idea/findAndShowPrevMatchesSmall.svg", "media/icon/collection/idea/findAndShowPrevMatchesSmall_dark.svg"),
    FIND_BACKWARD("media/icon/collection/idea/findBackward.svg", "media/icon/collection/idea/findBackward_dark.svg"),
    FIND_ENTIRE_FILE("media/icon/collection/idea/findEntireFile.svg", "media/icon/collection/idea/findEntireFile_dark.svg"),
    FIND_FORWARD("media/icon/collection/idea/findForward.svg", "media/icon/collection/idea/findForward_dark.svg"),
    FORCE_REFRESH("media/icon/collection/idea/forceRefresh.svg", "media/icon/collection/idea/forceRefresh_dark.svg"),
    FORWARD("media/icon/collection/idea/forward.svg", "media/icon/collection/idea/forward_dark.svg"),
    TRASHCAN("media/icon/collection/idea/gc.svg", "media/icon/collection/idea/gc_dark.svg"),
    GENERATED_FOLDER("media/icon/collection/idea/generatedFolder.svg", "media/icon/collection/idea/generatedFolder_dark.svg"),
    INLAY_DROP_TRIANGLE("media/icon/collection/idea/inlayDropTriangle.svg", "media/icon/collection/idea/inlayDropTriangle_dark.svg"),
    INLAY_GEAR("media/icon/collection/idea/inlayGear.svg", "media/icon/collection/idea/inlayGear_dark.svg"),
    INLAY_GLOBE("media/icon/collection/idea/inlayGlobe.svg", "media/icon/collection/idea/inlayGlobe_dark.svg"),
    INLAY_RENAME_IN_COMMENTS("media/icon/collection/idea/inlayRenameInComments.svg", "media/icon/collection/idea/inlayRenameInComments_dark.svg"),
    INLAY_RENAME_IN_COMMENTS_ACTIVE("media/icon/collection/idea/inlayRenameInCommentsActive.svg", "media/icon/collection/idea/inlayRenameInCommentsActive_dark.svg"),
    INLAY_RENAME_IN_NO_CODE_FILES("media/icon/collection/idea/inlayRenameInNoCodeFiles.svg", "media/icon/collection/idea/inlayRenameInNoCodeFiles_dark.svg"),
    INLAY_RENAME_IN_NO_CODE_FILES_ACTIVE("media/icon/collection/idea/inlayRenameInNoCodeFilesActive.svg", "media/icon/collection/idea/inlayRenameInNoCodeFilesActive_dark.svg"),
    MATCH_CASE("media/icon/collection/idea/matchCase.svg", "media/icon/collection/idea/matchCase_dark.svg"),
    MATCH_CASE_HOVERED("media/icon/collection/idea/matchCaseHovered.svg", "media/icon/collection/idea/matchCaseHovered_dark.svg"),
    INLINE_DROP_FRAME("media/icon/collection/idea/inlineDropFrame.svg", "media/icon/collection/idea/inlineDropFrame_dark.svg"),
    INLINE_DROP_FRAME_SELECTED("media/icon/collection/idea/inlineDropFrameSelected.svg", "media/icon/collection/idea/inlineDropFrameSelected_dark.svg"),
    IN_SELECTION("media/icon/collection/idea/inSelection.svg", "media/icon/collection/idea/inSelection_dark.svg"),
    INSTALL("media/icon/collection/idea/install.svg", "media/icon/collection/idea/install_dark.svg"),
    INTENTION_BULB("media/icon/collection/idea/intentionBulb.svg", "media/icon/collection/idea/intentionBulb_dark.svg"),
    INTENTION_BULB_GREY("media/icon/collection/idea/intentionBulbGrey.svg", "media/icon/collection/idea/intentionBulbGrey_dark.svg"),
    LIGHTNING("media/icon/collection/idea/lightning.svg", "media/icon/collection/idea/lightning_dark.svg"),
    LIST_CHANGE("media/icon/collection/idea/listChange.svg", "media/icon/collection/idea/listChange_dark.svg"),
    LIST_FILES("media/icon/collection/idea/listFiles.svg", "media/icon/collection/idea/listFiles_dark.svg"),

    GROUP_BY("media/icon/collection/idea/groupBy.svg", "media/icon/collection/idea/groupBy_dark.svg"),
    GROUP_BY_CLASS("media/icon/collection/idea/groupByClass.svg", "media/icon/collection/idea/groupByClass_dark.svg"),
    GROUP_BY_FILE("media/icon/collection/idea/groupByFile.svg", "media/icon/collection/idea/groupByFile_dark.svg"),
    GROUP_BY_METHOD("media/icon/collection/idea/groupByMethod.svg", "media/icon/collection/idea/groupByMethod_dark.svg"),
    GROUP_BY_MODULE("media/icon/collection/idea/groupByModule.svg", "media/icon/collection/idea/groupByModule_dark.svg"),
    GROUP_BY_MODULE_GROUP("media/icon/collection/idea/groupByModuleGroup.svg", "media/icon/collection/idea/groupByModuleGroup_dark.svg"),
    GROUP_BY_PACKAGE("media/icon/collection/idea/groupByPackage.svg", "media/icon/collection/idea/groupByPackage_dark.svg"),
    GROUP_BY_PREFIX("media/icon/collection/idea/groupByPrefix.svg", "media/icon/collection/idea/groupByPrefix_dark.svg"),
    GROUP_BY_TEST_PRODUCTION("media/icon/collection/idea/groupByTestProduction.svg", "media/icon/collection/idea/groupByTestProduction_dark.svg"),
    HELP("media/icon/collection/idea/help.svg", "media/icon/collection/idea/help_dark.svg"),
    HIGHLIGHTING("media/icon/collection/idea/highlighting.svg", "media/icon/collection/idea/highlighting_dark.svg"),


    UNKNOWN("Unknown", "Unknown");

    @Getter
    private final String name;

    @Getter
    private final String darkName;

    IconCollectionIdea(final @NonNull String name, final @NonNull String darkName)
    {
        this.name = name;
        this.darkName = darkName;
    }

    public Icon getIcon() throws FileException
    {
//        IPicture picture = Picture.builder()
//                .withFile(FileHelper.getFile(this.name))
//                .build();

        return new ImageIcon(this.name);
    }

    public Icon getIconDark()
    {
        return new ImageIcon(this.darkName);
    }
}
