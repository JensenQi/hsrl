package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OilRigAmbusher_62887 : Card() {
    override val id = 62887
    override val name = "油田伏击者"
    override val description = "<b>战吼：</b>造成2点伤害。如果该牌在本回合进入你的手牌，则改为造成4点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "距离上一次事故：0天"
    override val artist = "Maria Trepalina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/004a5b88b8ad0528d8f7d7692776ec2ffb07c30f9e9ba4576115930c20cb9a1d.png"
}
