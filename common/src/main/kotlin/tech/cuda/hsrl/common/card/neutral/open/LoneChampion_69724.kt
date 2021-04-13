package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LoneChampion_69724 : Card() {
    override val id = 69724
    override val name = "孤胆英雄"
    override val description = "<b>战吼：</b>如果你没有控制其他随从，则获得<b>嘲讽</b>和<b>圣盾</b>。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "问世间是否此山最高，或者另有高处比天高。"
    override val artist = "Jomaro Kindred"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/55016a6d42670cdb477922be116800bd61ef934099a4f24a394ec4bcb67d5de6.png"
}
