package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Arcanologist_69702 : Card() {
    override val id = 69702
    override val name = "秘法学家"
    override val description = "<b>战吼：</b>抽一张<b>奥秘</b>牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Core
    override val background = "你抽到什么了？嘘…那是个秘密。"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b89ba583f53d228c1f6e2ca1ffd3dc83d331202818b8a1f4bcf2b3d968962f7d.png"
}
