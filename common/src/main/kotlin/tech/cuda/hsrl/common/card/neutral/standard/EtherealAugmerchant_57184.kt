package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EtherealAugmerchant_57184 : Card() {
    override val id = 57184
    override val name = "虚灵改装师"
    override val description = "<b>战吼：</b>对一个随从造成1点伤害并使其获得<b>法术伤害+1</b>。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "没有受到过伤害的随从，没有资格谈论法术伤害。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6e6b563305d92e4ab61ed8bceaefb0bb3d59faae838d8fa24bd1099004c57362.png"
}
