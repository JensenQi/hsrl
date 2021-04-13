package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrandArchivist_46032 : Card() {
    override val id = 46032
    override val name = "资深档案管理员"
    override val description = "在你的回合结束时，从你的牌库中施放一张法术牌<i>（目标随机而定）</i>。"
    override var cost: Int? = 8
    override var health: Int? = 7
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "应聘条件：能找到尖顶帽子。"
    override val artist = "Ursula Dorada"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/898c5ecca22952d320ffc88b096914908f71a60bc157a613e5160370a1fe001c.png"
}
