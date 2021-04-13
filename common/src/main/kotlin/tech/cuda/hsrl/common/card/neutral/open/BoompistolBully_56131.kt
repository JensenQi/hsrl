package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BoompistolBully_56131 : Card() {
    override val id = 56131
    override val name = "持枪恶霸"
    override val description = "<b>战吼：</b>下个回合敌方<b>战吼</b>牌的法力值消耗增加（5）点。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "谁想用战吼打击她，她就用枪打击谁。"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b5f3ab80aef4ab6062087122ebb206a9ce215567cdef4d5f597fd45c6eac2038.png"
}
