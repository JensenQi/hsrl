package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DalaranAspirant_2549 : Card() {
    override val id = 2549
    override val name = "达拉然铁骑士"
    override val description = "<b>激励：</b>获得<b>法术伤害+1</b>。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Tgt
    override val background = "达拉然的骑士身上也散发着魔法的气息。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f96b244bcb90dd458a84c4037a2c27e1f80daf1627601c33f0ce8f81ddd30d9a.png"
}
