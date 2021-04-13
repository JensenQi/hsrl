package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DepthCharge_55428 : Card() {
    override val id = 55428
    override val name = "深潜炸弹"
    override val description = "在你的回合开始时，对所有随从造成 5点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 5
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "*并不能潜入牌库。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/475517d9aa02b676a4315b67ec7437895d783a0ffd95e136f9af568c1344bac4.png"
}
