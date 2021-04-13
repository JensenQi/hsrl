package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrimestreetEnforcer_40469 : Card() {
    override val id = 40469
    override val name = "污手街惩罚者"
    override val description = "在你的回合结束时，使你手牌中的所有随从牌获得+1/+1。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Msog
    override val background = "嘿，你的科多兽不能停在这里！罚你200金币！"
    override val artist = "Mike Azevedo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1d4005379e56c35b7041056deca5196e5d5deb4de8a1a8a37f56e726ad281f54.png"
}
