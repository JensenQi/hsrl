package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LoneChampion_43473 : Card() {
    override val id = 43473
    override val name = "孤胆英雄"
    override val description = "<b>战吼：</b>如果你没有控制其他随从，则获得<b>嘲讽</b>和<b>圣盾</b>。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "问世间是否此山最高，或者另有高处比天高。"
    override val artist = "Jomaro Kindred"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c99183742407fe6929160899be07e717ed89ef9ba67786d001cefa3514f117dd.png"
}
