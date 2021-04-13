package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Demonheart_1985 : Card() {
    override val id = 1985
    override val name = "恶魔之心"
    override val description = "对一个随从造成 5点伤害，如果该随从是友方恶魔，则改为使其获得+5/+5。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Gvg
    override val background = "能召唤出什么样的恶魔取决于术士的野心和运气。"
    override val artist = "Kerem Beyit"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a5bb231a9de3eca1d71590d7ef416929e9f0404b263a469b24b093024803fa35.png"
}
