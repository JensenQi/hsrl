package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ProspectorsCaravan_62813 : Card() {
    override val id = 62813
    override val name = "勘探者车队"
    override val description = "在你的回合开始时，使你手牌中的所有随从牌获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "勘探者循着淘金热潮蜂拥而至，寻找着金色传说卡牌。"
    override val artist = "Tiffany Chiu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ea98cd2c44e6b5191e2e972c1031ce87afa07e9f8ba3d94f5f6054728a41ead0.png"
}
