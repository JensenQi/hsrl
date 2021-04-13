package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KeeningBanshee_46101 : Card() {
    override val id = 46101
    override val name = "哀泣女妖"
    override val description = "每当你使用一张牌，便移除你的牌库顶的三张牌。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "“你有什么能耐？”面试官问她。“噢，我对哭真的很在行。”"
    override val artist = "Jesper Ejsing"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a7f5aa695dba397d5942ae35e9dea19ff06b21b015153da49ad8bfa63bac78c4.png"
}
