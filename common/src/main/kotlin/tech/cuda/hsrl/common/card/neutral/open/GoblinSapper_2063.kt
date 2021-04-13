package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GoblinSapper_2063 : Card() {
    override val id = 2063
    override val name = "地精工兵"
    override val description = "如果你对手的手牌数量大于或等于6张，便具有+4攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "他已经不再是一个漫无目的的爆破狂人了，他认为每一次爆炸都应该有其社会意义，或者表明他对生命的态度。"
    override val artist = "Jesper Ejsing"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5145105df36c4ea9af9cad0a778928907c9c49ec401d1fc13fde059739659953.png"
}
