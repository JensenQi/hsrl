package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NefersetThrasher_53883 : Card() {
    override val id = 53883
    override val name = "尼斐塞特鞭笞者"
    override val description = "每当该随从进行攻击，对你的英雄造成3点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "我手执钢鞭将你打！"
    override val artist = "Eric Braddock"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5570e30e7d6e2b58398318089064dd10fda580dec8d7a2e6e8316c5b0d971009.png"
}
