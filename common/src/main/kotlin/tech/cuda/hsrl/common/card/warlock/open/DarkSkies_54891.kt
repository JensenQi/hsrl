package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkSkies_54891 : Card() {
    override val id = 54891
    override val name = "黑暗天际"
    override val description = "随机对一个随从造成 1点伤害。你每有一张手牌，就重复 一次。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“不过是一点火星，一片薄雾。仅此而已。”"
    override val artist = "Daria Tuzova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cbcc6ff6d2a927516bd273e8dd87f61e21c1b3a36f638185ffbc94da905eed42.png"
}
