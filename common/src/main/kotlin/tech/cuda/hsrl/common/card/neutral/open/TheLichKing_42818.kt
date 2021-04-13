package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheLichKing_42818 : Card() {
    override val id = 42818
    override val name = "巫妖王"
    override val description = "<b>嘲讽</b> 在你的回合结束时，随机将一张<b>死亡骑士</b>牌置入你的手牌。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "“我将我拥有的一切——愤怒，力量，意志，和8点攻击力——全部赐予你，我精心挑选的骑士。”"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/321dfeb30516e26f2b399ceb49174a69d59347f6824400987be751c2ebba43c4.png"
}
