package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodTrollSapper_50070 : Card() {
    override val id = 50070
    override val name = "鲜血巨魔工兵"
    override val description = "在一个友方随从 死亡后，对敌方英雄造成2点伤害。"
    override var cost: Int? = 7
    override var health: Int? = 8
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.RastakhansRumble
    override val background = "纳兹米尔有名的血豆腐西施。"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/05f0d84f2477bbeb441db6203ccd08dcbc20fa9789c4d247a1fa9865ab28bcd3.png"
}
