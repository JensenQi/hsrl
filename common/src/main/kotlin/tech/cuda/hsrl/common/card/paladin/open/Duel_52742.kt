package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Duel_52742 : Card() {
    override val id = 52742
    override val name = "决斗"
    override val description = "从双方玩家的牌库中各召唤一个随从，并使其互相 攻击！"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RiseOfShadows
    override val background = "我要中单，不给就送。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/204da6c14eb88742a0a5affaf3aa5c21d55d05bacc29eb456c117da8e3eb8b61.png"
}
