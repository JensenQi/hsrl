package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Burgle_2770 : Card() {
    override val id = 2770
    override val name = "剽窃"
    override val description = "随机将两张<i>（你对手职业的）</i>卡牌置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Tgt
    override val background = "妙手空空！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2f47237ac74c80a97161d2da6d86d4406411f144386845577f78c21e66339473.png"
}
