package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MindVision_68303 : Card() {
    override val id = 68303
    override val name = "心灵视界"
    override val description = "随机复制对手手牌中的一张牌，将其置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "你刚才做的事情我都看见了。"
    override val artist = "Michael Komarck"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2ceea26a3434da957c5ab39f563588135eea595db2950f6f68d539522a2d857e.png"
}
