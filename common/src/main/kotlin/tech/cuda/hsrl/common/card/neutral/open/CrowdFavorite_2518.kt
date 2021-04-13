package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrowdFavorite_2518 : Card() {
    override val id = 2518
    override val name = "人气选手"
    override val description = "每当你使用一张具有<b>战吼</b>的牌，便获得+1/+1。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "观众的喜怒哀乐有时也会影响到战局。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2c8a3f19bd9682f68c6417bc1d9f53a2b7cf62c26bf1e1ad5b8a6563f0fd2214.png"
}
