package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PlagueOfFlames_54429 : Card() {
    override val id = 54429
    override val name = "火焰之灾祸"
    override val description = "消灭你的所有随从。每消灭一个随从，便随机消灭一个敌方随从。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "千难万险出古墓，烈火焚烧若等闲。"
    override val artist = "Armand Serrano"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/09520bdb202c8915f2749f4929ea01528ba762f5a5bfe72253540fe1461399b4.png"
}
