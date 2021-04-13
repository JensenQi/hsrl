package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DevourMind_42566 : Card() {
    override val id = 42566
    override val name = "吞噬意志"
    override val description = "复制你对手的牌库中的三张牌，并将其置入你的手牌。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Kotf
    override val background = "脑子不动会生锈，我来给你上点油！"
    override val artist = "Paul Kwon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8914f55d5e7ae8a3deb52a9df631314f50c59d6da111c8060fd5f15831c297a4.png"
}
