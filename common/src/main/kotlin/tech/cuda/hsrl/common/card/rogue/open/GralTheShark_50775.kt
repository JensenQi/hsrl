package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GralTheShark_50775 : Card() {
    override val id = 50775
    override val name = "格罗尔，鲨鱼之神"
    override val description = "<b>战吼：</b>吞食一个你的牌库中的随从，并获得其属性值。<b>亡语：</b>将被吞食的随从置入手牌。"
    override var cost: Int? = 5
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RastakhansRumble
    override val background = "“……我们需要更大的甲板。”"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/38cfca047b70480e0d1bf083179839786ff62c5e18e26bd17c9f254f47cdc78a.png"
}
