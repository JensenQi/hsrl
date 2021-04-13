package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WhirlkickMaster_53627 : Card() {
    override val id = 53627
    override val name = "连环腿大师"
    override val description = "每当你使用一张<b>连击</b>牌时，随机将一张<b>连击</b>牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "连-连-连击！"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dc13606d9c33c9f6813ad007612761b5075eb243198615435fa480109751dd0d.png"
}
