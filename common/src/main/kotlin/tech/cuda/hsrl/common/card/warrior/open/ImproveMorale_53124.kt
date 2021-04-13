package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ImproveMorale_53124 : Card() {
    override val id = 53124
    override val name = "提振士气"
    override val description = "对一个随从造成 1点伤害。如果它依然存活，则将一张<b>跟班</b>牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RiseOfShadows
    override val background = "“这是网瘾，是病，得治。”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6963debc85b0c2304cd044ada50a43336c9dcb08d3ce6844e8293bd297fefdc1.png"
}
