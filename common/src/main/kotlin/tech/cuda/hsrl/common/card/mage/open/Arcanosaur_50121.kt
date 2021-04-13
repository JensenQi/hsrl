package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Arcanosaur_50121 : Card() {
    override val id = 50121
    override val name = "奥术暴龙"
    override val description = "<b>战吼：</b>如果你在上个回合使用过元素牌，则对所有其他随从造成3点伤害。"
    override var cost: Int? = 6
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RastakhansRumble
    override val background = "奥术……自会找到出路。"
    override val artist = "Ware Lee"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f72cf3df9f7d53a6873b508270a0b24569993a4d9bece2febe74e0097a7ee9c7.png"
}
