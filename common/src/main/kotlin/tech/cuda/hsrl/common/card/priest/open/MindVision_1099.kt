package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MindVision_1099 : Card() {
    override val id = 1099
    override val name = "心灵视界"
    override val description = "随机复制对手手牌中的一张牌，将其置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy1635
    override val background = "你刚才做的事情我都看见了。"
    override val artist = "Michael Komarck"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c0ffcd2285b61bdc32b1fb3ab247d2cfd9cae9e507b8233b09ab94eca5227677.png"
}
