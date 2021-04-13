package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeathSpeakerBlackthorn_63167 : Card() {
    override val id = 63167
    override val name = "亡语者布莱克松"
    override val description = "<b>战吼：</b>从你的牌库中召唤三个法力值消耗小于或等于（5）点的<b>亡语</b>随从。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "号称亡语者，却不认得“死”字。"
    override val artist = "Samwise Didier"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d2b8387e0deb1797e23402df6d4f12901e4ba912f97f74871d4a98e4cfe1b411.png"
}
