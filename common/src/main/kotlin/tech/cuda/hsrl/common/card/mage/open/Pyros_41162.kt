package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Pyros_41162 : Card() {
    override val id = 41162
    override val name = "派烙斯"
    override val description = "<b>亡语：</b>将该随从移回你的手牌，并变为法力值消耗为（6）点的6/6随从牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Ungoro
    override val background = "如果你杀死她，她会变得更强，强到…变成6/6这样。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4c97ad1ce532cd3fe8634b365112d750ae900899c33094b7198ad99a60d5f97d.png"
}
